package com.wechat.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wiki on 2018/3/9.
 */

public class ContactsResponseModel implements Serializable{
    /**
     * BaseResponse : {"Ret":0,"ErrMsg":""}
     * MemberCount : 5
     * MemberList : [{"Uin":0,"UserName":"weixin","NickName":"微信团队","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=639240080&username=weixin&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":1,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"微信团队官方帐号","VerifyFlag":56,"OwnerUin":0,"PYInitial":"WXTD","PYQuanPin":"weixintuandui","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":4,"Province":"","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"wei","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@5d1525da38b1d1ac2f9671db10bd31bc","NickName":"我是腾腾爸","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=645500747&username=@5d1525da38b1d1ac2f9671db10bd31bc&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":1,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"《投资大白话》作者。还有若干大部头著作待写。","VerifyFlag":8,"OwnerUin":0,"PYInitial":"WSTTB","PYQuanPin":"woshitengtengba","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"Shandong","City":"Jining","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"gh_","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@8d621d928d505352fc95de7afc229dcd","NickName":"利来文化","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=645500937&username=@8d621d928d505352fc95de7afc229dcd&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":1,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"2017赛季撒哈拉印度力量F1车队赞助商","VerifyFlag":8,"OwnerUin":0,"PYInitial":"LLWH","PYQuanPin":"lilaiwenhua","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"St. Anthony","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"gh_","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@7e5981c9228d290191735322f846b5b2","NickName":"利来体育","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=645500987&username=@7e5981c9228d290191735322f846b5b2&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":1,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"利来体育","VerifyFlag":24,"OwnerUin":0,"PYInitial":"LLTY","PYQuanPin":"lilaitiyu","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"Chongqing","City":"Youyang","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"gh_","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@f1815c470be563aa247b87bb93bde4b1bfa5a1dcc5931b82eade77d7a4a59b9a","NickName":"佐伊","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=670490200&username=@f1815c470be563aa247b87bb93bde4b1bfa5a1dcc5931b82eade77d7a4a59b9a&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":3,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":2,"Signature":"","VerifyFlag":0,"OwnerUin":0,"PYInitial":"ZY","PYQuanPin":"zuoyi","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":33656869,"Province":"","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"","EncryChatRoomId":"","IsOwner":0}]
     * Seq : 0
     */

    private BaseResponseBean BaseResponse;
    private int MemberCount;
    private int Seq;
    private List<ContactModel> MemberList;

    public BaseResponseBean getBaseResponse() {
        return BaseResponse;
    }

    public void setBaseResponse(BaseResponseBean BaseResponse) {
        this.BaseResponse = BaseResponse;
    }

    public int getMemberCount() {
        return MemberCount;
    }

    public void setMemberCount(int MemberCount) {
        this.MemberCount = MemberCount;
    }

    public int getSeq() {
        return Seq;
    }

    public void setSeq(int Seq) {
        this.Seq = Seq;
    }

    public List<ContactModel> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<ContactModel> MemberList) {
        this.MemberList = MemberList;
    }

    public static class BaseResponseBean {
        /**
         * Ret : 0
         * ErrMsg :
         */

        private int Ret;
        private String ErrMsg;

        public int getRet() {
            return Ret;
        }

        public void setRet(int Ret) {
            this.Ret = Ret;
        }

        public String getErrMsg() {
            return ErrMsg;
        }

        public void setErrMsg(String ErrMsg) {
            this.ErrMsg = ErrMsg;
        }
    }

}
