package com.gateway.integration;

import com.common.util.ResultJson;
import com.gateway.integration.config.IntegrationConfig;
import com.gateway.integration.vo.HelloVO;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @className: HelloControlerTest
 * @description:
 * @author: yanchenyang
 * @date: 2021/5/6
 **/
public class HelloControllerTest extends IntegrationConfig {
    @Test
    void should_send_get_request_and_result_data_correctly() {
        ResultJson<HelloVO> resultJson = get("/test/get", HelloVO.class, ImmutableMap.of());
        assert resultJson != null;
        assertThat(resultJson.getStatus()).isEqualTo(200);
        assertThat(resultJson.getMessage()).isEqualTo("操作成功");
        assertThat(resultJson.getData().getResult()).isEqualTo("get");
    }
}

@RestController
@RequestMapping("/test")
class HelloController {

    @GetMapping("/get")
    public ResultJson<HelloVO> getRequest() {
        HelloVO helloVO = new HelloVO("get");
        return ResultJson.success(helloVO);
    }
}