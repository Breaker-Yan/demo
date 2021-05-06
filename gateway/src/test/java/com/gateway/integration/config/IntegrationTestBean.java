package com.gateway.integration.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @className: IntegrationTestBean
 * @description:
 * @author: yanchenyang
 * @date: 2021/5/6
 **/
@TestConfiguration
public class IntegrationTestBean {

    @Bean
    public RestTemplate testRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
