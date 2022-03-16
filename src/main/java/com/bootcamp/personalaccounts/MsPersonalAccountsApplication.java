package com.bootcamp.personalaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsPersonalAccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsPersonalAccountsApplication.class, args);
    }

}
