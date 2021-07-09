package com.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @className: TestController
 * @description:
 * @author: yanchenyang
 * @date: 2021/7/9
 **/
@RestController
public class TestController {
    private @Resource RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String home() {
        return restTemplate.getForEntity("http://order-provider/hello", String.class).getBody();
    }
}
