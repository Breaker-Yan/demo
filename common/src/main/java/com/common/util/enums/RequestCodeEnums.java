package com.common.util.enums;

public enum RequestCodeEnums {
    SUCCESS(200, "操作成功"),
    PARAMS_ABNORMAL(400, "请求参数异常"),
    ERROR(500, "系统异常");

    private Integer code;
    private String message;

    RequestCodeEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
