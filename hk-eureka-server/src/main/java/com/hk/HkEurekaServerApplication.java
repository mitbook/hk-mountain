package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author pengzhengfa
 */
@EnableEurekaServer
@SpringBootApplication
public class HkEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HkEurekaServerApplication.class, args);
    }

}
