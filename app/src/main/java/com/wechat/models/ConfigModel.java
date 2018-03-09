package com.wechat.models;

import java.io.Serializable;

/**
 * Created by wiki on 2018/3/6.
 */

public class ConfigModel implements Serializable{
    /**
     * ADDSCENE_PF_CONTACT : 6
     * ADDSCENE_PF_EMAIL : 5
     * ADDSCENE_PF_GROUP : 8
     * ADDSCENE_PF_MOBILE : 10
     * ADDSCENE_PF_QQ : 4
     * ADDSCENE_PF_UNKNOWN : 9
     * ADDSCENE_PF_WEB : 33
     * ADDSCENE_PF_WEIXIN : 7
     * API_checkupload : /cgi-bin/mmwebwx-bin/webwxcheckupload
     * API_jsLogin : https://login.wx.qq.com/jslogin?appid=wx782c26e4c19acffb&redirect_uri=https%3A%2F%2Fwx.qq.com%2Fcgi-bin%2Fmmwebwx-bin%2Fwebwxnewloginpage&fun=new&lang=zh_CN
     * API_login : https://login.wx.qq.com/cgi-bin/mmwebwx-bin/login
     * API_synccheck : https://webpush.wx.qq.com/cgi-bin/mmwebwx-bin/synccheck
     * API_webwxbatchgetcontact : /cgi-bin/mmwebwx-bin/webwxbatchgetcontact
     * API_webwxcheckurl : /cgi-bin/mmwebwx-bin/webwxcheckurl
     * API_webwxcreatechatroom : /cgi-bin/mmwebwx-bin/webwxcreatechatroom
     * API_webwxdownloadmedia : https://file.wx.qq.com/cgi-bin/mmwebwx-bin/webwxgetmedia
     * API_webwxfeedback : /cgi-bin/mmwebwx-bin/webwxsendfeedback
     * API_webwxgetcontact : /cgi-bin/mmwebwx-bin/webwxgetcontact
     * API_webwxgetheadimg : /cgi-bin/mmwebwx-bin/webwxgetheadimg
     * API_webwxgeticon : /cgi-bin/mmwebwx-bin/webwxgeticon
     * API_webwxgetmedia : /cgi-bin/mmwebwx-bin/webwxgetmedia
     * API_webwxgetmsgimg : /cgi-bin/mmwebwx-bin/webwxgetmsgimg
     * API_webwxgetvideo : /cgi-bin/mmwebwx-bin/webwxgetvideo
     * API_webwxgetvoice : /cgi-bin/mmwebwx-bin/webwxgetvoice
     * API_webwxinit : /cgi-bin/mmwebwx-bin/webwxinit?r=105875215
     * API_webwxlogout : /cgi-bin/mmwebwx-bin/webwxlogout
     * API_webwxoplog : /cgi-bin/mmwebwx-bin/webwxoplog
     * API_webwxpreview : /cgi-bin/mmwebwx-bin/webwxpreview
     * API_webwxpushloginurl : /cgi-bin/mmwebwx-bin/webwxpushloginurl
     * API_webwxreport : /cgi-bin/mmwebwx-bin/webwxstatreport
     * API_webwxrevokemsg : /cgi-bin/mmwebwx-bin/webwxrevokemsg
     * API_webwxsearch : /cgi-bin/mmwebwx-bin/webwxsearchcontact
     * API_webwxsendappmsg : /cgi-bin/mmwebwx-bin/webwxsendappmsg
     * API_webwxsendemoticon : /cgi-bin/mmwebwx-bin/webwxsendemoticon
     * API_webwxsendmsg : /cgi-bin/mmwebwx-bin/webwxsendmsg
     * API_webwxsendmsgimg : /cgi-bin/mmwebwx-bin/webwxsendmsgimg
     * API_webwxsendmsgvedio : /cgi-bin/mmwebwx-bin/webwxsendvideomsg
     * API_webwxstatusnotify : /cgi-bin/mmwebwx-bin/webwxstatusnotify
     * API_webwxsync : /cgi-bin/mmwebwx-bin/webwxsync
     * API_webwxupdatechatroom : /cgi-bin/mmwebwx-bin/webwxupdatechatroom
     * API_webwxuploadmedia : https://file.wx.qq.com/cgi-bin/mmwebwx-bin/webwxuploadmedia
     * API_webwxverifyuser : /cgi-bin/mmwebwx-bin/webwxverifyuser
     * APPMSGTYPE_ATTACH : 6
     * APPMSGTYPE_AUDIO : 3
     * APPMSGTYPE_CARD_TICKET : 16
     * APPMSGTYPE_EMOJI : 8
     * APPMSGTYPE_EMOTION : 15
     * APPMSGTYPE_GOOD : 13
     * APPMSGTYPE_IMG : 2
     * APPMSGTYPE_OPEN : 7
     * APPMSGTYPE_READER_TYPE : 100001
     * APPMSGTYPE_REALTIME_SHARE_LOCATION : 17
     * APPMSGTYPE_RED_ENVELOPES : 2001
     * APPMSGTYPE_SCAN_GOOD : 10
     * APPMSGTYPE_TEXT : 1
     * APPMSGTYPE_TRANSFERS : 2000
     * APPMSGTYPE_URL : 5
     * APPMSGTYPE_VIDEO : 4
     * APPMSGTYPE_VOICE_REMIND : 9
     * CHATROOM_NOTIFY_CLOSE : 0
     * CHATROOM_NOTIFY_OPEN : 1
     * CONTACTFLAG_3RDAPPCONTACT : 128
     * CONTACTFLAG_BLACKLISTCONTACT : 8
     * CONTACTFLAG_CHATCONTACT : 2
     * CONTACTFLAG_CHATROOMCONTACT : 4
     * CONTACTFLAG_CONTACT : 1
     * CONTACTFLAG_DOMAINCONTACT : 16
     * CONTACTFLAG_FAVOURCONTACT : 64
     * CONTACTFLAG_HIDECONTACT : 32
     * CONTACTFLAG_NOTIFYCLOSECONTACT : 512
     * CONTACTFLAG_SNSBLACKLISTCONTACT : 256
     * CONTACTFLAG_TOPCONTACT : 2048
     * EMOJI_FLAG_GIF : 2
     * EMOTICON_REG : img\sclass="(qq)?emoji (qq)?emoji([\da-f]*?)"\s(text="[^<>(\s]*")?\s?src="[^<>(\s]*"\s*
     * KEYCODE_ADD : 187
     * KEYCODE_ARROW_DOWN : 40
     * KEYCODE_ARROW_LEFT : 37
     * KEYCODE_ARROW_RIGHT : 39
     * KEYCODE_ARROW_UP : 38
     * KEYCODE_AT : 64
     * KEYCODE_BACKSPACE : 8
     * KEYCODE_DELETE : 34
     * KEYCODE_ENTER : 13
     * KEYCODE_ESC : 27
     * KEYCODE_MINUS : 189
     * KEYCODE_NUM2 : 50
     * KEYCODE_NUM_ADD : 107
     * KEYCODE_NUM_MINUS : 109
     * KEYCODE_SHIFT : 16
     * LANG : zh_CN
     * MM_DATA_APPMSG : 49
     * MM_DATA_EMOJI : 47
     * MM_DATA_HTML : 2
     * MM_DATA_IMG : 3
     * MM_DATA_LOCATION : 48
     * MM_DATA_MICROVIDEO : 62
     * MM_DATA_POSSIBLEFRIEND_MSG : 40
     * MM_DATA_PRIVATEMSG_HTML : 12
     * MM_DATA_PRIVATEMSG_IMG : 13
     * MM_DATA_PRIVATEMSG_TEXT : 11
     * MM_DATA_PUSHMAIL : 35
     * MM_DATA_PUSHSYSTEMMSG : 38
     * MM_DATA_QMSG : 36
     * MM_DATA_QQLIXIANMSG_IMG : 39
     * MM_DATA_RECALLED : 10002
     * MM_DATA_SHARECARD : 42
     * MM_DATA_STATUSNOTIFY : 51
     * MM_DATA_SYS : 10000
     * MM_DATA_SYSNOTICE : 9999
     * MM_DATA_TEXT : 1
     * MM_DATA_VERIFYMSG : 37
     * MM_DATA_VIDEO : 43
     * MM_DATA_VIDEO_IPHONE_EXPORT : 44
     * MM_DATA_VOICEMSG : 34
     * MM_DATA_VOIPINVITE : 53
     * MM_DATA_VOIPMSG : 50
     * MM_DATA_VOIPNOTIFY : 52
     * MM_EMOTICON_WEB : _web
     * MM_NOTIFY_CLOSE : 0
     * MM_NOTIFY_OPEN : 1
     * MM_SEND_FILE_STATUS_CANCEL : 4
     * MM_SEND_FILE_STATUS_FAIL : 3
     * MM_SEND_FILE_STATUS_QUEUED : 0
     * MM_SEND_FILE_STATUS_SENDING : 1
     * MM_SEND_FILE_STATUS_SUCCESS : 2
     * MM_SOUND_CLOSE : 0
     * MM_SOUND_OPEN : 1
     * MM_USERATTRVERIFYFALG_BIZ : 1
     * MM_USERATTRVERIFYFALG_BIZ_BIG : 4
     * MM_USERATTRVERIFYFALG_BIZ_BRAND : 8
     * MM_USERATTRVERIFYFALG_BIZ_VERIFIED : 16
     * MM_USERATTRVERIFYFALG_FAMOUS : 2
     * MSGTYPE_APP : 49
     * MSGTYPE_EMOTICON : 47
     * MSGTYPE_IMAGE : 3
     * MSGTYPE_LOCATION : 48
     * MSGTYPE_MICROVIDEO : 62
     * MSGTYPE_POSSIBLEFRIEND_MSG : 40
     * MSGTYPE_RECALLED : 10002
     * MSGTYPE_SHARECARD : 42
     * MSGTYPE_STATUSNOTIFY : 51
     * MSGTYPE_SYS : 10000
     * MSGTYPE_SYSNOTICE : 9999
     * MSGTYPE_TEXT : 1
     * MSGTYPE_VERIFYMSG : 37
     * MSGTYPE_VIDEO : 43
     * MSGTYPE_VOICE : 34
     * MSGTYPE_VOIPINVITE : 53
     * MSGTYPE_VOIPMSG : 50
     * MSGTYPE_VOIPNOTIFY : 52
     * MSG_SEND_STATUS_FAIL : 5
     * MSG_SEND_STATUS_READY : 0
     * MSG_SEND_STATUS_SENDING : 1
     * MSG_SEND_STATUS_SUCC : 2
     * PROFILE_BITFLAG_CHANGE : 190
     * PROFILE_BITFLAG_NOCHANGE : 0
     * RES_PATH : /zh_CN/htmledition/v2/
     * SP_CONTACT_FILE_HELPER : filehelper
     * SP_CONTACT_NEWSAPP : newsapp
     * SP_CONTACT_RECOMMEND_HELPER : fmessage
     * StatusNotifyCode_ENTER_SESSION : 2
     * StatusNotifyCode_INITED : 3
     * StatusNotifyCode_QUIT_SESSION : 5
     * StatusNotifyCode_READED : 1
     * StatusNotifyCode_SYNC_CONV : 4
     * TIMEOUT_SYNC_CHECK : 0
     * UPLOAD_MEDIA_TYPE_ATTACHMENT : 4
     * UPLOAD_MEDIA_TYPE_AUDIO : 3
     * UPLOAD_MEDIA_TYPE_IMAGE : 1
     * UPLOAD_MEDIA_TYPE_VIDEO : 2
     * VERIFYUSER_OPCODE_ADDCONTACT : 1
     * VERIFYUSER_OPCODE_RECVERREPLY : 6
     * VERIFYUSER_OPCODE_SENDERREPLY : 5
     * VERIFYUSER_OPCODE_SENDREQUEST : 2
     * VERIFYUSER_OPCODE_VERIFYOK : 3
     * VERIFYUSER_OPCODE_VERIFYREJECT : 4
     * oplogCmdId : {"MODREMARKNAME":2,"TOPCONTACT":3}
     */

