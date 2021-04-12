package com.research.mall.demo.controller;

import com.research.mall.demo.entity.ResultJson;
import com.research.mall.demo.query.HelloWorldQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * smart-doc调试入口
 *
 * @author yanchenyang
 * @since 2021/03/12
 **/
@RestController
public class HelloWorldController {

    /**
     * TestHello
     *
     * @param query 请求参数
     * @return Res
     */
    @GetMapping("/hello")
    public ResultJson helloApiTest(HelloWorldQuery query) {
        return new ResultJson(String.format("Hello %s", query.getName1()));
    }
}
