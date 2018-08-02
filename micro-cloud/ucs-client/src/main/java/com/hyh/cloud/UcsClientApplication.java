package com.hyh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 使用@EnableCircuitBreaker注解开启断路器功能
 * @author eacdy
 */
@SpringBootApplication
@EnableDiscoveryClient
/*@EnableCircuitBreaker*/
@EnableFeignClients
public class UcsClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(UcsClientApplication.class, args);
  }
}
