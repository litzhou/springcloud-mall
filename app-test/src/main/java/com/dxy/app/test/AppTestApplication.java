package com.dxy.app.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * app test
 *
 * @author zhougaojun
 * @since 2018-08-30
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class AppTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppTestApplication.class, args);
    }
}
