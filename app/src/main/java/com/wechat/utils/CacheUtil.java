package com.wechat.utils;

import com.wechat.App;
import com.wechat.models.ConfigModel;
import com.wechat.models.InitFinishModel;

import java.util.HashMap;

/**
 * Created by wiki on 2018/3/6.
 */

public class CacheUtil {
    private static ACache aCache;
    static{
        aCache = ACache.get(App.getContext());
    }

    static private HashMap<String, Object> localCache;
    static private String KEY_CONFIG = "config_model";
    static private String KEY_REQUEST_URL = "request_url";
    static private String KEY_REQUEST_REFERER = "request_referer";
    static private String KEY_INIT_MODEL = "init_model";



    static private String KEY_UUID = "ACACHE_UUID";
    static private int UUID_EXPLT_TIME = 5 * 60;

    static {
        localCache = new HashMap<>();
    }
    //UUID 5分钟过期
    public static void saveUUID(String uuid){
        aCache.put(KEY_UUID, uuid, UUID_EXPLT_TIME);
    }

    public static String getUUID(){
        return aCache.getAsString(KEY_UUID);
    }
    /////////////
    private static void save(String key, Object value){
        localCache.put(key, value);
        SharedPreferencesUtils.saveObject(App.getContext(), key, value);
    }
    private static Object get(String key){
        if(localCache.containsKey(key) && localCache.get(key) != null){
            return localCache.get(key);
        }
        return SharedPreferencesUtils.readObject(App.getContext(), key);
    }

    public static void saveConfigModel(ConfigModel configModel){
        save(KEY_CONFIG, configModel);
    }

    public static ConfigModel getConfigModel(){
        Object object = get(KEY_CONFIG);
        if(object != null && object instanceof ConfigModel)
            return (ConfigModel) object;
        return null;
    }

    public static void saveInitModel(InitFinishModel model){
        save(KEY_INIT_MODEL, model);
    }

    public static InitFinishModel getInitModel(){
        Object object = get(KEY_INIT_MODEL);
        if(object != null && object instanceof InitFinishModel)
            return (InitFinishModel) object;
        return null;
    }

    public static void saveRequestUrl(String url){
        save(KEY_REQUEST_URL, url);
    }
    public static String getRequestUrl(){
        Object object = get(KEY_REQUEST_URL);
        if(object != null && object instanceof String)
            return (String) object;
        return null;
    }
    public static void saveRequestReferer(String referer){
        save(KEY_REQUEST_REFERER, referer);
    }
    public static String getRequestReferer(){
        Object object = get(KEY_REQUEST_REFERER);
        if(object != null && object instanceof String)
            return (String) object;
        return null;
    }
}