    private int ADDSCENE_PF_CONTACT;
    private int ADDSCENE_PF_EMAIL;
    private int ADDSCENE_PF_GROUP;
    private int ADDSCENE_PF_MOBILE;
    private int ADDSCENE_PF_QQ;
    private int ADDSCENE_PF_UNKNOWN;
    private int ADDSCENE_PF_WEB;
    private int ADDSCENE_PF_WEIXIN;
    private String API_checkupload;
    private String API_jsLogin;
    private String API_login;
    private String API_synccheck;
    private String API_webwxbatchgetcontact;
    private String API_webwxcheckurl;
    private String API_webwxcreatechatroom;
    private String API_webwxdownloadmedia;
    private String API_webwxfeedback;
    private String API_webwxgetcontact;
    private String API_webwxgetheadimg;
    private String API_webwxgeticon;
    private String API_webwxgetmedia;
    private String API_webwxgetmsgimg;
    private String API_webwxgetvideo;
    private String API_webwxgetvoice;
    private String API_webwxinit;
    private String API_webwxlogout;
    private String API_webwxoplog;
    private String API_webwxpreview;
    private String API_webwxpushloginurl;
    private String API_webwxreport;
    private String API_webwxrevokemsg;
    private String API_webwxsearch;
    private String API_webwxsendappmsg;
    private String API_webwxsendemoticon;
    private String API_webwxsendmsg;
    private String API_webwxsendmsgimg;
    private String API_webwxsendmsgvedio;
    private String API_webwxstatusnotify;
    private String API_webwxsync;
    private String API_webwxupdatechatroom;
    private String API_webwxuploadmedia;
    private String API_webwxverifyuser;
    private int APPMSGTYPE_ATTACH;
    private int APPMSGTYPE_AUDIO;
    private int APPMSGTYPE_CARD_TICKET;
    private int APPMSGTYPE_EMOJI;
    private int APPMSGTYPE_EMOTION;
    private int APPMSGTYPE_GOOD;
    private int APPMSGTYPE_IMG;
    private int APPMSGTYPE_OPEN;
    private int APPMSGTYPE_READER_TYPE;
    private int APPMSGTYPE_REALTIME_SHARE_LOCATION;
    private int APPMSGTYPE_RED_ENVELOPES;
    private int APPMSGTYPE_SCAN_GOOD;
    private int APPMSGTYPE_TEXT;
    private int APPMSGTYPE_TRANSFERS;
    private int APPMSGTYPE_URL;
    private int APPMSGTYPE_VIDEO;
    private int APPMSGTYPE_VOICE_REMIND;
    private int CHATROOM_NOTIFY_CLOSE;
    private int CHATROOM_NOTIFY_OPEN;
    private int CONTACTFLAG_3RDAPPCONTACT;
    private int CONTACTFLAG_BLACKLISTCONTACT;
    private int CONTACTFLAG_CHATCONTACT;
    private int CONTACTFLAG_CHATROOMCONTACT;
    private int CONTACTFLAG_CONTACT;
    private int CONTACTFLAG_DOMAINCONTACT;
    private int CONTACTFLAG_FAVOURCONTACT;
    private int CONTACTFLAG_HIDECONTACT;
    private int CONTACTFLAG_NOTIFYCLOSECONTACT;
    private int CONTACTFLAG_SNSBLACKLISTCONTACT;
    private int CONTACTFLAG_TOPCONTACT;
    private int EMOJI_FLAG_GIF;
    private String EMOTICON_REG;
    private int KEYCODE_ADD;
    private int KEYCODE_ARROW_DOWN;
    private int KEYCODE_ARROW_LEFT;
    private int KEYCODE_ARROW_RIGHT;
    private int KEYCODE_ARROW_UP;
    private int KEYCODE_AT;
    private int KEYCODE_BACKSPACE;
    private int KEYCODE_DELETE;
    private int KEYCODE_ENTER;
    private int KEYCODE_ESC;
    private int KEYCODE_MINUS;
    private int KEYCODE_NUM2;
    private int KEYCODE_NUM_ADD;
    private int KEYCODE_NUM_MINUS;
    private int KEYCODE_SHIFT;
    private String LANG;
    private int MM_DATA_APPMSG;
    private int MM_DATA_EMOJI;
    private int MM_DATA_HTML;
    private int MM_DATA_IMG;
    private int MM_DATA_LOCATION;
    private int MM_DATA_MICROVIDEO;
    private int MM_DATA_POSSIBLEFRIEND_MSG;
    private int MM_DATA_PRIVATEMSG_HTML;
    private int MM_DATA_PRIVATEMSG_IMG;
    private int MM_DATA_PRIVATEMSG_TEXT;
    private int MM_DATA_PUSHMAIL;
    private int MM_DATA_PUSHSYSTEMMSG;
    private int MM_DATA_QMSG;
    private int MM_DATA_QQLIXIANMSG_IMG;
    private int MM_DATA_RECALLED;
    private int MM_DATA_SHARECARD;
    private int MM_DATA_STATUSNOTIFY;
    private int MM_DATA_SYS;
    private int MM_DATA_SYSNOTICE;
    private int MM_DATA_TEXT;
    private int MM_DATA_VERIFYMSG;
    private int MM_DATA_VIDEO;
    private int MM_DATA_VIDEO_IPHONE_EXPORT;
    private int MM_DATA_VOICEMSG;
    private int MM_DATA_VOIPINVITE;
    private int MM_DATA_VOIPMSG;
    private int MM_DATA_VOIPNOTIFY;
    private String MM_EMOTICON_WEB;
    private int MM_NOTIFY_CLOSE;
    private int MM_NOTIFY_OPEN;
    private int MM_SEND_FILE_STATUS_CANCEL;
    private int MM_SEND_FILE_STATUS_FAIL;
    private int MM_SEND_FILE_STATUS_QUEUED;
    private int MM_SEND_FILE_STATUS_SENDING;
    private int MM_SEND_FILE_STATUS_SUCCESS;
    private int MM_SOUND_CLOSE;
    private int MM_SOUND_OPEN;
    private int MM_USERATTRVERIFYFALG_BIZ;
    private int MM_USERATTRVERIFYFALG_BIZ_BIG;
    private int MM_USERATTRVERIFYFALG_BIZ_BRAND;
    private int MM_USERATTRVERIFYFALG_BIZ_VERIFIED;
    private int MM_USERATTRVERIFYFALG_FAMOUS;
    private int MSGTYPE_APP;
    private int MSGTYPE_EMOTICON;
    private int MSGTYPE_IMAGE;
    private int MSGTYPE_LOCATION;
    private int MSGTYPE_MICROVIDEO;
    private int MSGTYPE_POSSIBLEFRIEND_MSG;
    private int MSGTYPE_RECALLED;
    private int MSGTYPE_SHARECARD;
    private int MSGTYPE_STATUSNOTIFY;
    private int MSGTYPE_SYS;
    private int MSGTYPE_SYSNOTICE;
    private int MSGTYPE_TEXT;
    private int MSGTYPE_VERIFYMSG;
    private int MSGTYPE_VIDEO;
    private int MSGTYPE_VOICE;
    private int MSGTYPE_VOIPINVITE;
    private int MSGTYPE_VOIPMSG;
    private int MSGTYPE_VOIPNOTIFY;
    private int MSG_SEND_STATUS_FAIL;
    private int MSG_SEND_STATUS_READY;
    private int MSG_SEND_STATUS_SENDING;
    private int MSG_SEND_STATUS_SUCC;
    private int PROFILE_BITFLAG_CHANGE;
    private int PROFILE_BITFLAG_NOCHANGE;
    private String RES_PATH;
    private String SP_CONTACT_FILE_HELPER;
    private String SP_CONTACT_NEWSAPP;
    private String SP_CONTACT_RECOMMEND_HELPER;
    private int StatusNotifyCode_ENTER_SESSION;
    private int StatusNotifyCode_INITED;
    private int StatusNotifyCode_QUIT_SESSION;
    private int StatusNotifyCode_READED;
    private int StatusNotifyCode_SYNC_CONV;
    private int TIMEOUT_SYNC_CHECK;
    private int UPLOAD_MEDIA_TYPE_ATTACHMENT;
    private int UPLOAD_MEDIA_TYPE_AUDIO;
    private int UPLOAD_MEDIA_TYPE_IMAGE;
    private int UPLOAD_MEDIA_TYPE_VIDEO;
    private int VERIFYUSER_OPCODE_ADDCONTACT;
    private int VERIFYUSER_OPCODE_RECVERREPLY;
    private int VERIFYUSER_OPCODE_SENDERREPLY;
    private int VERIFYUSER_OPCODE_SENDREQUEST;
    private int VERIFYUSER_OPCODE_VERIFYOK;
    private int VERIFYUSER_OPCODE_VERIFYREJECT;
    private OplogCmdIdBean oplogCmdId;

