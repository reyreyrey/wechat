package com.wechat.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wiki on 2018/3/6.
 */

public class InitFinishModel implements Serializable{
    /**
     * BaseResponse : {"Ret":0,"ErrMsg":""}
     * Count : 3
     * ContactList : [{"Uin":0,"UserName":"filehelper","NickName":"文件传输助手","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=0&username=filehelper&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":0,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"","VerifyFlag":0,"OwnerUin":0,"PYInitial":"WJCSZS","PYQuanPin":"wenjianchuanshuzhushou","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":0,"Province":"","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"fil","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"@f1815c470be563aa247b87bb93bde4b1bfa5a1dcc5931b82eade77d7a4a59b9a","NickName":"佐伊","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=670490200&username=@f1815c470be563aa247b87bb93bde4b1bfa5a1dcc5931b82eade77d7a4a59b9a&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":3,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":2,"Signature":"","VerifyFlag":0,"OwnerUin":0,"PYInitial":"ZY","PYQuanPin":"zuoyi","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":33656869,"Province":"","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"","EncryChatRoomId":"","IsOwner":0},{"Uin":0,"UserName":"weixin","NickName":"微信团队","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=639240080&username=weixin&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","ContactFlag":1,"MemberCount":0,"MemberList":[],"RemarkName":"","HideInputBarFlag":0,"Sex":0,"Signature":"微信团队官方帐号","VerifyFlag":56,"OwnerUin":0,"PYInitial":"WXTD","PYQuanPin":"weixintuandui","RemarkPYInitial":"","RemarkPYQuanPin":"","StarFriend":0,"AppAccountFlag":0,"Statues":0,"AttrStatus":4,"Province":"","City":"","Alias":"","SnsFlag":0,"UniFriend":0,"DisplayName":"","ChatRoomId":0,"KeyWord":"wei","EncryChatRoomId":"","IsOwner":0}]
     * SyncKey : {"Count":4,"List":[{"Key":1,"Val":670490270},{"Key":2,"Val":670490286},{"Key":3,"Val":670490200},{"Key":1000,"Val":1515398757}]}
     * User : {"Uin":2925514351,"UserName":"@271e7309f508bcf320c784bca0a51fd6d81e0224842b036d5f90b785e4fc343b","NickName":"测试APP","HeadImgUrl":"/cgi-bin/mmwebwx-bin/webwxgeticon?seq=683716767&username=@271e7309f508bcf320c784bca0a51fd6d81e0224842b036d5f90b785e4fc343b&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2","RemarkName":"","PYInitial":"","PYQuanPin":"","RemarkPYInitial":"","RemarkPYQuanPin":"","HideInputBarFlag":0,"StarFriend":0,"Sex":0,"Signature":"","AppAccountFlag":0,"VerifyFlag":0,"ContactFlag":0,"WebWxPluginSwitch":0,"HeadImgFlag":0,"SnsFlag":1}
     * ChatSet : filehelper,@f1815c470be563aa247b87bb93bde4b1bfa5a1dcc5931b82eade77d7a4a59b9a,weixin,
     * SKey : @crypt_52d06394_166c40342208aa2c7f60276652b782e2
     * ClientVersion : 369431841
     * SystemTime : 1515400567
     * GrayScale : 1
     * InviteStartCount : 40
     * MPSubscribeMsgCount : 5
     * MPSubscribeMsgList : [{"UserName":"@5d1525da38b1d1ac2f9671db10bd31bc","MPArticleCount":1,"MPArticleList":[{"Title":"如何看待股市神人，其实就是如何看待我们自己","Digest":"股市神人，你信吗？我说我信，你信吗？","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/l2OjqibWhGIQuscsZ9or0RJoVgNjBPFz0RgfG96tiaVCqzicyjQFHQfpxsxiaSPnWAdpoSPQ1lAqJnabHpkAzUcYXg/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIzNDU4OTMwMA==&mid=2247484749&idx=1&sn=37354cf05e9823ede0652ff6a1e9dc8e&chksm=e8f55856df82d1403c5e7c44e8aa97a8d9bf7594d0ad6578b866c72f8921792c08a6cd1707f6&scene=0#rd"}],"Time":1515336887,"NickName":"我是腾腾爸"},{"UserName":"@8d621d928d505352fc95de7afc229dcd","MPArticleCount":4,"MPArticleList":[{"Title":"印度力量：佩雷兹与奥康已经知道如何在赛场上表现自我","Digest":"印度力量F1车队首席运营官奥特玛·萨弗诺尔（Otmar Szafnauer）认为塞尔吉奥·佩雷兹（Sergi","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/UqK6oktXmLVlqL4IPgicYmf6Gib7MZo39MibiaRTJuO23obHWicHD7VaO2ibiciaKyk5mK1wjKaglAGBdWBuNdfIOhJ66Q/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzI0Nzc0Njk5Mw==&mid=2247488148&idx=1&sn=f8bce2e2a6fc7e79b6e44695ef039e89&chksm=e9aa0a4adedd835c18ddb18af4d2a7cbdf928ed922ac6af2e89fb50268eb8384b473f181c39d&scene=0#rd"},{"Title":"马萨：威廉姆斯车队的2018款赛车将会更加激进","Digest":"前威廉姆斯F1车队车手费利佩·马萨（Felipe Massa）认为他的前东家将要推出的2018款赛车相较前一","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/UqK6oktXmLVlqL4IPgicYmf6Gib7MZo39MADM9icPxBkpf2WtmEBNN1aFicbZ7oXVhDRQJllXFDwleM9mvx7kDDdVw/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzI0Nzc0Njk5Mw==&mid=2247488148&idx=2&sn=6b7106614e60d177bfe5beb95b863cd3&chksm=e9aa0a4adedd835cd72b85171f5612788e8c9df2821bdb3c1de717e8640365e4cd3f1eb22204&scene=0#rd"},{"Title":"尼古拉斯·拉蒂菲成为印度力量车队储备车手","Digest":"印度力量F1车队正式宣布，加拿大车手尼古拉斯·拉蒂菲（Nicholas Latifi）将在2018赛季F1锦","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/UqK6oktXmLVlqL4IPgicYmf6Gib7MZo39MHpj180l1ibaTEIMkLQpCYyghFlebtbKkK3ErhctF5MsGfFricrBV4aCw/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzI0Nzc0Njk5Mw==&mid=2247488148&idx=3&sn=15e8c5fa3f5c2d6f0714421a599e988e&chksm=e9aa0a4adedd835c5a4d53f943ac8f79b17c7dbcdd36057f62b68eb80d4b483699deb56ab6b4&scene=0#rd"},{"Title":"纽博格林开启重返F1赛历谈判","Digest":"德国纽博格林赛道已经与F1管理方开启谈话，讨论于2019年重返F1赛历的可能性。纽博格林赛道近年来遭遇的持续","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/UqK6oktXmLVlqL4IPgicYmf6Gib7MZo39MQpO8zHxbkGMCJ475Bq0NkkgDAztJS7xNd0TbUe6gMKhyaUOctUKZ1w/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzI0Nzc0Njk5Mw==&mid=2247488148&idx=4&sn=a838fe3e1556926e5dc66fc61125c7d4&chksm=e9aa0a4adedd835cd526e1604ce5b781ac965e8bd60b3392627cd7f150b76acff66998011a25&scene=0#rd"}],"Time":1515328783,"NickName":"利来文化"},{"UserName":"@5d1525da38b1d1ac2f9671db10bd31bc","MPArticleCount":1,"MPArticleList":[{"Title":"顽主儿","Digest":"最近生病，感冒发烧多日，人变得有些敏感，翻翻旧文，过去的生活一幕一幕又浮现在眼前。人生苦短，且行且记录，老来多回忆\u2026\u2026","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/l2OjqibWhGIQGvIfu9K6bMZouXWPOVcwuCsia88MHGes0H7gugJkyuhhGISo8xVQ82ggRCwXPtxjUz9m5CDpGWQQ/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIzNDU4OTMwMA==&mid=2247484738&idx=1&sn=64eb4bffb7b585f312b2f609df4d9d00&chksm=e8f55859df82d14fedadb85709470d090bb12bcf52707bfd4df936e2963029bd54c51c96b1c5&scene=0#rd"}],"Time":1515233944,"NickName":"我是腾腾爸"},{"UserName":"@8d621d928d505352fc95de7afc229dcd","MPArticleCount":2,"MPArticleList":[{"Title":"梅赛德斯总是在可靠性的渴求上登峰造极","Digest":"梅赛德斯的引擎研发团队表示，他们总是把引擎和动力单元的性能和可靠性推向极限，即使在2018赛季车手和车队都将","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/UqK6oktXmLWgAicasxalJ2cey1SF2MibGAtDWSavQwly63LZyB7XZMC1KqHUBCibNEB4eukWTGeDcthlbeHTN1iaSA/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzI0Nzc0Njk5Mw==&mid=2247488135&idx=1&sn=a1c25ad012182d3233fd08fb23d9c406&chksm=e9aa0a59dedd834fe4fcbcbdf2602960994286c0d4e86277a498c74df79f951e348b3cff71f7&scene=0#rd"},{"Title":"迈凯伦青年车手诺里斯想在戴通纳的比赛中证明自己的实力","Digest":"2017赛季欧洲F3冠军诺里斯将与迈凯伦车队车手阿隆索以及菲尔-汉森一起参加本月即将进行的戴通纳24小时的比","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/UqK6oktXmLWgAicasxalJ2cey1SF2MibGAEm3BWmIMgd6TpibA1sR4eqdekV987CczBt09bA3bpFBeJVknTXcpdpQ/300?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzI0Nzc0Njk5Mw==&mid=2247488135&idx=2&sn=ec84775982f2b4d13497c52b15775cfc&chksm=e9aa0a59dedd834f29633b58cd24abe1b33f1cb2529f315c4bdc0f0a83197d6b8d9c8ce32ce3&scene=0#rd"}],"Time":1515211233,"NickName":"利来文化"},{"UserName":"@5d1525da38b1d1ac2f9671db10bd31bc","MPArticleCount":1,"MPArticleList":[{"Title":"非理性中的理性\u2014\u2014美凯龙","Digest":"此文后边有几点思考和声明，敬请关注\u2026\u2026","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/l2OjqibWhGIQpK3jZicbwqBicG7aHOX4tAoGsd0PmGjbHKmCWiaRR8iaVppChbeJTl7qCicITkONEECjICtIc9E7pf5Q/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIzNDU4OTMwMA==&mid=2247484737&idx=1&sn=d5edece90ba00fb42bf799bc54c27557&chksm=e8f5585adf82d14c8859a694ef5ed60c2eab6cf26ff551cc01cb8ed5a83215c6b58aef70b222&scene=0#rd"}],"Time":1515148214,"NickName":"我是腾腾爸"}]
     * ClickReportInterval : 600000
     */

