package com.wyy.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.wyy.seckill.utils.redis")
@MapperScan("com.wyy.seckill.dao")
public class SeckillApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeckillApplication.class, args);
	}

}
