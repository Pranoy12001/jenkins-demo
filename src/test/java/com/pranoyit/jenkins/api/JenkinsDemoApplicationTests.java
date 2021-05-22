package com.pranoyit.jenkins.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {
    private static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);
    @Test
    @DisplayName("test running")
    void contextLoads() {
        logger.info("test case executing");
        Assertions.assertEquals(true, true);
    }

}
