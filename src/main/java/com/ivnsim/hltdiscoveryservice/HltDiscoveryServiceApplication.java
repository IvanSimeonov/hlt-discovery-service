package com.ivnsim.hltdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HltDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HltDiscoveryServiceApplication.class, args);
    }

}
