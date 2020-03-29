package com.wyy.seckill;

import com.alibaba.druid.support.json.JSONUtils;
import com.wyy.seckill.service.UserService;
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

    @Test
    public void contextLoads() {
    }

    @Test
    public void getUserById() {
        logger.info(JSONUtils.toJSONString(userService.getById(1)));
    }

}
