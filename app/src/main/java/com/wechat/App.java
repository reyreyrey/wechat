package com.wechat;

import android.app.Application;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.HttpHeaders;
import com.wechat.utils.ClientManager;
import com.wechat.utils.activity_manager.ActivityManager;

/**
 * Created by wiki on 2018/3/6.
 */

public class App extends Application{

    static public String APPID = "wx782c26e4c19acffb";
    static public String COMMON_REFERER = "https://web.wechat.com/";
    static public String COMMON_USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_2) AppleWebKit/604.4.7 (KHTML, like Gecko) Version/11.0.2 Safari/604.4.7";
    private static Application application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        ActivityManager.startWatcher(this);
        OkGo.getInstance()
                .setOkHttpClient(ClientManager.getDefaultHttpClient())
                .addCommonHeaders(new HttpHeaders("User-Agent", COMMON_USERAGENT))
                .init(this);
    }

    public static Application getContext(){
        return application;
    }
}
