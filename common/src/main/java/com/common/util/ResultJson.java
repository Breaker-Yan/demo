package com.common.util;

import com.common.util.enums.RequestCodeEnums;
import lombok.Getter;

import java.io.Serializable;

/**
 * @className: ResultJson
 * @description:
 * @author: yanchenyang
 * @date: 2021/5/6
 **/
@Getter
public class ResultJson<T> implements Serializable {
    private static final long serialVersionUID = 1287241471096383727L;
    private static final String SUCCESS_MESSAGE = "操作成功";

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
}
