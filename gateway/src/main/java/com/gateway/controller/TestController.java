package com.gateway.controller;

import com.gateway.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
    @Value("${prot2}")
    private Integer prot2;

    @RequestMapping("/hello")
    public String home() {
        String home = testService.home();
        return String.format("%s;config %s", home, prot2);
    }
}
