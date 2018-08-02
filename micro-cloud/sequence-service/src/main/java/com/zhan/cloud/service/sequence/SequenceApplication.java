package com.zhan.cloud.service.sequence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableHystrix
public class SequenceApplication {
  public static void main(String[] args) {
    SpringApplication.run(SequenceApplication.class, args);
  }
 /*@Bean
  public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet(){

     HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();

     ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean = new ServletRegistrationBean<HystrixMetricsStreamServlet>(streamServlet);

     registrationBean.setLoadOnStartup(1);

     registrationBean.addUrlMappings("/hystrix.stream");

     registrationBean.setName("HystrixMetricsStreamServlet");


     return registrationBean;
  }*/
}