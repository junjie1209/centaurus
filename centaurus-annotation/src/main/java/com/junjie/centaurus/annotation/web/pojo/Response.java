package com.junjie.centaurus.annotation.web.pojo;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

public class Response<T> implements Serializable {
    /**
     * 响应数据
     */
    private T date;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应描述信息
     */
    private String message;

    public Response(T date, Integer code, String message) {
        super();
        this.date = date;
        this.code = code;
        this.message = message;
    }


    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
