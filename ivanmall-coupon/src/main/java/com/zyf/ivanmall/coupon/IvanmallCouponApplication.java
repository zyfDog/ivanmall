package com.zyf.ivanmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class IvanmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(IvanmallCouponApplication.class, args);
    }

}
