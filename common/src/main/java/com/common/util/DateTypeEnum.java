package com.common.util;

public enum DateTypeEnum {
    SECONDS("SECONDS", "秒"),
    MINUTES("MINUTES", "分钟"),
    HOURS("HOURS", "小时"),
    DAY("DAY", "天"),
    MONTH("MONTH", "月"),
    YEAR("YEAR", "年");

    DateTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    private String type;
    private String desc;
}
