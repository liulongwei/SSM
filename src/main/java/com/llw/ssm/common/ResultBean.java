package com.llw.ssm.common;

public class ResultBean {

    private boolean success;

    private String msg;

    private Object data;

    public boolean getFlag() {
        return success;
    }

    public void setFlag(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}