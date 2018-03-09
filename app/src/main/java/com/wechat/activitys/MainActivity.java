package com.wechat.activitys;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.wechat.base.UIActivity;
import com.wechat.models.ConfigModel;
import com.wechat.models.ContactModel;
import com.wechat.models.ContactsResponseModel;
import com.wechat.models.InitFinishModel;
import com.wechat.models.RedirectResultModel;
import com.wechat.models.RedirectUriModel;
import com.wechat.models.UUIDModel;
import com.wechat.utils.CacheUtil;
import com.wechat.utils.ClientManager;
import com.wechat.utils.LogUtil;
import com.wechat.utils.RequestUtils;
import com.wechat.utils.XmlParse;
import com.wechat.wiki.wechat.R;
import com.wechat.wiki.wechat.databinding.ActivityMainBinding;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static com.wechat.App.COMMON_USERAGENT;
import static com.wechat.models.SendMessageModel.getRequestjSON;
import static com.wechat.models.UserinfoRequestBodyModel.getJson;
import static com.wechat.utils.JS.getRedirectUriJS;
import static com.wechat.utils.JS.getUUIDJS;
import static com.wechat.utils.RequestUtils.requestContacts;
import static com.wechat.utils.RequestUtils.requestSendMessage;
import static com.wechat.utils.RequestUtils.requestWaitScan;
import static com.wechat.utils.Utils.getStringInputStream;

public class MainActivity extends UIActivity<ActivityMainBinding> {

    private WebView webView;
    private List<ContactModel> contactModels;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        contactModels = new ArrayList<>();
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        tvBack.setVisibility(View.GONE);
        requestUUID();
    }

    /**
     * 获取二维码地址后面拼接的uuid
     */
    private void requestUUID() {
        RequestUtils.requestUUID()
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        webView.evaluateJavascript(s, new ValueCallback<String>() {
                            @Override
                            public void onReceiveValue(String value) {
                                UUIDModel uuidModel = new Gson().fromJson(value, UUIDModel.class);
                                if (uuidModel != null && uuidModel.getCode() == 200) {
                                    CacheUtil.saveUUID(uuidModel.getUuid());
                                    String imgQrcode = "https://login.weixin.qq.com/qrcode/" + uuidModel.getUuid();
                                    Glide.with(context).load(imgQrcode).into(databinding.imgErweima);
                                    waitScan();
                                }
                            }
                        });
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });
    }

    /**
     * 轮询请求是否已经扫描
     */
    private void waitScan() {
        requestWaitScan()
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        webView.evaluateJavascript(getRedirectUriJS(s), new ValueCallback<String>() {
                            @Override
                            public void onReceiveValue(String value) {
                                RedirectUriModel redirectUriModel = new Gson().fromJson(value, RedirectUriModel.class);
                                if (redirectUriModel != null && redirectUriModel.getCode() == 200) {
                                    String redirecuUri = redirectUriModel.getRedirect_uri();
                                    requestAuthInfo(redirecuUri);
                                }
                            }
                        });
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });
    }

    /**
     * 请求认证信息
     * @param redirecuUri
     */
    private void requestAuthInfo(final String redirecuUri) {
        RequestUtils.requestAuthInfo(redirecuUri)
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String response) throws Exception {
                        InitFinishModel initFinishModel = CacheUtil.getInitModel();
                        for(ContactModel model : initFinishModel.getContactList()){
                            if(model.getMemberCount() > 1){
                                contactModels.add(model);
                            }
                        }
                        getContacts();
                    }
                });
    }

    /**
     * 获取联系人列表
     */
    private void getContacts() {
        requestContacts()
                .subscribe(new Consumer<List<ContactModel>>() {
                    @Override
                    public void accept(List<ContactModel> models) throws Exception {
                        contactModels.addAll(models);
                        sendMessage();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        LogUtil.e("::::"+throwable.getCause().toString());
                    }
                });
    }

    /**
     * 发送消息
     */
    private void sendMessage(){
        requestSendMessage(contactModels)
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        Toast.makeText(context, "发送成功！！！", Toast.LENGTH_LONG).show();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        LogUtil.e("发送失败：：："+throwable.getCause().toString());
                    }
                });
    }
}
