package com.wechat.models;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by wiki on 2018/3/9.
 */

public class SendMessageModel implements Serializable{

    /**
     * BaseRequest : {"Uin":"uin","Sid":"sid","Skey":"key","DeviceID":"deviceID"}
     * Msg : {"Type":1,"Content":"1","FromUserName":"userName","ToUserName":"memberUserName","LocalID":"msgId","ClientMsgId":"msgId"}
     * Scene : 0
     */
    public static String getRequestjSON(RedirectResultModel redirectResultModel, String deviceID, String currentusername, String toUserName, String content){
        SendMessageModel sendMessageModel = new SendMessageModel();
        sendMessageModel.setScene(0);

        BaseRequestBean baseRequestBean = new BaseRequestBean();
        baseRequestBean.setDeviceID(deviceID);
        baseRequestBean.setSid(redirectResultModel.getWxsid());
        baseRequestBean.setSkey(redirectResultModel.getSkey());
        baseRequestBean.setUin(redirectResultModel.getWxuin());
        sendMessageModel.setBaseRequest(baseRequestBean);

        long messageid = System.currentTimeMillis() + (int)(Math.random() * 1000);
        MsgBean bean = new MsgBean();
        bean.setType(1);
        bean.setContent(content);
        bean.setFromUserName(currentusername);
        bean.setToUserName(toUserName);
        bean.setClientMsgId(String.valueOf(messageid));
        bean.setLocalID(String.valueOf(messageid));
        sendMessageModel.setMsg(bean);
        return new Gson().toJson(sendMessageModel);
    }

    private BaseRequestBean BaseRequest;
    private MsgBean Msg;
    private int Scene;

    public BaseRequestBean getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(BaseRequestBean BaseRequest) {
        this.BaseRequest = BaseRequest;
    }

    public MsgBean getMsg() {
        return Msg;
    }

    public void setMsg(MsgBean Msg) {
        this.Msg = Msg;
    }

    public int getScene() {
        return Scene;
    }

    public void setScene(int Scene) {
        this.Scene = Scene;
    }

    public static class BaseRequestBean {
        /**
         * Uin : uin
         * Sid : sid
         * Skey : key
         * DeviceID : deviceID
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

    public static class MsgBean {
        /**
         * Type : 1
         * Content : 1
         * FromUserName : userName
         * ToUserName : memberUserName
         * LocalID : msgId
         * ClientMsgId : msgId
         */

        private int Type;
        private String Content;
        private String FromUserName;
        private String ToUserName;
        private String LocalID;
        private String ClientMsgId;

        public int getType() {
            return Type;
        }

        public void setType(int Type) {
            this.Type = Type;
        }

        public String getContent() {
            return Content;
        }

        public void setContent(String Content) {
            this.Content = Content;
        }

        public String getFromUserName() {
            return FromUserName;
        }

        public void setFromUserName(String FromUserName) {
            this.FromUserName = FromUserName;
        }

        public String getToUserName() {
            return ToUserName;
        }

        public void setToUserName(String ToUserName) {
            this.ToUserName = ToUserName;
        }

        public String getLocalID() {
            return LocalID;
        }

        public void setLocalID(String LocalID) {
            this.LocalID = LocalID;
        }

        public String getClientMsgId() {
            return ClientMsgId;
        }

        public void setClientMsgId(String ClientMsgId) {
            this.ClientMsgId = ClientMsgId;
        }
    }
}
