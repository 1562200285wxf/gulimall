package com.guli.member;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2022/3/6 20:43
 * @description：
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.guli.member.feign"})
@EnableDiscoveryClient
public class ApplicationMember {
    public static void main(String[] args) {
        ConfigurableListableBeanFactory factory = SpringApplication.run(ApplicationMember.class,args).getBeanFactory();
    }
}
