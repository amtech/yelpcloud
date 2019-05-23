package com.evol.provider.usc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //从Edgware开始，该注解可省略
@SpringBootApplication
public class YelpProviderUscApplication {

    public static void main(String[] args) {
        SpringApplication.run(YelpProviderUscApplication.class, args);
    }

}
