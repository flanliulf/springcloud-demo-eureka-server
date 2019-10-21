package com.fancyliu.springcloud.demo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudDemoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudDemoEurekaServerApplication.class, args);
    }

}
