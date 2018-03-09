package com.wechat.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wiki on 2018/3/9.
 */

public class ContactModel implements Serializable{
    /**
     * Uin : 0
     * UserName : weixin
     * NickName : 微信团队
     * HeadImgUrl : /cgi-bin/mmwebwx-bin/webwxgeticon?seq=639240080&username=weixin&skey=@crypt_52d06394_166c40342208aa2c7f60276652b782e2
     * ContactFlag : 1
     * MemberCount : 0
     * MemberList : []
     * RemarkName :
     * HideInputBarFlag : 0
     * Sex : 0
     * Signature : 微信团队官方帐号
     * VerifyFlag : 56
     * OwnerUin : 0
     * PYInitial : WXTD
     * PYQuanPin : weixintuandui
     * RemarkPYInitial :
     * RemarkPYQuanPin :
     * StarFriend : 0
     * AppAccountFlag : 0
     * Statues : 0
     * AttrStatus : 4
     * Province :
     * City :
     * Alias :
     * SnsFlag : 0
     * UniFriend : 0
     * DisplayName :
     * ChatRoomId : 0
     * KeyWord : wei
     * EncryChatRoomId :
     * IsOwner : 0
     */

    private int Uin;
    private String UserName;
    private String NickName;
    private String HeadImgUrl;
    private int ContactFlag;
    private int MemberCount;
    private String RemarkName;
    private int HideInputBarFlag;
    private int Sex;
    private String Signature;
    private int VerifyFlag;
    private int OwnerUin;
    private String PYInitial;
    private String PYQuanPin;
    private String RemarkPYInitial;
    private String RemarkPYQuanPin;
    private int StarFriend;
    private int AppAccountFlag;
    private int Statues;
    private int AttrStatus;
    private String Province;
    private String City;
    private String Alias;
    private int SnsFlag;
    private int UniFriend;
    private String DisplayName;
    private int ChatRoomId;
    private String KeyWord;
    private String EncryChatRoomId;
    private int IsOwner;
    private List<?> MemberList;

    public int getUin() {
        return Uin;
    }

    public void setUin(int Uin) {
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

    public int getContactFlag() {
        return ContactFlag;
    }

    public void setContactFlag(int ContactFlag) {
        this.ContactFlag = ContactFlag;
    }

    public int getMemberCount() {
        return MemberCount;
    }

    public void setMemberCount(int MemberCount) {
        this.MemberCount = MemberCount;
    }

    public String getRemarkName() {
        return RemarkName;
    }

    public void setRemarkName(String RemarkName) {
        this.RemarkName = RemarkName;
    }

    public int getHideInputBarFlag() {
        return HideInputBarFlag;
    }

    public void setHideInputBarFlag(int HideInputBarFlag) {
        this.HideInputBarFlag = HideInputBarFlag;
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

    public int getVerifyFlag() {
        return VerifyFlag;
    }

    public void setVerifyFlag(int VerifyFlag) {
        this.VerifyFlag = VerifyFlag;
    }

    public int getOwnerUin() {
        return OwnerUin;
    }

    public void setOwnerUin(int OwnerUin) {
        this.OwnerUin = OwnerUin;
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

    public int getStarFriend() {
        return StarFriend;
    }

    public void setStarFriend(int StarFriend) {
        this.StarFriend = StarFriend;
    }

    public int getAppAccountFlag() {
        return AppAccountFlag;
    }

    public void setAppAccountFlag(int AppAccountFlag) {
        this.AppAccountFlag = AppAccountFlag;
    }

    public int getStatues() {
        return Statues;
    }

    public void setStatues(int Statues) {
        this.Statues = Statues;
    }

    public int getAttrStatus() {
        return AttrStatus;
    }

    public void setAttrStatus(int AttrStatus) {
        this.AttrStatus = AttrStatus;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public int getSnsFlag() {
        return SnsFlag;
    }

    public void setSnsFlag(int SnsFlag) {
        this.SnsFlag = SnsFlag;
    }

    public int getUniFriend() {
        return UniFriend;
    }

    public void setUniFriend(int UniFriend) {
        this.UniFriend = UniFriend;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public int getChatRoomId() {
        return ChatRoomId;
    }

    public void setChatRoomId(int ChatRoomId) {
        this.ChatRoomId = ChatRoomId;
    }

    public String getKeyWord() {
        return KeyWord;
    }

    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    public String getEncryChatRoomId() {
        return EncryChatRoomId;
    }

    public void setEncryChatRoomId(String EncryChatRoomId) {
        this.EncryChatRoomId = EncryChatRoomId;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "Uin=" + Uin +
                ", UserName='" + UserName + '\'' +
                ", NickName='" + NickName + '\'' +
                ", HeadImgUrl='" + HeadImgUrl + '\'' +
                ", ContactFlag=" + ContactFlag +
                ", MemberCount=" + MemberCount +
                ", RemarkName='" + RemarkName + '\'' +
                ", HideInputBarFlag=" + HideInputBarFlag +
                ", Sex=" + Sex +
                ", Signature='" + Signature + '\'' +
                ", VerifyFlag=" + VerifyFlag +
                ", OwnerUin=" + OwnerUin +
                ", PYInitial='" + PYInitial + '\'' +
                ", PYQuanPin='" + PYQuanPin + '\'' +
                ", RemarkPYInitial='" + RemarkPYInitial + '\'' +
                ", RemarkPYQuanPin='" + RemarkPYQuanPin + '\'' +
                ", StarFriend=" + StarFriend +
                ", AppAccountFlag=" + AppAccountFlag +
                ", Statues=" + Statues +
                ", AttrStatus=" + AttrStatus +
                ", Province='" + Province + '\'' +
                ", City='" + City + '\'' +
                ", Alias='" + Alias + '\'' +
                ", SnsFlag=" + SnsFlag +
                ", UniFriend=" + UniFriend +
                ", DisplayName='" + DisplayName + '\'' +
                ", ChatRoomId=" + ChatRoomId +
                ", KeyWord='" + KeyWord + '\'' +
                ", EncryChatRoomId='" + EncryChatRoomId + '\'' +
                ", IsOwner=" + IsOwner +
                ", MemberList=" + MemberList +
                '}';
    }

    public int getIsOwner() {
        return IsOwner;
    }

    public void setIsOwner(int IsOwner) {
        this.IsOwner = IsOwner;
    }

    public List<?> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<?> MemberList) {
        this.MemberList = MemberList;
    }
}
