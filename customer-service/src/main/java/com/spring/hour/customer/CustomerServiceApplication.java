package com.spring.hour.customer;

import com.spring.hour.customer.config.props.DatabaseProps;
import com.spring.hour.customer.config.props.ServiceInfoProps;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableConfigurationProperties(value = {
        ServiceInfoProps.class,
        DatabaseProps.class
})
@SpringBootApplication
public class CustomerServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
