package com.wechat.models;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Random;

import static com.wechat.utils.Utils.getFixLenthString;

/**
 * Created by wiki on 2018/3/6.
 */

public class UserinfoRequestBodyModel implements Serializable {


    /**
     * BaseRequest : {"Uin":"","Sid":"","Skey":"","DeviceID":""}
     */

    private BaseRequestBean BaseRequest;

    public BaseRequestBean getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(BaseRequestBean BaseRequest) {
        this.BaseRequest = BaseRequest;
    }

    public static String getJson(RedirectResultModel model, String deviceid) {
        UserinfoRequestBodyModel userinfoRequestBodyModel = new UserinfoRequestBodyModel();
        BaseRequestBean BaseRequest = new BaseRequestBean();
        BaseRequest.setUin(model.getWxuin());
        BaseRequest.setSid(model.getWxsid());
        BaseRequest.setSkey(model.getSkey());
        BaseRequest.setDeviceID(deviceid);
        userinfoRequestBodyModel.setBaseRequest(BaseRequest);
        return new Gson().toJson(userinfoRequestBodyModel);
    }

    public static class BaseRequestBean {
        /**
         * Uin :
         * Sid :
         * Skey :
         * DeviceID :
         */

        private String Uin;
        private String Sid;
        private String Skey;
        private String DeviceID;

        public String getUin() {
            return Uin;
        }

        public void setUin(String Uin) {
            this.Uin = Uin;
        }

        public String getSid() {
            return Sid;
        }

        public void setSid(String Sid) {
            this.Sid = Sid;
        }

        public String getSkey() {
            return Skey;
        }

        public void setSkey(String Skey) {
            this.Skey = Skey;
        }

        public String getDeviceID() {
            return DeviceID;
        }

        public void setDeviceID(String DeviceID) {
            this.DeviceID = DeviceID;
        }
    }
}
