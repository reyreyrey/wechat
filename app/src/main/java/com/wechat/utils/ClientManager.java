package com.wechat.utils;


import com.lzy.okgo.cookie.CookieJarImpl;
import com.lzy.okgo.cookie.store.MemoryCookieStore;
import com.lzy.okgo.https.HttpsUtils;
import com.lzy.okgo.interceptor.HttpLoggingInterceptor;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;


/**
 * author: Rea.X
 * date: 2017/7/19.
 */

public class ClientManager {

    private static OkHttpClient defaultClient;

    private static OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();


        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor("HttpLog");
        interceptor.setPrintLevel(HttpLoggingInterceptor.Level.BODY);
        interceptor.setColorLevel(Level.INFO);
        builder.addInterceptor(interceptor);
        builder.cookieJar(new CookieJarImpl(new MemoryCookieStore()));
        builder.followRedirects(false);
        builder.followSslRedirects(false);
        builder.readTimeout(30 * 1000, TimeUnit.MILLISECONDS);
        builder.writeTimeout(30 * 1000, TimeUnit.MILLISECONDS);
        builder.connectTimeout(30 * 1000, TimeUnit.MILLISECONDS);
        builder.connectionPool(new ConnectionPool(10, 2 * 60 * 1000, TimeUnit.MILLISECONDS));
        HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory();
        builder.sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager);
        builder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
        return builder.build();
    }


    public static OkHttpClient getDefaultHttpClient() {
        if (defaultClient == null)
            defaultClient = getOkHttpClient();
        return defaultClient;
    }
}
