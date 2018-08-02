//package com.hyh.cloud.website;
//
//import org.springframework.beans.factory.annotation.Value;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//import org.springframework.session.web.http.CookieHttpSessionStrategy;
//import org.springframework.session.web.http.DefaultCookieSerializer;
//
//@Configuration  
//@EnableRedisHttpSession
//
//public class HttpSessionConfig { 
//	@Value("${cookie.path}")
//	private String cookiePath;
//	@Value("${cookie.name}")
//	private String cookieName;
//	@Value("${cookie.domain}")
//	private String cookieDomain;
//     @Bean  
//     public CookieHttpSessionStrategy cookieHttpSessionStrategy() {  
//         CookieHttpSessionStrategy strategy = new CookieHttpSessionStrategy();
//         DefaultCookieSerializer cookieSerializer=new DefaultCookieSerializer();
//         cookieSerializer.setCookiePath(cookiePath);
//         cookieSerializer.setCookieName(cookieName);
//         cookieSerializer.setDomainName(cookieDomain);
//         strategy.setCookieSerializer(cookieSerializer);  
//         return strategy;  
//     }  
//}  