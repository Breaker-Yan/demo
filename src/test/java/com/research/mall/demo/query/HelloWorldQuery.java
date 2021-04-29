package com.research.mall.demo.query;

/**
 * @className: HelloWorldQuery
 * @description:
 * @author: yanchenyang
 * @date: 2021/4/12
 **/
public class HelloWorldQuery {
    /**
     * 姓名
     */
    private final String name1;
    private final HelloWorldQueryTwo query2;

    public HelloWorldQuery(String name1, HelloWorldQueryTwo query2) {
        this.name1 = name1;
        this.query2 = query2;
    }

    public String getName1() {
        return name1;
    }

    public HelloWorldQueryTwo getQuery2() {
        return query2;
    }
}