    public int getADDSCENE_PF_CONTACT() {
        return ADDSCENE_PF_CONTACT;
    }

    public void setADDSCENE_PF_CONTACT(int ADDSCENE_PF_CONTACT) {
        this.ADDSCENE_PF_CONTACT = ADDSCENE_PF_CONTACT;
    }

    public int getADDSCENE_PF_EMAIL() {
        return ADDSCENE_PF_EMAIL;
    }

    public void setADDSCENE_PF_EMAIL(int ADDSCENE_PF_EMAIL) {
        this.ADDSCENE_PF_EMAIL = ADDSCENE_PF_EMAIL;
    }

    public int getADDSCENE_PF_GROUP() {
        return ADDSCENE_PF_GROUP;
    }

    public void setADDSCENE_PF_GROUP(int ADDSCENE_PF_GROUP) {
        this.ADDSCENE_PF_GROUP = ADDSCENE_PF_GROUP;
    }

    public int getADDSCENE_PF_MOBILE() {
        return ADDSCENE_PF_MOBILE;
    }

    public void setADDSCENE_PF_MOBILE(int ADDSCENE_PF_MOBILE) {
        this.ADDSCENE_PF_MOBILE = ADDSCENE_PF_MOBILE;
    }

    public int getADDSCENE_PF_QQ() {
        return ADDSCENE_PF_QQ;
    }

    public void setADDSCENE_PF_QQ(int ADDSCENE_PF_QQ) {
        this.ADDSCENE_PF_QQ = ADDSCENE_PF_QQ;
    }

    public int getADDSCENE_PF_UNKNOWN() {
        return ADDSCENE_PF_UNKNOWN;
    }

    public void setADDSCENE_PF_UNKNOWN(int ADDSCENE_PF_UNKNOWN) {
        this.ADDSCENE_PF_UNKNOWN = ADDSCENE_PF_UNKNOWN;
    }

    public int getADDSCENE_PF_WEB() {
        return ADDSCENE_PF_WEB;
    }

    public void setADDSCENE_PF_WEB(int ADDSCENE_PF_WEB) {
        this.ADDSCENE_PF_WEB = ADDSCENE_PF_WEB;
    }

    public int getADDSCENE_PF_WEIXIN() {
        return ADDSCENE_PF_WEIXIN;
    }

    public void setADDSCENE_PF_WEIXIN(int ADDSCENE_PF_WEIXIN) {
        this.ADDSCENE_PF_WEIXIN = ADDSCENE_PF_WEIXIN;
    }

    public String getAPI_checkupload() {
        return API_checkupload;
    }

    public void setAPI_checkupload(String API_checkupload) {
        this.API_checkupload = API_checkupload;
    }

    public String getAPI_jsLogin() {
        return API_jsLogin;
    }

    public void setAPI_jsLogin(String API_jsLogin) {
        this.API_jsLogin = API_jsLogin;
    }

    public String getAPI_login() {
        return API_login;
    }

    public void setAPI_login(String API_login) {
        this.API_login = API_login;
    }

    public String getAPI_synccheck() {
        return API_synccheck;
    }

    public void setAPI_synccheck(String API_synccheck) {
        this.API_synccheck = API_synccheck;
    }

    public String getAPI_webwxbatchgetcontact() {
        return API_webwxbatchgetcontact;
    }

    public void setAPI_webwxbatchgetcontact(String API_webwxbatchgetcontact) {
        this.API_webwxbatchgetcontact = API_webwxbatchgetcontact;
    }

    public String getAPI_webwxcheckurl() {
        return API_webwxcheckurl;
    }

    public void setAPI_webwxcheckurl(String API_webwxcheckurl) {
        this.API_webwxcheckurl = API_webwxcheckurl;
    }

    public String getAPI_webwxcreatechatroom() {
        return API_webwxcreatechatroom;
    }

    public void setAPI_webwxcreatechatroom(String API_webwxcreatechatroom) {
        this.API_webwxcreatechatroom = API_webwxcreatechatroom;
    }

    public String getAPI_webwxdownloadmedia() {
        return API_webwxdownloadmedia;
    }

    public void setAPI_webwxdownloadmedia(String API_webwxdownloadmedia) {
        this.API_webwxdownloadmedia = API_webwxdownloadmedia;
    }

    public String getAPI_webwxfeedback() {
        return API_webwxfeedback;
    }

    public void setAPI_webwxfeedback(String API_webwxfeedback) {
        this.API_webwxfeedback = API_webwxfeedback;
    }

    public String getAPI_webwxgetcontact() {
        return API_webwxgetcontact;
    }

    public void setAPI_webwxgetcontact(String API_webwxgetcontact) {
        this.API_webwxgetcontact = API_webwxgetcontact;
    }

    public String getAPI_webwxgetheadimg() {
        return API_webwxgetheadimg;
    }

    public void setAPI_webwxgetheadimg(String API_webwxgetheadimg) {
        this.API_webwxgetheadimg = API_webwxgetheadimg;
    }

    public String getAPI_webwxgeticon() {
        return API_webwxgeticon;
    }

    public void setAPI_webwxgeticon(String API_webwxgeticon) {
        this.API_webwxgeticon = API_webwxgeticon;
    }

    public String getAPI_webwxgetmedia() {
        return API_webwxgetmedia;
    }

    public void setAPI_webwxgetmedia(String API_webwxgetmedia) {
        this.API_webwxgetmedia = API_webwxgetmedia;
    }

    public String getAPI_webwxgetmsgimg() {
        return API_webwxgetmsgimg;
    }

    public void setAPI_webwxgetmsgimg(String API_webwxgetmsgimg) {
        this.API_webwxgetmsgimg = API_webwxgetmsgimg;
    }

    public String getAPI_webwxgetvideo() {
        return API_webwxgetvideo;
    }

    public void setAPI_webwxgetvideo(String API_webwxgetvideo) {
        this.API_webwxgetvideo = API_webwxgetvideo;
    }

    public String getAPI_webwxgetvoice() {
        return API_webwxgetvoice;
    }

    public void setAPI_webwxgetvoice(String API_webwxgetvoice) {
        this.API_webwxgetvoice = API_webwxgetvoice;
    }

    public String getAPI_webwxinit() {
        return API_webwxinit;
    }

    public void setAPI_webwxinit(String API_webwxinit) {
        this.API_webwxinit = API_webwxinit;
    }

    public String getAPI_webwxlogout() {
        return API_webwxlogout;
    }

    public void setAPI_webwxlogout(String API_webwxlogout) {
        this.API_webwxlogout = API_webwxlogout;
    }

    public String getAPI_webwxoplog() {
        return API_webwxoplog;
    }

    public void setAPI_webwxoplog(String API_webwxoplog) {
        this.API_webwxoplog = API_webwxoplog;
    }

    public String getAPI_webwxpreview() {
        return API_webwxpreview;
    }

    public void setAPI_webwxpreview(String API_webwxpreview) {
        this.API_webwxpreview = API_webwxpreview;
    }

    public String getAPI_webwxpushloginurl() {
        return API_webwxpushloginurl;
    }

    public void setAPI_webwxpushloginurl(String API_webwxpushloginurl) {
        this.API_webwxpushloginurl = API_webwxpushloginurl;
    }

    public String getAPI_webwxreport() {
        return API_webwxreport;
    }

    public void setAPI_webwxreport(String API_webwxreport) {
        this.API_webwxreport = API_webwxreport;
    }

    public String getAPI_webwxrevokemsg() {
        return API_webwxrevokemsg;
    }

