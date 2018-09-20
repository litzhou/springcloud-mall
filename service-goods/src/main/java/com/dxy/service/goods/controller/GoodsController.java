package com.dxy.service.goods.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhougaojun
 * @since 2018/08/30
 **/
@RestController
@Slf4j
public class GoodsController {

    @RequestMapping(value = "/")
    public String hello(String name) {
        log.info("goods service");
        return "goods service";
    }
}

 