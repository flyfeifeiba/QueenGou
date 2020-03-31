package com.example.aopdemo;

import com.example.aopdemo.module.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName TestLoggerAdvice
 * @Description TODO
 * @Author yuanyuan.wang
 * @Date 2020/3/31 20:06
 * @Version 1.0
 */
@SpringBootTest
public class TestLoggerAdvice {
    @Autowired
    private TestService testService;

    @Test
    public void testAop() {
        testService.testFunction("彼得堡");
    }
}
