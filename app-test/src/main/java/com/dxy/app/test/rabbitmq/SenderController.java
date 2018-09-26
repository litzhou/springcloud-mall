package com.dxy.app.test.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhougaojun
 * @since 2018/09/26
 **/
@RequestMapping("/rabbitmq")
@RestController
public class SenderController {


    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/send")
    public String send(String message) {

        System.out.println("Send message: " + message);
        this.amqpTemplate.convertAndSend("hello", message);
        return "ok";
    }
}

 