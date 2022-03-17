package com.bootcamp.personalaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsPersonalAccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPersonalAccountsApplication.class, args);
    }

}
