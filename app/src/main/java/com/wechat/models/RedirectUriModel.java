package com.wechat.models;

import java.io.Serializable;

/**
 * Created by wiki on 2018/3/6.
 */

public class RedirectUriModel implements Serializable{
    /**
     * code : 200
     * redirect_uri : https://wx.qq.com/cgi-bin/mmwebwx-bin/webwxnewloginpage?ticket=ARiVX8NGB_7kQ-BW9p1Qha-A@qrticket_0&uuid=4ZkWqnmWSA==&lang=zh_CN&scan=1520316735
     */

    private int code;
    private String redirect_uri;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }
}
