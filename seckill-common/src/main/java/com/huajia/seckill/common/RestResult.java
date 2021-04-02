package com.huajia.seckill.common;

import lombok.Data;

@Data
public class RestResult {
    private int code;
    private Object data;
    private String message;


    public RestResult() {
    }

    public RestResult(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static<T> RestResult ok(T data) {
        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setData(data);
        restResult.setMessage("ok");
        return restResult;
    }


}