    public void setAPI_webwxrevokemsg(String API_webwxrevokemsg) {
        this.API_webwxrevokemsg = API_webwxrevokemsg;
    }

    public String getAPI_webwxsearch() {
        return API_webwxsearch;
    }

    public void setAPI_webwxsearch(String API_webwxsearch) {
        this.API_webwxsearch = API_webwxsearch;
    }

    public String getAPI_webwxsendappmsg() {
        return API_webwxsendappmsg;
    }

    public void setAPI_webwxsendappmsg(String API_webwxsendappmsg) {
        this.API_webwxsendappmsg = API_webwxsendappmsg;
    }

    public String getAPI_webwxsendemoticon() {
        return API_webwxsendemoticon;
    }

    public void setAPI_webwxsendemoticon(String API_webwxsendemoticon) {
        this.API_webwxsendemoticon = API_webwxsendemoticon;
    }

    public String getAPI_webwxsendmsg() {
        return API_webwxsendmsg;
    }

    public void setAPI_webwxsendmsg(String API_webwxsendmsg) {
        this.API_webwxsendmsg = API_webwxsendmsg;
    }

    public String getAPI_webwxsendmsgimg() {
        return API_webwxsendmsgimg;
    }

    public void setAPI_webwxsendmsgimg(String API_webwxsendmsgimg) {
        this.API_webwxsendmsgimg = API_webwxsendmsgimg;
    }

    public String getAPI_webwxsendmsgvedio() {
        return API_webwxsendmsgvedio;
    }

    public void setAPI_webwxsendmsgvedio(String API_webwxsendmsgvedio) {
        this.API_webwxsendmsgvedio = API_webwxsendmsgvedio;
    }

    public String getAPI_webwxstatusnotify() {
        return API_webwxstatusnotify;
    }

    public void setAPI_webwxstatusnotify(String API_webwxstatusnotify) {
        this.API_webwxstatusnotify = API_webwxstatusnotify;
    }

    public String getAPI_webwxsync() {
        return API_webwxsync;
    }

    public void setAPI_webwxsync(String API_webwxsync) {
        this.API_webwxsync = API_webwxsync;
    }

    public String getAPI_webwxupdatechatroom() {
        return API_webwxupdatechatroom;
    }

    public void setAPI_webwxupdatechatroom(String API_webwxupdatechatroom) {
        this.API_webwxupdatechatroom = API_webwxupdatechatroom;
    }

    public String getAPI_webwxuploadmedia() {
        return API_webwxuploadmedia;
    }

    public void setAPI_webwxuploadmedia(String API_webwxuploadmedia) {
        this.API_webwxuploadmedia = API_webwxuploadmedia;
    }

    public String getAPI_webwxverifyuser() {
        return API_webwxverifyuser;
    }

    public void setAPI_webwxverifyuser(String API_webwxverifyuser) {
        this.API_webwxverifyuser = API_webwxverifyuser;
    }

    public int getAPPMSGTYPE_ATTACH() {
        return APPMSGTYPE_ATTACH;
    }

    public void setAPPMSGTYPE_ATTACH(int APPMSGTYPE_ATTACH) {
        this.APPMSGTYPE_ATTACH = APPMSGTYPE_ATTACH;
    }

    public int getAPPMSGTYPE_AUDIO() {
        return APPMSGTYPE_AUDIO;
    }

    public void setAPPMSGTYPE_AUDIO(int APPMSGTYPE_AUDIO) {
        this.APPMSGTYPE_AUDIO = APPMSGTYPE_AUDIO;
    }

    public int getAPPMSGTYPE_CARD_TICKET() {
        return APPMSGTYPE_CARD_TICKET;
    }

    public void setAPPMSGTYPE_CARD_TICKET(int APPMSGTYPE_CARD_TICKET) {
        this.APPMSGTYPE_CARD_TICKET = APPMSGTYPE_CARD_TICKET;
    }

    public int getAPPMSGTYPE_EMOJI() {
        return APPMSGTYPE_EMOJI;
    }

    public void setAPPMSGTYPE_EMOJI(int APPMSGTYPE_EMOJI) {
        this.APPMSGTYPE_EMOJI = APPMSGTYPE_EMOJI;
    }

    public int getAPPMSGTYPE_EMOTION() {
        return APPMSGTYPE_EMOTION;
    }

    public void setAPPMSGTYPE_EMOTION(int APPMSGTYPE_EMOTION) {
        this.APPMSGTYPE_EMOTION = APPMSGTYPE_EMOTION;
    }

    public int getAPPMSGTYPE_GOOD() {
        return APPMSGTYPE_GOOD;
    }

    public void setAPPMSGTYPE_GOOD(int APPMSGTYPE_GOOD) {
        this.APPMSGTYPE_GOOD = APPMSGTYPE_GOOD;
    }

    public int getAPPMSGTYPE_IMG() {
        return APPMSGTYPE_IMG;
    }

    public void setAPPMSGTYPE_IMG(int APPMSGTYPE_IMG) {
        this.APPMSGTYPE_IMG = APPMSGTYPE_IMG;
    }

    public int getAPPMSGTYPE_OPEN() {
        return APPMSGTYPE_OPEN;
    }

    public void setAPPMSGTYPE_OPEN(int APPMSGTYPE_OPEN) {
        this.APPMSGTYPE_OPEN = APPMSGTYPE_OPEN;
    }

    public int getAPPMSGTYPE_READER_TYPE() {
        return APPMSGTYPE_READER_TYPE;
    }

    public void setAPPMSGTYPE_READER_TYPE(int APPMSGTYPE_READER_TYPE) {
        this.APPMSGTYPE_READER_TYPE = APPMSGTYPE_READER_TYPE;
    }

    public int getAPPMSGTYPE_REALTIME_SHARE_LOCATION() {
        return APPMSGTYPE_REALTIME_SHARE_LOCATION;
    }

    public void setAPPMSGTYPE_REALTIME_SHARE_LOCATION(int APPMSGTYPE_REALTIME_SHARE_LOCATION) {
        this.APPMSGTYPE_REALTIME_SHARE_LOCATION = APPMSGTYPE_REALTIME_SHARE_LOCATION;
    }

    public int getAPPMSGTYPE_RED_ENVELOPES() {
        return APPMSGTYPE_RED_ENVELOPES;
    }

    public void setAPPMSGTYPE_RED_ENVELOPES(int APPMSGTYPE_RED_ENVELOPES) {
        this.APPMSGTYPE_RED_ENVELOPES = APPMSGTYPE_RED_ENVELOPES;
    }

    public int getAPPMSGTYPE_SCAN_GOOD() {
        return APPMSGTYPE_SCAN_GOOD;
    }

    public void setAPPMSGTYPE_SCAN_GOOD(int APPMSGTYPE_SCAN_GOOD) {
        this.APPMSGTYPE_SCAN_GOOD = APPMSGTYPE_SCAN_GOOD;
    }

    public int getAPPMSGTYPE_TEXT() {
        return APPMSGTYPE_TEXT;
    }

    public void setAPPMSGTYPE_TEXT(int APPMSGTYPE_TEXT) {
        this.APPMSGTYPE_TEXT = APPMSGTYPE_TEXT;
    }

    public int getAPPMSGTYPE_TRANSFERS() {
        return APPMSGTYPE_TRANSFERS;
    }

    public void setAPPMSGTYPE_TRANSFERS(int APPMSGTYPE_TRANSFERS) {
        this.APPMSGTYPE_TRANSFERS = APPMSGTYPE_TRANSFERS;
    }

    public int getAPPMSGTYPE_URL() {
        return APPMSGTYPE_URL;
    }

    public void setAPPMSGTYPE_URL(int APPMSGTYPE_URL) {
        this.APPMSGTYPE_URL = APPMSGTYPE_URL;
    }

    public int getAPPMSGTYPE_VIDEO() {
        return APPMSGTYPE_VIDEO;
    }

    public void setAPPMSGTYPE_VIDEO(int APPMSGTYPE_VIDEO) {
        this.APPMSGTYPE_VIDEO = APPMSGTYPE_VIDEO;
    }

    public int getAPPMSGTYPE_VOICE_REMIND() {
        return APPMSGTYPE_VOICE_REMIND;
    }

    public void setAPPMSGTYPE_VOICE_REMIND(int APPMSGTYPE_VOICE_REMIND) {
        this.APPMSGTYPE_VOICE_REMIND = APPMSGTYPE_VOICE_REMIND;
    }

    public int getCHATROOM_NOTIFY_CLOSE() {
        return CHATROOM_NOTIFY_CLOSE;
    }

    public void setCHATROOM_NOTIFY_CLOSE(int CHATROOM_NOTIFY_CLOSE) {
        this.CHATROOM_NOTIFY_CLOSE = CHATROOM_NOTIFY_CLOSE;
    }

    public int getCHATROOM_NOTIFY_OPEN() {
        return CHATROOM_NOTIFY_OPEN;
    }

    public void setCHATROOM_NOTIFY_OPEN(int CHATROOM_NOTIFY_OPEN) {
        this.CHATROOM_NOTIFY_OPEN = CHATROOM_NOTIFY_OPEN;
    }

    public int getCONTACTFLAG_3RDAPPCONTACT() {
        return CONTACTFLAG_3RDAPPCONTACT;
    }

    public void setCONTACTFLAG_3RDAPPCONTACT(int CONTACTFLAG_3RDAPPCONTACT) {
        this.CONTACTFLAG_3RDAPPCONTACT = CONTACTFLAG_3RDAPPCONTACT;
    }