    private BaseResponseBean BaseResponse;
    private int Count;
    private SyncKeyBean SyncKey;
    private UserBean User;
    private String ChatSet;
    private String SKey;
    private int ClientVersion;
    private int SystemTime;
    private int GrayScale;
    private int InviteStartCount;
    private int MPSubscribeMsgCount;
    private int ClickReportInterval;
    private List<ContactModel> ContactList;
    private List<MPSubscribeMsgListBean> MPSubscribeMsgList;

    public BaseResponseBean getBaseResponse() {
        return BaseResponse;
    }

    public void setBaseResponse(BaseResponseBean BaseResponse) {
        this.BaseResponse = BaseResponse;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }

    public SyncKeyBean getSyncKey() {
        return SyncKey;
    }

    public void setSyncKey(SyncKeyBean SyncKey) {
        this.SyncKey = SyncKey;
    }

    public UserBean getUser() {
        return User;
    }

    public void setUser(UserBean User) {
        this.User = User;
    }

    public String getChatSet() {
        return ChatSet;
    }

    public void setChatSet(String ChatSet) {
        this.ChatSet = ChatSet;
    }

    public String getSKey() {
        return SKey;
    }

    public void setSKey(String SKey) {
        this.SKey = SKey;
    }

    public int getClientVersion() {
        return ClientVersion;
    }

