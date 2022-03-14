package com.guli.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2022/2/23 21:32
 * @description：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationProduct {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationProduct.class,args);
    }
}
