package com.wechat.utils;

import android.util.Xml;

import com.wechat.models.RedirectResultModel;

import org.xmlpull.v1.XmlPullParser;

import java.io.InputStream;

/**
 * Created by wiki on 2018/3/6.
 */

public class XmlParse {
    public static RedirectResultModel readXML(InputStream inStream) {
        XmlPullParser parser = Xml.newPullParser();
        try {
            parser.setInput(inStream, "UTF-8");// 设置数据源编码
            int eventType = parser.getEventType();// 获取事件类型
            RedirectResultModel redirectResultModel = new RedirectResultModel();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:// 文档开始事件,可以进行数据初始化处理
                        break;
                    case XmlPullParser.START_TAG://开始读取某个标签
                        //通过getName判断读到哪个标签，然后通过nextText()获取文本节点值，或通过getAttributeValue(i)获取属性节点值
                        String name = parser.getName();
                        if (name.equalsIgnoreCase("ret")) {
                            redirectResultModel.setRet(Integer.parseInt(parser.nextText()));
                        }
                        if (name.equalsIgnoreCase("message")) {
                            redirectResultModel.setMessage(parser.nextText());
                        }
                        if (name.equalsIgnoreCase("skey")) {
                            redirectResultModel.setSkey(parser.nextText());
                        }
                        if (name.equalsIgnoreCase("wxsid")) {
                            redirectResultModel.setWxsid(parser.nextText());
                        }
                        if (name.equalsIgnoreCase("wxuin")) {
                            redirectResultModel.setWxuin(parser.nextText());
                        }
                        if (name.equalsIgnoreCase("pass_ticket")) {
                            redirectResultModel.setPass_ticket(parser.nextText());
                        }
                        if (name.equalsIgnoreCase("isgrayscale")) {
                            redirectResultModel.setIsgrayscale(Integer.parseInt(parser.nextText()));
                        }
                        break;
                    case XmlPullParser.END_TAG:// 结束元素事件

                        break;
                }
                eventType = parser.next();
            }
            inStream.close();
            return redirectResultModel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
