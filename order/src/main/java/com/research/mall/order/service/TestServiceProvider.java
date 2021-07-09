package com.research.mall.order.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: TestServiceProvider
 * @description:
 * @author: yanchenyang
 * @date: 2021/7/9
 **/
@RestController
public class TestServiceProvider {
    @RequestMapping("/hello")
    public String home() {
        return "Hello world, port 8087";
    }
}
