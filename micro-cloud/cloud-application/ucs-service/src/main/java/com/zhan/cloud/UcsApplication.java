package com.zhan.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableFeignClients
public class UcsApplication {
  public static void main(String[] args) {
    SpringApplication.run(UcsApplication.class, args);
  }
}