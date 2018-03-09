package com.wechat.utils;

/**
 * Created by wiki on 2018/3/6.
 */

public class JS {

    private static final String CONFIG_JS = "(function () {\n" +
            "    var location = {\n" +
            "        \"href\":\"https://wx.qq.com/\",\n" +
            "        \"ancestorOrigins\":{},\n" +
            "        \"origin\":\"https://wx.qq.com\",\n" +
            "        \"protocol\":\"https:\",\n" +
            "        \"host\":\"wx.qq.com\",\n" +
            "        \"hostname\":\"wx.qq.com\",\n" +
            "        \"port\":\"\",\n" +
            "        \"pathname\":\"/\",\n" +
            "        \"search\":\"\",\n" +
            "        \"hash\":\"\",\n" +
            "        toString(){\n" +
            "            return this.href\n" +
            "        }\n" +
            "    },\n" +
            "    navigator={\n" +
            "        language: \"zh-CN\", \n" +
            "        browserLanguage: \"zh-CN\"\n" +
            "    };\n" +
            "    %1$s \n" +
            "    return r\n" +
            "})()";

    public static String getConfigJS(String s){
        return String.format(CONFIG_JS, s);
    }



    static final String UUID_JS = "(function () {\n" +
            "\tlet window = {QRLogin:{}}\n" +
            "            %1$s \n" +
            "            return window.QRLogin\n" +
            "})()";

    public static String getUUIDJS(String s){
        return String.format(UUID_JS, s);
    }

    static final String AVG_JS = "";

    static final String REDIRECT_URI_JS = "(function () {\n" +
            "\tlet window = {}\n" +
            "            %1$s \n" +
            "            return window\n" +
            "})()";

    public static String getRedirectUriJS(String s){
        return String.format(REDIRECT_URI_JS, s);
    }
}
