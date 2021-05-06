package com.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @className: DataConversion
 * @description: This is data structure conversion
 * @author: yanchenyang
 * @date: 2021/5/6
 **/
public class DataConversion {

    /**
     * Object to bean
     *
     * @param map    传参
     * @param tClass 返回类型
     */
    public static <T> T toBean(Object map, Class<T> tClass) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(map, tClass);
    }
}
