package com.dailycodebuffer.serviceregistryv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryV3Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryV3Application.class, args);
    }

}
