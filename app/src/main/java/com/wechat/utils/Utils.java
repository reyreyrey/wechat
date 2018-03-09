package com.wechat.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Random;

/**
 * Created by wiki on 2018/3/6.
 */

public class Utils {

    public static InputStream getStringInputStream(String s) {
        if (s != null && !s.equals("")) {
            try {

                ByteArrayInputStream stringInputStream = new ByteArrayInputStream(
                        s.getBytes());
                return stringInputStream;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String getFixLenthString(int strLength) {
        Random rm = new Random();
        // 获得随机数
        double pross = (1 + rm.nextDouble()) * Math.pow(10, strLength);
        // 将获得的获得随机数转化为字符串
        String fixLenthString = String.valueOf(pross);
        // 返回固定的长度的随机数
        return fixLenthString.substring(1, strLength + 1);
    }
}