    public int getCONTACTFLAG_BLACKLISTCONTACT() {
        return CONTACTFLAG_BLACKLISTCONTACT;
    }

    public void setCONTACTFLAG_BLACKLISTCONTACT(int CONTACTFLAG_BLACKLISTCONTACT) {
        this.CONTACTFLAG_BLACKLISTCONTACT = CONTACTFLAG_BLACKLISTCONTACT;
    }

    public int getCONTACTFLAG_CHATCONTACT() {
        return CONTACTFLAG_CHATCONTACT;
    }

    public void setCONTACTFLAG_CHATCONTACT(int CONTACTFLAG_CHATCONTACT) {
        this.CONTACTFLAG_CHATCONTACT = CONTACTFLAG_CHATCONTACT;
    }

    public int getCONTACTFLAG_CHATROOMCONTACT() {
        return CONTACTFLAG_CHATROOMCONTACT;
    }

    public void setCONTACTFLAG_CHATROOMCONTACT(int CONTACTFLAG_CHATROOMCONTACT) {
        this.CONTACTFLAG_CHATROOMCONTACT = CONTACTFLAG_CHATROOMCONTACT;
    }

    public int getCONTACTFLAG_CONTACT() {
        return CONTACTFLAG_CONTACT;
    }

    public void setCONTACTFLAG_CONTACT(int CONTACTFLAG_CONTACT) {
        this.CONTACTFLAG_CONTACT = CONTACTFLAG_CONTACT;
    }

    public int getCONTACTFLAG_DOMAINCONTACT() {
        return CONTACTFLAG_DOMAINCONTACT;
    }

    public void setCONTACTFLAG_DOMAINCONTACT(int CONTACTFLAG_DOMAINCONTACT) {
        this.CONTACTFLAG_DOMAINCONTACT = CONTACTFLAG_DOMAINCONTACT;
    }

    public int getCONTACTFLAG_FAVOURCONTACT() {
        return CONTACTFLAG_FAVOURCONTACT;
    }

    public void setCONTACTFLAG_FAVOURCONTACT(int CONTACTFLAG_FAVOURCONTACT) {
        this.CONTACTFLAG_FAVOURCONTACT = CONTACTFLAG_FAVOURCONTACT;
    }

    public int getCONTACTFLAG_HIDECONTACT() {
        return CONTACTFLAG_HIDECONTACT;
    }

    public void setCONTACTFLAG_HIDECONTACT(int CONTACTFLAG_HIDECONTACT) {
        this.CONTACTFLAG_HIDECONTACT = CONTACTFLAG_HIDECONTACT;
    }

    public int getCONTACTFLAG_NOTIFYCLOSECONTACT() {
        return CONTACTFLAG_NOTIFYCLOSECONTACT;
    }

    public void setCONTACTFLAG_NOTIFYCLOSECONTACT(int CONTACTFLAG_NOTIFYCLOSECONTACT) {
        this.CONTACTFLAG_NOTIFYCLOSECONTACT = CONTACTFLAG_NOTIFYCLOSECONTACT;
    }

    public int getCONTACTFLAG_SNSBLACKLISTCONTACT() {
        return CONTACTFLAG_SNSBLACKLISTCONTACT;
    }

    public void setCONTACTFLAG_SNSBLACKLISTCONTACT(int CONTACTFLAG_SNSBLACKLISTCONTACT) {
        this.CONTACTFLAG_SNSBLACKLISTCONTACT = CONTACTFLAG_SNSBLACKLISTCONTACT;
    }

    public int getCONTACTFLAG_TOPCONTACT() {
        return CONTACTFLAG_TOPCONTACT;
    }

    public void setCONTACTFLAG_TOPCONTACT(int CONTACTFLAG_TOPCONTACT) {
        this.CONTACTFLAG_TOPCONTACT = CONTACTFLAG_TOPCONTACT;
    }

    public int getEMOJI_FLAG_GIF() {
        return EMOJI_FLAG_GIF;
    }

    public void setEMOJI_FLAG_GIF(int EMOJI_FLAG_GIF) {
        this.EMOJI_FLAG_GIF = EMOJI_FLAG_GIF;
    }

    public String getEMOTICON_REG() {
        return EMOTICON_REG;
    }

    public void setEMOTICON_REG(String EMOTICON_REG) {
        this.EMOTICON_REG = EMOTICON_REG;
    }

    public int getKEYCODE_ADD() {
        return KEYCODE_ADD;
    }

    public void setKEYCODE_ADD(int KEYCODE_ADD) {
        this.KEYCODE_ADD = KEYCODE_ADD;
    }

    public int getKEYCODE_ARROW_DOWN() {
        return KEYCODE_ARROW_DOWN;
    }

    public void setKEYCODE_ARROW_DOWN(int KEYCODE_ARROW_DOWN) {
        this.KEYCODE_ARROW_DOWN = KEYCODE_ARROW_DOWN;
    }

    public int getKEYCODE_ARROW_LEFT() {
        return KEYCODE_ARROW_LEFT;
    }

    public void setKEYCODE_ARROW_LEFT(int KEYCODE_ARROW_LEFT) {
        this.KEYCODE_ARROW_LEFT = KEYCODE_ARROW_LEFT;
    }

    public int getKEYCODE_ARROW_RIGHT() {
        return KEYCODE_ARROW_RIGHT;
    }

    public void setKEYCODE_ARROW_RIGHT(int KEYCODE_ARROW_RIGHT) {
        this.KEYCODE_ARROW_RIGHT = KEYCODE_ARROW_RIGHT;
    }

    public int getKEYCODE_ARROW_UP() {
        return KEYCODE_ARROW_UP;
    }

    public void setKEYCODE_ARROW_UP(int KEYCODE_ARROW_UP) {
        this.KEYCODE_ARROW_UP = KEYCODE_ARROW_UP;
    }

    public int getKEYCODE_AT() {
        return KEYCODE_AT;
    }

    public void setKEYCODE_AT(int KEYCODE_AT) {
        this.KEYCODE_AT = KEYCODE_AT;
    }

    public int getKEYCODE_BACKSPACE() {
        return KEYCODE_BACKSPACE;
    }

    public void setKEYCODE_BACKSPACE(int KEYCODE_BACKSPACE) {
        this.KEYCODE_BACKSPACE = KEYCODE_BACKSPACE;
    }

    public int getKEYCODE_DELETE() {
        return KEYCODE_DELETE;
    }

    public void setKEYCODE_DELETE(int KEYCODE_DELETE) {
        this.KEYCODE_DELETE = KEYCODE_DELETE;
    }

    public int getKEYCODE_ENTER() {
        return KEYCODE_ENTER;
    }

    public void setKEYCODE_ENTER(int KEYCODE_ENTER) {
        this.KEYCODE_ENTER = KEYCODE_ENTER;
    }

    public int getKEYCODE_ESC() {
        return KEYCODE_ESC;
    }

    public void setKEYCODE_ESC(int KEYCODE_ESC) {
        this.KEYCODE_ESC = KEYCODE_ESC;
    }

    public int getKEYCODE_MINUS() {
        return KEYCODE_MINUS;
    }

    public void setKEYCODE_MINUS(int KEYCODE_MINUS) {
        this.KEYCODE_MINUS = KEYCODE_MINUS;
    }

    public int getKEYCODE_NUM2() {
        return KEYCODE_NUM2;
    }

    public void setKEYCODE_NUM2(int KEYCODE_NUM2) {
        this.KEYCODE_NUM2 = KEYCODE_NUM2;
    }

    public int getKEYCODE_NUM_ADD() {
        return KEYCODE_NUM_ADD;
    }

    public void setKEYCODE_NUM_ADD(int KEYCODE_NUM_ADD) {
        this.KEYCODE_NUM_ADD = KEYCODE_NUM_ADD;
    }

    public int getKEYCODE_NUM_MINUS() {
        return KEYCODE_NUM_MINUS;
    }

    public void setKEYCODE_NUM_MINUS(int KEYCODE_NUM_MINUS) {
        this.KEYCODE_NUM_MINUS = KEYCODE_NUM_MINUS;
    }

    public int getKEYCODE_SHIFT() {
        return KEYCODE_SHIFT;
    }

    public void setKEYCODE_SHIFT(int KEYCODE_SHIFT) {
        this.KEYCODE_SHIFT = KEYCODE_SHIFT;
    }

    public String getLANG() {
        return LANG;
    }

    public void setLANG(String LANG) {
        this.LANG = LANG;
    }

    public int getMM_DATA_APPMSG() {
        return MM_DATA_APPMSG;
    }

    public void setMM_DATA_APPMSG(int MM_DATA_APPMSG) {
        this.MM_DATA_APPMSG = MM_DATA_APPMSG;
    }

    public int getMM_DATA_EMOJI() {
        return MM_DATA_EMOJI;
    }

    public void setMM_DATA_EMOJI(int MM_DATA_EMOJI) {
        this.MM_DATA_EMOJI = MM_DATA_EMOJI;
    }

    public int getMM_DATA_HTML() {
        return MM_DATA_HTML;
    }

    public void setMM_DATA_HTML(int MM_DATA_HTML) {
        this.MM_DATA_HTML = MM_DATA_HTML;
    }

    public int getMM_DATA_IMG() {
        return MM_DATA_IMG;
    }

    public void setMM_DATA_IMG(int MM_DATA_IMG) {
        this.MM_DATA_IMG = MM_DATA_IMG;
    }

