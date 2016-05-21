package com.absurd.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/5/21.
 */
public class RetDTO implements Serializable{
    private String resMsg;
    private int resCode;

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }
}
