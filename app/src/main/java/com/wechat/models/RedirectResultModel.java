package com.wechat.models;

import java.io.Serializable;

/**
 * Created by wiki on 2018/3/6.
 */

public class RedirectResultModel implements Serializable{
    /**
     *     <ret>0</ret>
     <message></message>
     <skey>@crypt_f59c819d_80789ee01c1192c90664c3e8c1ae02b4</skey>
     <wxsid>9eDdvFw3ve1TcZVo</wxsid>
     <wxuin>308209295</wxuin>
     <pass_ticket>SZDJ3FsXYZJklXwtnqeQqHn0nh0t1Cc5MJe3UDaDMGDXOquZR7Qx%2F%2FqEpgp0FtNn</pass_ticket>
     <isgrayscale>1</isgrayscale>
     */
    private int ret;
    private String message;
    private String skey;
    private String wxsid;
    private String wxuin;
    private String pass_ticket;
    private int isgrayscale;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }

    public String getWxsid() {
        return wxsid;
    }

    public void setWxsid(String wxsid) {
        this.wxsid = wxsid;
    }

    public String getWxuin() {
        return wxuin;
    }

    public void setWxuin(String wxuin) {
        this.wxuin = wxuin;
    }

    public String getPass_ticket() {
        return pass_ticket;
    }

    public void setPass_ticket(String pass_ticket) {
        this.pass_ticket = pass_ticket;
    }

    public int getIsgrayscale() {
        return isgrayscale;
    }

    public void setIsgrayscale(int isgrayscale) {
        this.isgrayscale = isgrayscale;
    }

    @Override
    public String toString() {
        return "RedirectResultModel{" +
                "ret=" + ret +
                ", message='" + message + '\'' +
                ", skey='" + skey + '\'' +
                ", wxsid='" + wxsid + '\'' +
                ", wxuin='" + wxuin + '\'' +
                ", pass_ticket='" + pass_ticket + '\'' +
                ", isgrayscale=" + isgrayscale +
                '}';
    }
}
