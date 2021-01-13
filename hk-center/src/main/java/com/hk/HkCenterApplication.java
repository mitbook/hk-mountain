package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengzhengfa
 */
@EnableEurekaClient
@SpringBootApplication
public class HkCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HkCenterApplication.class, args);
    }

}