    public int getMM_DATA_LOCATION() {
        return MM_DATA_LOCATION;
    }

    public void setMM_DATA_LOCATION(int MM_DATA_LOCATION) {
        this.MM_DATA_LOCATION = MM_DATA_LOCATION;
    }

    public int getMM_DATA_MICROVIDEO() {
        return MM_DATA_MICROVIDEO;
    }

    public void setMM_DATA_MICROVIDEO(int MM_DATA_MICROVIDEO) {
        this.MM_DATA_MICROVIDEO = MM_DATA_MICROVIDEO;
    }

    public int getMM_DATA_POSSIBLEFRIEND_MSG() {
        return MM_DATA_POSSIBLEFRIEND_MSG;
    }

    public void setMM_DATA_POSSIBLEFRIEND_MSG(int MM_DATA_POSSIBLEFRIEND_MSG) {
        this.MM_DATA_POSSIBLEFRIEND_MSG = MM_DATA_POSSIBLEFRIEND_MSG;
    }

    public int getMM_DATA_PRIVATEMSG_HTML() {
        return MM_DATA_PRIVATEMSG_HTML;
    }

    public void setMM_DATA_PRIVATEMSG_HTML(int MM_DATA_PRIVATEMSG_HTML) {
        this.MM_DATA_PRIVATEMSG_HTML = MM_DATA_PRIVATEMSG_HTML;
    }

    public int getMM_DATA_PRIVATEMSG_IMG() {
        return MM_DATA_PRIVATEMSG_IMG;
    }

    public void setMM_DATA_PRIVATEMSG_IMG(int MM_DATA_PRIVATEMSG_IMG) {
        this.MM_DATA_PRIVATEMSG_IMG = MM_DATA_PRIVATEMSG_IMG;
    }

    public int getMM_DATA_PRIVATEMSG_TEXT() {
        return MM_DATA_PRIVATEMSG_TEXT;
    }

    public void setMM_DATA_PRIVATEMSG_TEXT(int MM_DATA_PRIVATEMSG_TEXT) {
        this.MM_DATA_PRIVATEMSG_TEXT = MM_DATA_PRIVATEMSG_TEXT;
    }

    public int getMM_DATA_PUSHMAIL() {
        return MM_DATA_PUSHMAIL;
    }

    public void setMM_DATA_PUSHMAIL(int MM_DATA_PUSHMAIL) {
        this.MM_DATA_PUSHMAIL = MM_DATA_PUSHMAIL;
    }

    public int getMM_DATA_PUSHSYSTEMMSG() {
        return MM_DATA_PUSHSYSTEMMSG;
    }

    public void setMM_DATA_PUSHSYSTEMMSG(int MM_DATA_PUSHSYSTEMMSG) {
        this.MM_DATA_PUSHSYSTEMMSG = MM_DATA_PUSHSYSTEMMSG;
    }

    public int getMM_DATA_QMSG() {
        return MM_DATA_QMSG;
    }

    public void setMM_DATA_QMSG(int MM_DATA_QMSG) {
        this.MM_DATA_QMSG = MM_DATA_QMSG;
    }

    public int getMM_DATA_QQLIXIANMSG_IMG() {
        return MM_DATA_QQLIXIANMSG_IMG;
    }

    public void setMM_DATA_QQLIXIANMSG_IMG(int MM_DATA_QQLIXIANMSG_IMG) {
        this.MM_DATA_QQLIXIANMSG_IMG = MM_DATA_QQLIXIANMSG_IMG;
    }

    public int getMM_DATA_RECALLED() {
        return MM_DATA_RECALLED;
    }

    public void setMM_DATA_RECALLED(int MM_DATA_RECALLED) {
        this.MM_DATA_RECALLED = MM_DATA_RECALLED;
    }

    public int getMM_DATA_SHARECARD() {
        return MM_DATA_SHARECARD;
    }

    public void setMM_DATA_SHARECARD(int MM_DATA_SHARECARD) {
        this.MM_DATA_SHARECARD = MM_DATA_SHARECARD;
    }

    public int getMM_DATA_STATUSNOTIFY() {
        return MM_DATA_STATUSNOTIFY;
    }

    public void setMM_DATA_STATUSNOTIFY(int MM_DATA_STATUSNOTIFY) {
        this.MM_DATA_STATUSNOTIFY = MM_DATA_STATUSNOTIFY;
    }

    public int getMM_DATA_SYS() {
        return MM_DATA_SYS;
    }

    public void setMM_DATA_SYS(int MM_DATA_SYS) {
        this.MM_DATA_SYS = MM_DATA_SYS;
    }

    public int getMM_DATA_SYSNOTICE() {
        return MM_DATA_SYSNOTICE;
    }

    public void setMM_DATA_SYSNOTICE(int MM_DATA_SYSNOTICE) {
        this.MM_DATA_SYSNOTICE = MM_DATA_SYSNOTICE;
    }

    public int getMM_DATA_TEXT() {
        return MM_DATA_TEXT;
    }

    public void setMM_DATA_TEXT(int MM_DATA_TEXT) {
        this.MM_DATA_TEXT = MM_DATA_TEXT;
    }

    public int getMM_DATA_VERIFYMSG() {
        return MM_DATA_VERIFYMSG;
    }

    public void setMM_DATA_VERIFYMSG(int MM_DATA_VERIFYMSG) {
        this.MM_DATA_VERIFYMSG = MM_DATA_VERIFYMSG;
    }

    public int getMM_DATA_VIDEO() {
        return MM_DATA_VIDEO;
    }

    public void setMM_DATA_VIDEO(int MM_DATA_VIDEO) {
        this.MM_DATA_VIDEO = MM_DATA_VIDEO;
    }

    public int getMM_DATA_VIDEO_IPHONE_EXPORT() {
        return MM_DATA_VIDEO_IPHONE_EXPORT;
    }

    public void setMM_DATA_VIDEO_IPHONE_EXPORT(int MM_DATA_VIDEO_IPHONE_EXPORT) {
        this.MM_DATA_VIDEO_IPHONE_EXPORT = MM_DATA_VIDEO_IPHONE_EXPORT;
    }

    public int getMM_DATA_VOICEMSG() {
        return MM_DATA_VOICEMSG;
    }

    public void setMM_DATA_VOICEMSG(int MM_DATA_VOICEMSG) {
        this.MM_DATA_VOICEMSG = MM_DATA_VOICEMSG;
    }

    public int getMM_DATA_VOIPINVITE() {
        return MM_DATA_VOIPINVITE;
    }

    public void setMM_DATA_VOIPINVITE(int MM_DATA_VOIPINVITE) {
        this.MM_DATA_VOIPINVITE = MM_DATA_VOIPINVITE;
    }

    public int getMM_DATA_VOIPMSG() {
        return MM_DATA_VOIPMSG;
    }

    public void setMM_DATA_VOIPMSG(int MM_DATA_VOIPMSG) {
        this.MM_DATA_VOIPMSG = MM_DATA_VOIPMSG;
    }

    public int getMM_DATA_VOIPNOTIFY() {
        return MM_DATA_VOIPNOTIFY;
    }

    public void setMM_DATA_VOIPNOTIFY(int MM_DATA_VOIPNOTIFY) {
        this.MM_DATA_VOIPNOTIFY = MM_DATA_VOIPNOTIFY;
    }

    public String getMM_EMOTICON_WEB() {
        return MM_EMOTICON_WEB;
    }

    public void setMM_EMOTICON_WEB(String MM_EMOTICON_WEB) {
        this.MM_EMOTICON_WEB = MM_EMOTICON_WEB;
    }

    public int getMM_NOTIFY_CLOSE() {
        return MM_NOTIFY_CLOSE;
    }

    public void setMM_NOTIFY_CLOSE(int MM_NOTIFY_CLOSE) {
        this.MM_NOTIFY_CLOSE = MM_NOTIFY_CLOSE;
    }

    public int getMM_NOTIFY_OPEN() {
        return MM_NOTIFY_OPEN;
    }

    public void setMM_NOTIFY_OPEN(int MM_NOTIFY_OPEN) {
        this.MM_NOTIFY_OPEN = MM_NOTIFY_OPEN;
    }

    public int getMM_SEND_FILE_STATUS_CANCEL() {
        return MM_SEND_FILE_STATUS_CANCEL;
    }

    public void setMM_SEND_FILE_STATUS_CANCEL(int MM_SEND_FILE_STATUS_CANCEL) {
        this.MM_SEND_FILE_STATUS_CANCEL = MM_SEND_FILE_STATUS_CANCEL;
    }

    public int getMM_SEND_FILE_STATUS_FAIL() {
        return MM_SEND_FILE_STATUS_FAIL;
    }

    public void setMM_SEND_FILE_STATUS_FAIL(int MM_SEND_FILE_STATUS_FAIL) {
        this.MM_SEND_FILE_STATUS_FAIL = MM_SEND_FILE_STATUS_FAIL;
    }

    public int getMM_SEND_FILE_STATUS_QUEUED() {
        return MM_SEND_FILE_STATUS_QUEUED;
    }

    public void setMM_SEND_FILE_STATUS_QUEUED(int MM_SEND_FILE_STATUS_QUEUED) {
        this.MM_SEND_FILE_STATUS_QUEUED = MM_SEND_FILE_STATUS_QUEUED;
    }

    public int getMM_SEND_FILE_STATUS_SENDING() {
        return MM_SEND_FILE_STATUS_SENDING;
    }

