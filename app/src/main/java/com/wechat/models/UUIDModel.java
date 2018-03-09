package com.wechat.models;

import java.io.Serializable;

/**
 * Created by wiki on 2018/3/6.
 */

public class UUIDModel implements Serializable{
    /**
     * code : 200
     * uuid : 4ZeI5tqo8A==
     */

    private int code;
    private String uuid;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
