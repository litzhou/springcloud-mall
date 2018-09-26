package com.dxy.app.test.mysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhougaojun
 * @since 2018/09/25
 **/
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserRestory userRestory;

    @RequestMapping("/list")
    public List<User> list() {
        return userRestory.findAll();
    }

    @RequestMapping("/add")
    public boolean add(String name) {
        userRestory.save(User.builder().name(name).build());
        return true;
    }

    @RequestMapping("/update")
    public boolean add(Long id, String name) {
        userRestory.save(User.builder().id(id).name(name).build());
        return true;
    }

    @RequestMapping("/delete")
    public boolean add(Long id) {
        userRestory.deleteById(id);
        return true;
    }
}