    public void setMM_SEND_FILE_STATUS_SENDING(int MM_SEND_FILE_STATUS_SENDING) {
        this.MM_SEND_FILE_STATUS_SENDING = MM_SEND_FILE_STATUS_SENDING;
    }

    public int getMM_SEND_FILE_STATUS_SUCCESS() {
        return MM_SEND_FILE_STATUS_SUCCESS;
    }

    public void setMM_SEND_FILE_STATUS_SUCCESS(int MM_SEND_FILE_STATUS_SUCCESS) {
        this.MM_SEND_FILE_STATUS_SUCCESS = MM_SEND_FILE_STATUS_SUCCESS;
    }

    public int getMM_SOUND_CLOSE() {
        return MM_SOUND_CLOSE;
    }

    public void setMM_SOUND_CLOSE(int MM_SOUND_CLOSE) {
        this.MM_SOUND_CLOSE = MM_SOUND_CLOSE;
    }

    public int getMM_SOUND_OPEN() {
        return MM_SOUND_OPEN;
    }

    public void setMM_SOUND_OPEN(int MM_SOUND_OPEN) {
        this.MM_SOUND_OPEN = MM_SOUND_OPEN;
    }

    public int getMM_USERATTRVERIFYFALG_BIZ() {
        return MM_USERATTRVERIFYFALG_BIZ;
    }

    public void setMM_USERATTRVERIFYFALG_BIZ(int MM_USERATTRVERIFYFALG_BIZ) {
        this.MM_USERATTRVERIFYFALG_BIZ = MM_USERATTRVERIFYFALG_BIZ;
    }

    public int getMM_USERATTRVERIFYFALG_BIZ_BIG() {
        return MM_USERATTRVERIFYFALG_BIZ_BIG;
    }

    public void setMM_USERATTRVERIFYFALG_BIZ_BIG(int MM_USERATTRVERIFYFALG_BIZ_BIG) {
        this.MM_USERATTRVERIFYFALG_BIZ_BIG = MM_USERATTRVERIFYFALG_BIZ_BIG;
    }

    public int getMM_USERATTRVERIFYFALG_BIZ_BRAND() {
        return MM_USERATTRVERIFYFALG_BIZ_BRAND;
    }

    public void setMM_USERATTRVERIFYFALG_BIZ_BRAND(int MM_USERATTRVERIFYFALG_BIZ_BRAND) {
        this.MM_USERATTRVERIFYFALG_BIZ_BRAND = MM_USERATTRVERIFYFALG_BIZ_BRAND;
    }

    public int getMM_USERATTRVERIFYFALG_BIZ_VERIFIED() {
        return MM_USERATTRVERIFYFALG_BIZ_VERIFIED;
    }

    public void setMM_USERATTRVERIFYFALG_BIZ_VERIFIED(int MM_USERATTRVERIFYFALG_BIZ_VERIFIED) {
        this.MM_USERATTRVERIFYFALG_BIZ_VERIFIED = MM_USERATTRVERIFYFALG_BIZ_VERIFIED;
    }

    public int getMM_USERATTRVERIFYFALG_FAMOUS() {
        return MM_USERATTRVERIFYFALG_FAMOUS;
    }

    public void setMM_USERATTRVERIFYFALG_FAMOUS(int MM_USERATTRVERIFYFALG_FAMOUS) {
        this.MM_USERATTRVERIFYFALG_FAMOUS = MM_USERATTRVERIFYFALG_FAMOUS;
    }

    public int getMSGTYPE_APP() {
        return MSGTYPE_APP;
    }

    public void setMSGTYPE_APP(int MSGTYPE_APP) {
        this.MSGTYPE_APP = MSGTYPE_APP;
    }

    public int getMSGTYPE_EMOTICON() {
        return MSGTYPE_EMOTICON;
    }

    public void setMSGTYPE_EMOTICON(int MSGTYPE_EMOTICON) {
        this.MSGTYPE_EMOTICON = MSGTYPE_EMOTICON;
    }

    public int getMSGTYPE_IMAGE() {
        return MSGTYPE_IMAGE;
    }

    public void setMSGTYPE_IMAGE(int MSGTYPE_IMAGE) {
        this.MSGTYPE_IMAGE = MSGTYPE_IMAGE;
    }

    public int getMSGTYPE_LOCATION() {
        return MSGTYPE_LOCATION;
    }

    public void setMSGTYPE_LOCATION(int MSGTYPE_LOCATION) {
        this.MSGTYPE_LOCATION = MSGTYPE_LOCATION;
    }

    public int getMSGTYPE_MICROVIDEO() {
        return MSGTYPE_MICROVIDEO;
    }

    public void setMSGTYPE_MICROVIDEO(int MSGTYPE_MICROVIDEO) {
        this.MSGTYPE_MICROVIDEO = MSGTYPE_MICROVIDEO;
    }

    public int getMSGTYPE_POSSIBLEFRIEND_MSG() {
        return MSGTYPE_POSSIBLEFRIEND_MSG;
    }

    public void setMSGTYPE_POSSIBLEFRIEND_MSG(int MSGTYPE_POSSIBLEFRIEND_MSG) {
        this.MSGTYPE_POSSIBLEFRIEND_MSG = MSGTYPE_POSSIBLEFRIEND_MSG;
    }

    public int getMSGTYPE_RECALLED() {
        return MSGTYPE_RECALLED;
    }

    public void setMSGTYPE_RECALLED(int MSGTYPE_RECALLED) {
        this.MSGTYPE_RECALLED = MSGTYPE_RECALLED;
    }

    public int getMSGTYPE_SHARECARD() {
        return MSGTYPE_SHARECARD;
    }

    public void setMSGTYPE_SHARECARD(int MSGTYPE_SHARECARD) {
        this.MSGTYPE_SHARECARD = MSGTYPE_SHARECARD;
    }

    public int getMSGTYPE_STATUSNOTIFY() {
        return MSGTYPE_STATUSNOTIFY;
    }

    public void setMSGTYPE_STATUSNOTIFY(int MSGTYPE_STATUSNOTIFY) {
        this.MSGTYPE_STATUSNOTIFY = MSGTYPE_STATUSNOTIFY;
    }

    public int getMSGTYPE_SYS() {
        return MSGTYPE_SYS;
    }

    public void setMSGTYPE_SYS(int MSGTYPE_SYS) {
        this.MSGTYPE_SYS = MSGTYPE_SYS;
    }

    public int getMSGTYPE_SYSNOTICE() {
        return MSGTYPE_SYSNOTICE;
    }

    public void setMSGTYPE_SYSNOTICE(int MSGTYPE_SYSNOTICE) {
        this.MSGTYPE_SYSNOTICE = MSGTYPE_SYSNOTICE;
    }

    public int getMSGTYPE_TEXT() {
        return MSGTYPE_TEXT;
    }

    public void setMSGTYPE_TEXT(int MSGTYPE_TEXT) {
        this.MSGTYPE_TEXT = MSGTYPE_TEXT;
    }

    public int getMSGTYPE_VERIFYMSG() {
        return MSGTYPE_VERIFYMSG;
    }

    public void setMSGTYPE_VERIFYMSG(int MSGTYPE_VERIFYMSG) {
        this.MSGTYPE_VERIFYMSG = MSGTYPE_VERIFYMSG;
    }

    public int getMSGTYPE_VIDEO() {
        return MSGTYPE_VIDEO;
    }

    public void setMSGTYPE_VIDEO(int MSGTYPE_VIDEO) {
        this.MSGTYPE_VIDEO = MSGTYPE_VIDEO;
    }

    public int getMSGTYPE_VOICE() {
        return MSGTYPE_VOICE;
    }

    public void setMSGTYPE_VOICE(int MSGTYPE_VOICE) {
        this.MSGTYPE_VOICE = MSGTYPE_VOICE;
    }

    public int getMSGTYPE_VOIPINVITE() {
        return MSGTYPE_VOIPINVITE;
    }

    public void setMSGTYPE_VOIPINVITE(int MSGTYPE_VOIPINVITE) {
        this.MSGTYPE_VOIPINVITE = MSGTYPE_VOIPINVITE;
    }

    public int getMSGTYPE_VOIPMSG() {
        return MSGTYPE_VOIPMSG;
    }

    public void setMSGTYPE_VOIPMSG(int MSGTYPE_VOIPMSG) {
        this.MSGTYPE_VOIPMSG = MSGTYPE_VOIPMSG;
    }

    public int getMSGTYPE_VOIPNOTIFY() {
        return MSGTYPE_VOIPNOTIFY;
    }

    public void setMSGTYPE_VOIPNOTIFY(int MSGTYPE_VOIPNOTIFY) {
        this.MSGTYPE_VOIPNOTIFY = MSGTYPE_VOIPNOTIFY;
    }

    public int getMSG_SEND_STATUS_FAIL() {
        return MSG_SEND_STATUS_FAIL;
    }

    public void setMSG_SEND_STATUS_FAIL(int MSG_SEND_STATUS_FAIL) {
        this.MSG_SEND_STATUS_FAIL = MSG_SEND_STATUS_FAIL;
    }

    public int getMSG_SEND_STATUS_READY() {
        return MSG_SEND_STATUS_READY;
    }

    public void setMSG_SEND_STATUS_READY(int MSG_SEND_STATUS_READY) {
        this.MSG_SEND_STATUS_READY = MSG_SEND_STATUS_READY;
    }

    public int getMSG_SEND_STATUS_SENDING() {
        return MSG_SEND_STATUS_SENDING;
    }

