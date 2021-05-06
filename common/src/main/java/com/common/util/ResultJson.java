package com.common.util;

import com.common.util.enums.RequestCodeEnums;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * @className: ResultJson
 * @description:
 * @author: yanchenyang
 * @date: 2021/5/6
 **/
public class ResultJson<T> implements Serializable {
    private static final long serialVersionUID = 1287241471096383727L;

    private Integer status;
    private String message;
    private T data;

    public static <T> ResultJson<T> success(T data) {
        ResultJson<T> resultJson = new ResultJson<>();
        resultJson.data = data;
        resultJson.message = RequestCodeEnums.SUCCESS.getMessage();
        resultJson.status = RequestCodeEnums.SUCCESS.getCode();
        return resultJson;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
