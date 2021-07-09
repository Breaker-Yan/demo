package com.gateway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "order-provider", value = "order-provider")
public interface TestService {
    @RequestMapping("/hello")
    String home();
}