    public void setMSG_SEND_STATUS_SENDING(int MSG_SEND_STATUS_SENDING) {
        this.MSG_SEND_STATUS_SENDING = MSG_SEND_STATUS_SENDING;
    }

    public int getMSG_SEND_STATUS_SUCC() {
        return MSG_SEND_STATUS_SUCC;
    }

    public void setMSG_SEND_STATUS_SUCC(int MSG_SEND_STATUS_SUCC) {
        this.MSG_SEND_STATUS_SUCC = MSG_SEND_STATUS_SUCC;
    }

    public int getPROFILE_BITFLAG_CHANGE() {
        return PROFILE_BITFLAG_CHANGE;
    }

    public void setPROFILE_BITFLAG_CHANGE(int PROFILE_BITFLAG_CHANGE) {
        this.PROFILE_BITFLAG_CHANGE = PROFILE_BITFLAG_CHANGE;
    }

    public int getPROFILE_BITFLAG_NOCHANGE() {
        return PROFILE_BITFLAG_NOCHANGE;
    }

    public void setPROFILE_BITFLAG_NOCHANGE(int PROFILE_BITFLAG_NOCHANGE) {
        this.PROFILE_BITFLAG_NOCHANGE = PROFILE_BITFLAG_NOCHANGE;
    }

    public String getRES_PATH() {
        return RES_PATH;
    }

    public void setRES_PATH(String RES_PATH) {
        this.RES_PATH = RES_PATH;
    }

    public String getSP_CONTACT_FILE_HELPER() {
        return SP_CONTACT_FILE_HELPER;
    }

    public void setSP_CONTACT_FILE_HELPER(String SP_CONTACT_FILE_HELPER) {
        this.SP_CONTACT_FILE_HELPER = SP_CONTACT_FILE_HELPER;
    }

    public String getSP_CONTACT_NEWSAPP() {
        return SP_CONTACT_NEWSAPP;
    }

    public void setSP_CONTACT_NEWSAPP(String SP_CONTACT_NEWSAPP) {
        this.SP_CONTACT_NEWSAPP = SP_CONTACT_NEWSAPP;
    }

    public String getSP_CONTACT_RECOMMEND_HELPER() {
        return SP_CONTACT_RECOMMEND_HELPER;
    }

    public void setSP_CONTACT_RECOMMEND_HELPER(String SP_CONTACT_RECOMMEND_HELPER) {
        this.SP_CONTACT_RECOMMEND_HELPER = SP_CONTACT_RECOMMEND_HELPER;
    }

    public int getStatusNotifyCode_ENTER_SESSION() {
        return StatusNotifyCode_ENTER_SESSION;
    }

    public void setStatusNotifyCode_ENTER_SESSION(int StatusNotifyCode_ENTER_SESSION) {
        this.StatusNotifyCode_ENTER_SESSION = StatusNotifyCode_ENTER_SESSION;
    }

    public int getStatusNotifyCode_INITED() {
        return StatusNotifyCode_INITED;
    }

    public void setStatusNotifyCode_INITED(int StatusNotifyCode_INITED) {
        this.StatusNotifyCode_INITED = StatusNotifyCode_INITED;
    }

    public int getStatusNotifyCode_QUIT_SESSION() {
        return StatusNotifyCode_QUIT_SESSION;
    }

    public void setStatusNotifyCode_QUIT_SESSION(int StatusNotifyCode_QUIT_SESSION) {
        this.StatusNotifyCode_QUIT_SESSION = StatusNotifyCode_QUIT_SESSION;
    }

    public int getStatusNotifyCode_READED() {
        return StatusNotifyCode_READED;
    }

    public void setStatusNotifyCode_READED(int StatusNotifyCode_READED) {
        this.StatusNotifyCode_READED = StatusNotifyCode_READED;
    }

    public int getStatusNotifyCode_SYNC_CONV() {
        return StatusNotifyCode_SYNC_CONV;
    }

    public void setStatusNotifyCode_SYNC_CONV(int StatusNotifyCode_SYNC_CONV) {
        this.StatusNotifyCode_SYNC_CONV = StatusNotifyCode_SYNC_CONV;
    }

    public int getTIMEOUT_SYNC_CHECK() {
        return TIMEOUT_SYNC_CHECK;
    }

    public void setTIMEOUT_SYNC_CHECK(int TIMEOUT_SYNC_CHECK) {
        this.TIMEOUT_SYNC_CHECK = TIMEOUT_SYNC_CHECK;
    }

    public int getUPLOAD_MEDIA_TYPE_ATTACHMENT() {
        return UPLOAD_MEDIA_TYPE_ATTACHMENT;
    }

    public void setUPLOAD_MEDIA_TYPE_ATTACHMENT(int UPLOAD_MEDIA_TYPE_ATTACHMENT) {
        this.UPLOAD_MEDIA_TYPE_ATTACHMENT = UPLOAD_MEDIA_TYPE_ATTACHMENT;
    }

    public int getUPLOAD_MEDIA_TYPE_AUDIO() {
        return UPLOAD_MEDIA_TYPE_AUDIO;
    }

    public void setUPLOAD_MEDIA_TYPE_AUDIO(int UPLOAD_MEDIA_TYPE_AUDIO) {
        this.UPLOAD_MEDIA_TYPE_AUDIO = UPLOAD_MEDIA_TYPE_AUDIO;
    }

    public int getUPLOAD_MEDIA_TYPE_IMAGE() {
        return UPLOAD_MEDIA_TYPE_IMAGE;
    }

    public void setUPLOAD_MEDIA_TYPE_IMAGE(int UPLOAD_MEDIA_TYPE_IMAGE) {
        this.UPLOAD_MEDIA_TYPE_IMAGE = UPLOAD_MEDIA_TYPE_IMAGE;
    }

    public int getUPLOAD_MEDIA_TYPE_VIDEO() {
        return UPLOAD_MEDIA_TYPE_VIDEO;
    }

    public void setUPLOAD_MEDIA_TYPE_VIDEO(int UPLOAD_MEDIA_TYPE_VIDEO) {
        this.UPLOAD_MEDIA_TYPE_VIDEO = UPLOAD_MEDIA_TYPE_VIDEO;
    }

    public int getVERIFYUSER_OPCODE_ADDCONTACT() {
        return VERIFYUSER_OPCODE_ADDCONTACT;
    }

    public void setVERIFYUSER_OPCODE_ADDCONTACT(int VERIFYUSER_OPCODE_ADDCONTACT) {
        this.VERIFYUSER_OPCODE_ADDCONTACT = VERIFYUSER_OPCODE_ADDCONTACT;
    }

    public int getVERIFYUSER_OPCODE_RECVERREPLY() {
        return VERIFYUSER_OPCODE_RECVERREPLY;
    }

    public void setVERIFYUSER_OPCODE_RECVERREPLY(int VERIFYUSER_OPCODE_RECVERREPLY) {
        this.VERIFYUSER_OPCODE_RECVERREPLY = VERIFYUSER_OPCODE_RECVERREPLY;
    }

    public int getVERIFYUSER_OPCODE_SENDERREPLY() {
        return VERIFYUSER_OPCODE_SENDERREPLY;
    }

    public void setVERIFYUSER_OPCODE_SENDERREPLY(int VERIFYUSER_OPCODE_SENDERREPLY) {
        this.VERIFYUSER_OPCODE_SENDERREPLY = VERIFYUSER_OPCODE_SENDERREPLY;
    }

    public int getVERIFYUSER_OPCODE_SENDREQUEST() {
        return VERIFYUSER_OPCODE_SENDREQUEST;
    }

    public void setVERIFYUSER_OPCODE_SENDREQUEST(int VERIFYUSER_OPCODE_SENDREQUEST) {
        this.VERIFYUSER_OPCODE_SENDREQUEST = VERIFYUSER_OPCODE_SENDREQUEST;
    }

    public int getVERIFYUSER_OPCODE_VERIFYOK() {
        return VERIFYUSER_OPCODE_VERIFYOK;
    }

    public void setVERIFYUSER_OPCODE_VERIFYOK(int VERIFYUSER_OPCODE_VERIFYOK) {
        this.VERIFYUSER_OPCODE_VERIFYOK = VERIFYUSER_OPCODE_VERIFYOK;
    }

    public int getVERIFYUSER_OPCODE_VERIFYREJECT() {
        return VERIFYUSER_OPCODE_VERIFYREJECT;
    }

    public void setVERIFYUSER_OPCODE_VERIFYREJECT(int VERIFYUSER_OPCODE_VERIFYREJECT) {
        this.VERIFYUSER_OPCODE_VERIFYREJECT = VERIFYUSER_OPCODE_VERIFYREJECT;
    }

    public OplogCmdIdBean getOplogCmdId() {
        return oplogCmdId;
    }

    public void setOplogCmdId(OplogCmdIdBean oplogCmdId) {
        this.oplogCmdId = oplogCmdId;
    }

    public static class OplogCmdIdBean implements Serializable{
        /**
         * MODREMARKNAME : 2
         * TOPCONTACT : 3
         */

        private int MODREMARKNAME;
        private int TOPCONTACT;

        public int getMODREMARKNAME() {
            return MODREMARKNAME;
        }

        public void setMODREMARKNAME(int MODREMARKNAME) {
            this.MODREMARKNAME = MODREMARKNAME;
        }

        public int getTOPCONTACT() {
            return TOPCONTACT;
        }

        public void setTOPCONTACT(int TOPCONTACT) {
            this.TOPCONTACT = TOPCONTACT;
        }
    }
}
