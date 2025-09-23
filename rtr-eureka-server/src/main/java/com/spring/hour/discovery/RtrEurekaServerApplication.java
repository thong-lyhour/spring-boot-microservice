package com.spring.hour.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RtrEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RtrEurekaServerApplication.class, args);
    }

}
