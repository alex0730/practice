package com.wyy.seckill;

import com.alibaba.druid.support.json.JSONUtils;
import com.wyy.seckill.service.UserService;
import com.wyy.seckill.utils.redis.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillApplicationTests {

    private Logger logger = LoggerFactory.getLogger(SeckillApplicationTests.class);


    @Autowired
    UserService userService;

    @Autowired
    RedisUtils redisUtils;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getUserById() {
        logger.info(JSONUtils.toJSONString(userService.getById(1)));
    }

    @Test
    public void testReids() {
        redisUtils.set("test", "1");
    }

}
