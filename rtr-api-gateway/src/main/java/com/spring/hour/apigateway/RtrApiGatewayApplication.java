package com.spring.hour.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RtrApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RtrApiGatewayApplication.class, args);
    }

}
