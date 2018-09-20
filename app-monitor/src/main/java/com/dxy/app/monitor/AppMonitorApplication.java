package com.dxy.app.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * app monitor
 *
 * @author zhougaojun
 * @since 2018-08-30
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableDiscoveryClient
public class AppMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppMonitorApplication.class, args);
    }
}
