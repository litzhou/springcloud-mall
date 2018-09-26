package com.dxy.app.test.redis;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author zhougaojun
 * @since 2018/09/26
 **/
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/count")
    public String count() {
        int val = NumberUtils.toInt(redisTemplate.opsForValue().get("count"), 0);
        redisTemplate.opsForValue().set("count", String.valueOf(val + 1), 1, TimeUnit.HOURS);
        return "this is count " + val;
    }
}

 