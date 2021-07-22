package com.zyf.ivanmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zyf.ivanmall.product.dao")
@SpringBootApplication
public class IvanmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(IvanmallProductApplication.class, args);
    }

}