    public void setClientVersion(int ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    public int getSystemTime() {
        return SystemTime;
    }

    public void setSystemTime(int SystemTime) {
        this.SystemTime = SystemTime;
    }

    public int getGrayScale() {
        return GrayScale;
    }

    public void setGrayScale(int GrayScale) {
        this.GrayScale = GrayScale;
    }

    public int getInviteStartCount() {
        return InviteStartCount;
    }

    public void setInviteStartCount(int InviteStartCount) {
        this.InviteStartCount = InviteStartCount;
    }

    public int getMPSubscribeMsgCount() {
        return MPSubscribeMsgCount;
    }

    public void setMPSubscribeMsgCount(int MPSubscribeMsgCount) {
        this.MPSubscribeMsgCount = MPSubscribeMsgCount;
    }

    public int getClickReportInterval() {
        return ClickReportInterval;
    }

    public void setClickReportInterval(int ClickReportInterval) {
        this.ClickReportInterval = ClickReportInterval;
    }

    public List<ContactModel> getContactList() {
        return ContactList;
    }

    public void setContactList(List<ContactModel> ContactList) {
        this.ContactList = ContactList;
    }

    public List<MPSubscribeMsgListBean> getMPSubscribeMsgList() {
        return MPSubscribeMsgList;
    }

    public void setMPSubscribeMsgList(List<MPSubscribeMsgListBean> MPSubscribeMsgList) {
        this.MPSubscribeMsgList = MPSubscribeMsgList;
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

    public static class SyncKeyBean {
        /**
         * Count : 4
         * List : [{"Key":1,"Val":670490270},{"Key":2,"Val":670490286},{"Key":3,"Val":670490200},{"Key":1000,"Val":1515398757}]
         */

        private int Count;
        private java.util.List<ListBean> List;

        public int getCount() {
            return Count;
        }

        public void setCount(int Count) {
            this.Count = Count;
        }

        public List<ListBean> getList() {
            return List;
        }

        public void setList(List<ListBean> List) {
            this.List = List;
        }

        public static class ListBean {
            /**
             * Key : 1
             * Val : 670490270
             */

            private int Key;
            private int Val;

            public int getKey() {
                return Key;
            }

            public void setKey(int Key) {
                this.Key = Key;
            }

            public int getVal() {
                return Val;
            }

            public void setVal(int Val) {
                this.Val = Val;
            }
        }
    }

    public static class UserBean {
        /**
         * Uin : 2925514351
         * UserName : @271e7309f508bcf320c784bca0a51fd6d81e0224842b036d5f90b785e4fc343b
         * NickName : 测试APP
         * HeadImgUrl : /cgi-bin/mmwebwx-bin/webwxgeticon?seq=683716767&username=@271e7309f508bcf320c784bca0a51fd6d81e0224842b036d5f90b785e4fc343b&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2
         * RemarkName :
         * PYInitial :
         * PYQuanPin :
         * RemarkPYInitial :
         * RemarkPYQuanPin :
         * HideInputBarFlag : 0
         * StarFriend : 0
         * Sex : 0
         * Signature :
         * AppAccountFlag : 0
         * VerifyFlag : 0
         * ContactFlag : 0
         * WebWxPluginSwitch : 0
         * HeadImgFlag : 0
         * SnsFlag : 1
         */

        private long Uin;
        private String UserName;
        private String NickName;
        private String HeadImgUrl;
        private String RemarkName;
        private String PYInitial;
        private String PYQuanPin;
        private String RemarkPYInitial;
        private String RemarkPYQuanPin;
        private int HideInputBarFlag;
        private int StarFriend;
        private int Sex;
        private String Signature;
        private int AppAccountFlag;
        private int VerifyFlag;
        private int ContactFlag;
        private int WebWxPluginSwitch;
        private int HeadImgFlag;
        private int SnsFlag;

        public long getUin() {
            return Uin;
        }

        public void setUin(long Uin) {
            this.Uin = Uin;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getNickName() {
            return NickName;
        }

        public void setNickName(String NickName) {
            this.NickName = NickName;
        }

        public String getHeadImgUrl() {
            return HeadImgUrl;
        }

        public void setHeadImgUrl(String HeadImgUrl) {
            this.HeadImgUrl = HeadImgUrl;
        }

        public String getRemarkName() {
            return RemarkName;
        }

        public void setRemarkName(String RemarkName) {
            this.RemarkName = RemarkName;
        }

        public String getPYInitial() {
            return PYInitial;
        }

        public void setPYInitial(String PYInitial) {
            this.PYInitial = PYInitial;
        }

        public String getPYQuanPin() {
            return PYQuanPin;
        }

        public void setPYQuanPin(String PYQuanPin) {
            this.PYQuanPin = PYQuanPin;
        }

        public String getRemarkPYInitial() {
            return RemarkPYInitial;
        }

        public void setRemarkPYInitial(String RemarkPYInitial) {
            this.RemarkPYInitial = RemarkPYInitial;
        }

        public String getRemarkPYQuanPin() {
            return RemarkPYQuanPin;
        }

        public void setRemarkPYQuanPin(String RemarkPYQuanPin) {
            this.RemarkPYQuanPin = RemarkPYQuanPin;
        }

        public int getHideInputBarFlag() {
            return HideInputBarFlag;
        }

        public void setHideInputBarFlag(int HideInputBarFlag) {
            this.HideInputBarFlag = HideInputBarFlag;
        }

        public int getStarFriend() {
            return StarFriend;
        }

        public void setStarFriend(int StarFriend) {
            this.StarFriend = StarFriend;
        }

        public int getSex() {
            return Sex;
        }

        public void setSex(int Sex) {
            this.Sex = Sex;
        }

        public String getSignature() {
            return Signature;
        }

        public void setSignature(String Signature) {
            this.Signature = Signature;
        }

        public int getAppAccountFlag() {
            return AppAccountFlag;
        }

        public void setAppAccountFlag(int AppAccountFlag) {
            this.AppAccountFlag = AppAccountFlag;
        }

        public int getVerifyFlag() {
            return VerifyFlag;
        }

        public void setVerifyFlag(int VerifyFlag) {
            this.VerifyFlag = VerifyFlag;
        }

        public int getContactFlag() {
            return ContactFlag;
        }

        public void setContactFlag(int ContactFlag) {
            this.ContactFlag = ContactFlag;
        }

        public int getWebWxPluginSwitch() {
            return WebWxPluginSwitch;
        }

        public void setWebWxPluginSwitch(int WebWxPluginSwitch) {
            this.WebWxPluginSwitch = WebWxPluginSwitch;
        }

        public int getHeadImgFlag() {
            return HeadImgFlag;
        }

        public void setHeadImgFlag(int HeadImgFlag) {
            this.HeadImgFlag = HeadImgFlag;
        }

        public int getSnsFlag() {
            return SnsFlag;
        }

        public void setSnsFlag(int SnsFlag) {
            this.SnsFlag = SnsFlag;
        }
    }



    public static class MPSubscribeMsgListBean {
        /**
         * UserName : @5d1525da38b1d1ac2f9671db10bd31bc
         * MPArticleCount : 1
         * MPArticleList : [{"Title":"如何看待股市神人，其实就是如何看待我们自己","Digest":"股市神人，你信吗？我说我信，你信吗？","Cover":"http://mmbiz.qpic.cn/mmbiz_jpg/l2OjqibWhGIQuscsZ9or0RJoVgNjBPFz0RgfG96tiaVCqzicyjQFHQfpxsxiaSPnWAdpoSPQ1lAqJnabHpkAzUcYXg/640?wxtype=jpeg&wxfrom=0","Url":"http://mp.weixin.qq.com/s?__biz=MzIzNDU4OTMwMA==&mid=2247484749&idx=1&sn=37354cf05e9823ede0652ff6a1e9dc8e&chksm=e8f55856df82d1403c5e7c44e8aa97a8d9bf7594d0ad6578b866c72f8921792c08a6cd1707f6&scene=0#rd"}]
         * Time : 1515336887
         * NickName : 我是腾腾爸
         */

        private String UserName;
        private int MPArticleCount;
        private int Time;
        private String NickName;
        private List<MPArticleListBean> MPArticleList;

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public int getMPArticleCount() {
            return MPArticleCount;
        }

        public void setMPArticleCount(int MPArticleCount) {
            this.MPArticleCount = MPArticleCount;
        }

        public int getTime() {
            return Time;
        }

        public void setTime(int Time) {
            this.Time = Time;
        }

        public String getNickName() {
            return NickName;
        }

        public void setNickName(String NickName) {
            this.NickName = NickName;
        }

        public List<MPArticleListBean> getMPArticleList() {
            return MPArticleList;
        }

        public void setMPArticleList(List<MPArticleListBean> MPArticleList) {
            this.MPArticleList = MPArticleList;
        }

        public static class MPArticleListBean {
            /**
             * Title : 如何看待股市神人，其实就是如何看待我们自己
             * Digest : 股市神人，你信吗？我说我信，你信吗？
             * Cover : http://mmbiz.qpic.cn/mmbiz_jpg/l2OjqibWhGIQuscsZ9or0RJoVgNjBPFz0RgfG96tiaVCqzicyjQFHQfpxsxiaSPnWAdpoSPQ1lAqJnabHpkAzUcYXg/640?wxtype=jpeg&wxfrom=0
             * Url : http://mp.weixin.qq.com/s?__biz=MzIzNDU4OTMwMA==&mid=2247484749&idx=1&sn=37354cf05e9823ede0652ff6a1e9dc8e&chksm=e8f55856df82d1403c5e7c44e8aa97a8d9bf7594d0ad6578b866c72f8921792c08a6cd1707f6&scene=0#rd
             */

            private String Title;
            private String Digest;
            private String Cover;
            private String Url;

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public String getDigest() {
                return Digest;
            }

            public void setDigest(String Digest) {
                this.Digest = Digest;
            }

            public String getCover() {
                return Cover;
            }

            public void setCover(String Cover) {
                this.Cover = Cover;
            }

            public String getUrl() {
                return Url;
            }

            public void setUrl(String Url) {
                this.Url = Url;
            }
        }
    }
}
