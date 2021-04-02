package com.huajia.seckill.single;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath:dubbo-provider.xml")
@SpringBootApplication
@MapperScan("com.huajia.seckill.single.dao")
public class SeckillSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillSingleApplication.class, args);
    }

}
