package com.hom.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @version 1.0
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class SpringRestProviderBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringRestProviderBootstrap.class,args);
    }
}
