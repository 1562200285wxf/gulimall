package com.guli.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2022/3/7 23:15
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationCoupon {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationCoupon.class,args);
    }
}
