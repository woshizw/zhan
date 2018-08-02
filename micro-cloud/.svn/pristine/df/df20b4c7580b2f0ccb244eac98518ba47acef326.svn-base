package com.zhan.cloud.service.ucs.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.zhan.commons.base.constant.SystemUniqueCode;
@ConfigurationProperties
@Component
public class SystemCode implements SystemUniqueCode{
	@Value("${system.unique.code}")
	private String sucValue;

	public String getSucValue() {
		return sucValue;
	}

	public void setSucValue(String sucValue) {
		this.sucValue = sucValue;
	}

	

}
