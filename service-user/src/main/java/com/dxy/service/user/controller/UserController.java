package com.dxy.service.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhougaojun
 * @since 2018/08/30
 **/
@RestController
@Slf4j
public class UserController {

    @RequestMapping(value = "/")
    public String hello(String name) {
        log.info("user service");
        return "user service";
    }
}

 