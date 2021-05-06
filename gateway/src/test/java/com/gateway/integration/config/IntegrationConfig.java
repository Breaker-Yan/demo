package com.gateway.integration.config;

import com.common.util.ResultJson;
import com.gateway.GatewayApplication;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.net.URI;
import java.util.Map;

/**
 * @className: IntegrationTest
 * @description:
 * @author: yanchenyang
 * @date: 2021/5/6
 **/
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = GatewayApplication.class)
public class IntegrationConfig {
    private @Resource TestRestTemplate testRestTemplate;

    /**
     * Get
     */
    protected <T> ResponseEntity<T> get(String url, Class<T> responseType, Map<String, Object> params) {
        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(params, getHeader());

        ResultJson<String> resultJson = new ResultJson<>();
        Class entityClass = (Class) ((ParameterizedType) resultJson.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        ResponseEntity exchange = testRestTemplate.exchange(url, HttpMethod.GET, httpEntity, entityClass, params);
        Object body = exchange.getBody();
        return testRestTemplate.exchange(url, HttpMethod.GET, httpEntity, responseType, params);
    }

    /**
     * POST request
     *
     * @param url          请求url
     * @param responseType 响应类型
     * @param params       请求参数
     * @return 返回值
     */
    protected <T> ResponseEntity<T> post(String url, Class<T> responseType, Map<String, Object> params) {
        return getResponseEntity(url, params, HttpMethod.POST, responseType);
    }

    /**
     * put request
     *
     * @param url          请求url
     * @param responseType 响应类型
     * @param params       请求参数
     * @return 返回值
     */
    protected <T> ResponseEntity<T> put(String url, Class<T> responseType, Map<String, Object> params) {
        return getResponseEntity(url, params, HttpMethod.PUT, responseType);
    }

    /**
     * delete request
     *
     * @param url          请求url
     * @param responseType 响应类型
     * @param params       请求参数
     * @return 返回值
     */
    protected <T> ResponseEntity<T> delete(String url, Class<T> responseType, Map<String, Object> params) {
        return getResponseEntity(url, params, HttpMethod.DELETE, responseType);
    }

    private <T> ResponseEntity<T> getResponseEntity(String url, Map<String, Object> params,
                                                    HttpMethod method, Class<T> responseType) {
        RequestEntity<Map<String, Object>> requestEntity = new RequestEntity<>(params, getHeader(), method, URI.create(url));
        return testRestTemplate.exchange(requestEntity, responseType);
    }

    private HttpHeaders getHeader() {
        return new HttpHeaders();
    }
}
