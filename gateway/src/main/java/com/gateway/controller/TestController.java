package com.gateway.controller;

import com.gateway.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className: TestController
 * @description:
 * @author: yanchenyang
 * @date: 2021/7/9
 **/
@RestController
public class TestController {
    private @Resource TestService testService;

    @RequestMapping("/hello")
    public String home() {
        return testService.home();
    }
}
