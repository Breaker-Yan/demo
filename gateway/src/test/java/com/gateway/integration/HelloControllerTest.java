package com.gateway.integration;

import com.common.util.ResultJson;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @className: HelloControlerTest
 * @description:
 * @author: yanchenyang
 * @date: 2021/5/6
 **/
public class HelloControllerTest {
    @Test
    void should_send_get_request_and_result_data_correctly() {

    }
}

@RestController
@RequestMapping("/test")
class HelloController {

    @GetMapping("/get")
    public ResultJson<Map<String, Object>> getRequest() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("result", "get");
        return ResultJson.success(map);
    }
}
