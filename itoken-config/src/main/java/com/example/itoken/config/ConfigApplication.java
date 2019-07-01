/**
 * Copyright (c) 2019 ucsmy.com, All rights reserved.
 */
package com.example.itoken.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Project itoken
 * @Package com.example.itoken.config
 * @ClassName ConfigApplication
 * @Description
 * @JDK version used 1.8
 * @Author subeishi
 * @Create Date 2019/07/01
 * @modify By
 * @modify Date
 * @Why&amp;What is modify
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}