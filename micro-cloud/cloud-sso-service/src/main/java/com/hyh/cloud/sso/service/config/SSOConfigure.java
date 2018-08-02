package com.hyh.cloud.sso.service.config;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class SSOConfigure {
	@Value("${sso.login.timeout}")
	private String loginTimeout;
	@Value("${sso.login.cacheidkey}")
	private String cacheIdKey;
	
	public Long getLoginTimeout() {
		if(StringUtils.isNotBlank(loginTimeout)){
			return Long.valueOf(loginTimeout);
		}
		return 0L;
	}

	public String getCacheIdKey() {
		return cacheIdKey;
	}
	

}
