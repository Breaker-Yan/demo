package com.common.util;

import org.junit.jupiter.api.Test;

import java.time.Instant;

class DateUtilTest {
    @Test
    void should_get_one_day_time_correctly() {
        Instant now = Instant.now();
        Instant afterDate = DateUtil.afterDate(1, DateTypeEnum.DAY, now);

    }
}