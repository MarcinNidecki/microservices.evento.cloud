package com.nidecki.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class AppRunner extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }

}
