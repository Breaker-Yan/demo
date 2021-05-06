package com.gateway.integration;

import com.common.util.ResultJson;
import com.gateway.integration.config.IntegrationConfig;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        ResponseEntity<HelloVO> responseEntity = get("/test/get", HelloVO.class, ImmutableMap.of());
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
  /*      ResultJson<HelloVO> resultJson = (ResultJson<HelloVO>) responseEntity.getBody();
        assert resultJson != null;
        assertThat(resultJson.getStatus()).isEqualTo(200);
        assertThat(resultJson.getMessage()).isEqualTo("操作成功");
        assertThat(resultJson.getData().getResult()).isEqualTo("get");*/
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

class HelloVO {
    private String result;

    public HelloVO(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
