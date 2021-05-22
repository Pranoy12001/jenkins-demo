package com.pranoyit.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {
    private static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);
    public static void main(String[] args) {
        logger.info("Application started");
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
