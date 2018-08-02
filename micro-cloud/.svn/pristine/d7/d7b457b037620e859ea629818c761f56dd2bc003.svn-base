package com.hyh.cloud.website;
import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean versionFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(loginFilter());
		registration.addUrlPatterns("/*");
		registration.addInitParameter("paramName", "paramValue");
		registration.setName("versionFilter");
		registration.setOrder(6);
		return registration;
	}

	
	@Bean
	public Filter loginFilter() {
		return new LoginFilter();
	}

	

}
