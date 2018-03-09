package com.wechat.activitys;

import android.content.Intent;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wechat.base.UIActivity;
import com.wechat.models.ConfigModel;
import com.wechat.utils.CacheUtil;
import com.wechat.utils.LogUtil;
import com.wechat.wiki.wechat.R;
import com.wechat.wiki.wechat.databinding.ActivitySplashBinding;

import io.reactivex.functions.Consumer;

import static com.wechat.utils.RequestUtils.requestConfig;

/**
 * Created by wiki on 2018/3/6.
 */

public class SplashActivity extends UIActivity<ActivitySplashBinding> {
    private WebView webView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void init() {
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        readConfig();
    }

    private void readConfig() {
        requestConfig()
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String js) throws Exception {
                        webView.evaluateJavascript(js, new ValueCallback<String>() {
                            @Override
                            public void onReceiveValue(String value) {
                                ConfigModel configModel = new Gson().fromJson(value, new TypeToken<ConfigModel>() {
                                }.getType());
                                CacheUtil.saveConfigModel(configModel);
                                if (configModel != null) {
                                    toMain();
                                }
                            }
                        });
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        LogUtil.e(throwable.getCause().toString());
                    }
                });

    }

    private void toMain() {
        Intent intent = new Intent(context, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
