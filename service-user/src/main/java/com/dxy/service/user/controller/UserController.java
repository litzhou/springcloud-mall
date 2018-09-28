package com.dxy.service.user.controller;

import com.dxy.service.user.model.User;
import com.dxy.service.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhougaojun
 * @since 2018/08/30
 **/
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String hello(String name) {
        log.info("user service");
        return "user service";
    }

    @RequestMapping("/list")
    public List<User> list() {
        return userService.listAll();
    }

    @RequestMapping("/add")
    public User add(User user) {
        return userService.save(user).get();
    }

    @RequestMapping("/delete")
    public String delete(Long id) {
        userService.delete(id);
        return "ok";

    }
}

 