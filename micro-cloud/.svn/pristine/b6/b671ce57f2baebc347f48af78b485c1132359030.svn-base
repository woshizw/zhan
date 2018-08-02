package com.hyh.cloud.client.ucs.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


public class MyWebConfig extends WebMvcConfigurerAdapter{

    /**
     * 注册 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration ir =registry.addInterceptor(new VersionInterceptor());
        // 配置拦截的路径
        ir.addPathPatterns("/**");
        // 配置不拦截的路径
        ir.excludePathPatterns("/**.html");
    }

}