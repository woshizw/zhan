package com.hyh.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 使用@EnableCircuitBreaker注解开启断路器功能
 * @author zhangw
 */
@SpringBootApplication
@EnableDiscoveryClient
/*@EnableCircuitBreaker*/
@EnableFeignClients

@EnableRedisHttpSession(maxInactiveIntervalInSeconds=80)
public class WebsiteApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebsiteApplication.class, args);
  }
}
