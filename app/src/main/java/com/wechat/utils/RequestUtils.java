package com.wechat.utils;

import android.net.Uri;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lzy.okgo.OkGo;
import com.wechat.App;
import com.wechat.activitys.MainActivity;
import com.wechat.models.ConfigModel;
import com.wechat.models.ContactModel;
import com.wechat.models.ContactsResponseModel;
import com.wechat.models.InitFinishModel;
import com.wechat.models.RedirectResultModel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import static com.wechat.App.COMMON_USERAGENT;
import static com.wechat.models.SendMessageModel.getRequestjSON;
import static com.wechat.models.UserinfoRequestBodyModel.getJson;
import static com.wechat.utils.JS.getConfigJS;
import static com.wechat.utils.JS.getUUIDJS;
import static com.wechat.utils.Utils.getStringInputStream;

/**
 * Created by wiki on 2018/3/9.
 */

public class RequestUtils {
    private static RedirectResultModel redirectResultModel;

    private static String deviceID;


    static {
        int a = (int) (Math.random() * 100);
        deviceID = "e" + String.valueOf(System.currentTimeMillis()) + String.valueOf(a);
    }
    /**
     * 启动页获取配置项
     * @return
     */
    public static Observable<String> requestConfig(){
        return Observable
                .just("https://wx.qq.com/")
                .subscribeOn(Schedulers.io())
                .map(new Function<String, Response>() {
                    @Override
                    public Response apply(String s) throws Exception {
                        return OkGo.<String>get(s).execute();
                    }
                })
                .map(new Function<Response, String>() {
                    @Override
                    public String apply(Response response) throws Exception {
                        String result = response.body().string();
                        int scriptStart = result.lastIndexOf("<script src=\"");
                        int scriptEnd = result.lastIndexOf("\"></script></body>");
                        String scriptSrc = result.substring(scriptStart+("<script src=\"".length()), scriptEnd);
                        return "https:" + scriptSrc;
                    }
                })
                .map(new Function<String, Response>() {
                    @Override
                    public Response apply(String s) throws Exception {
                        return OkGo.<String>get(s).execute();
                    }
                })
                .map(new Function<Response, String>() {
                    @Override
                    public String apply(Response response) throws Exception {
                        String content = response.body().string();
                        String configStartKey = "angular.module(\"Services\").factory(\"confFactory\",[\"$q\",function(e){"; // 配置内容开始位置匹配串
                        String configEndKey = "return angular.extend(r,{RES_IMG_DEFAULT:"; // 配置内容结束位置匹配串
                        int configStart = content.indexOf(configStartKey); // 开始配置
                        int configEnd = content.indexOf(configEndKey);     // 结束位置
                        return content.substring(configStart + configStartKey.length(), configEnd); // 配置内容
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) throws Exception {
                        return getConfigJS(s);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 获取二维码地址后面拼接的uuid
     * @return
     */
    public static Observable<String> requestUUID(){
        ConfigModel configModel = CacheUtil.getConfigModel();
        return Observable
                .just(configModel.getAPI_jsLogin())
                .subscribeOn(Schedulers.io())
                .map(new Function<String, okhttp3.Response>() {
                    @Override
                    public okhttp3.Response apply(String s) throws Exception {
                        return OkGo.<String>get(s).execute();
                    }
                })
                .map(new Function<okhttp3.Response, String>() {
                    @Override
                    public String apply(okhttp3.Response response) throws Exception {
                        return getUUIDJS(response.body().string());
                    }
                })
                .observeOn(AndroidSchedulers.mainThread());
    }

    /**
     * 轮询等待扫描接口
     * @return
     */
    public static Observable<String> requestWaitScan(){
        ConfigModel configModel = CacheUtil.getConfigModel();
        return Observable
                .just("")
                .subscribeOn(Schedulers.io())
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) throws Exception {
                        String uuid = CacheUtil.getUUID();
                        String scanResult = null;
                        //如果uuid不过期
                        while (!TextUtils.isEmpty(uuid) && TextUtils.isEmpty(scanResult)) {
                            String waitingScanUrl = configModel.getAPI_login() + "?loginicon=true&uuid=" + uuid + "&tip=0&r=446043870&_=" + System.currentTimeMillis();
                            try {
                                Response response = OkGo.<String>get(waitingScanUrl).execute();
                                String result = response.body().string();
                                if (result.indexOf("window.code=201;") != -1) {
                                    //已扫码，待登录
                                }
                                if (result.indexOf("window.code=200;") != -1) {
                                    scanResult = result;
                                }
                            } catch (IOException e) {
                            }
                        }
                        return scanResult;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<String> requestAuthInfo(String redirecuUri){
        String host = Uri.parse(redirecuUri).getHost();
        String requestUrl = "https://" + host;
        String requestReferer = "https://" + host + "/";
        CacheUtil.saveRequestUrl(requestUrl);
        CacheUtil.saveRequestReferer(requestReferer);
        return Observable
                .just(redirecuUri)
                .subscribeOn(Schedulers.io())
                .map(new Function<String, Response>() {
                    @Override
                    public Response apply(String s) throws Exception {
                        return OkGo.<String>get(s).execute();
                    }
                })
                .map(new Function<Response, String>() {
                    @Override
                    public String apply(Response response) throws Exception {
                        return response.body().string();
                    }
                })
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) throws Exception {
                        InputStream inputStream = getStringInputStream(s);
                        redirectResultModel = XmlParse.readXML(inputStream);
                        return requestUrl + CacheUtil.getConfigModel().getAPI_webwxinit() + "&pass_ticket=" + redirectResultModel.getPass_ticket();
                    }
                })
                .map(new Function<String, Response>() {
                    @Override
                    public Response apply(String s) throws Exception {
                        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                        RequestBody body = RequestBody.create(JSON, getJson(redirectResultModel, deviceID));
                        Request request = new Request.Builder()
                                .addHeader("User-Agent", COMMON_USERAGENT)
                                .url(s)
                                .method("POST", body)
                                .build();
                        return ClientManager.getDefaultHttpClient().newCall(request).execute();
                    }
                })
                .map(new Function<Response, String>() {
                    @Override
                    public String apply(Response response) throws Exception {
                        String result = response.body().string();
                        InitFinishModel initFinishModel = new Gson().fromJson(result, new TypeToken<InitFinishModel>() {
                        }.getType());
                        CacheUtil.saveInitModel(initFinishModel);
                        return "1";
                    }
                })
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<List<ContactModel>> requestContacts(){
        return Observable
                .just("")
                .subscribeOn(Schedulers.io())
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) throws Exception {
                        return CacheUtil.getRequestUrl() + CacheUtil.getConfigModel().getAPI_webwxgetcontact() + "?r=" + System.currentTimeMillis() + "&seq=0&skey=" + redirectResultModel.getSkey();
                    }
                })
                .map(new Function<String, Response>() {
                    @Override
                    public Response apply(String url) throws Exception {
                        return OkGo.<String>get(url)
                                .headers("referer", CacheUtil.getRequestReferer())
                                .execute();
                    }
                })
                .map(new Function<Response, List<ContactModel>>() {
                    @Override
                    public List<ContactModel> apply(Response response) throws Exception {
                        String result = response.body().string();
                        ContactsResponseModel contactsResponseModel = new Gson().fromJson(result, new TypeToken<ContactsResponseModel>() {
                        }.getType());
                        return contactsResponseModel.getMemberList();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<String> requestSendMessage(List<ContactModel> contactModels){
        return Observable
                .just(contactModels)
                .subscribeOn(Schedulers.io())
                .map(new Function<List<ContactModel>, String>() {
                    @Override
                    public String apply(List<ContactModel> contactModels) throws Exception {
                        return CacheUtil.getRequestUrl() + CacheUtil.getConfigModel().getAPI_webwxsendmsg() + "?pass_ticket=" + redirectResultModel.getPass_ticket();
                    }
                })
                .map(new Function<String, List<okhttp3.Request>>() {
                    @Override
                    public List<okhttp3.Request> apply(String s) throws Exception {
                        List<okhttp3.Request> requests = new ArrayList<>();
                        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
                        for(ContactModel model : contactModels){
                            String json = getRequestjSON(redirectResultModel, deviceID, CacheUtil.getInitModel().getUser().getUserName(), model.getUserName(), "早安！");
                            RequestBody body = RequestBody.create(JSON, json);
                            okhttp3.Request request = new Request.Builder()
                                    .addHeader("User-Agent", COMMON_USERAGENT)
                                    .addHeader("json", CacheUtil.getRequestReferer())
                                    .addHeader("Referer", CacheUtil.getRequestReferer())
                                    .url(s)
                                    .method("POST", body)
                                    .build();
                            requests.add(request);
                        }
                        return requests;
                    }
                })
                .map(new Function<List<Request>, String>() {
                    @Override
                    public String apply(List<Request> requests) throws Exception {
                        for(Request request : requests){
                            ClientManager.getDefaultHttpClient().newCall(request).execute();
                        }
                        return "1";
                    }
                })
                .observeOn(AndroidSchedulers.mainThread());
    }
}
