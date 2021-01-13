package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengzhengfa
 */
@EnableEurekaClient
@SpringBootApplication
public class HkMeetApplication {

    public static void main(String[] args) {
        SpringApplication.run(HkMeetApplication.class, args);
    }

}
