package com.hyh.cloud.give.bag.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangbo
 * 
 * 服务：投资使用红包
 *
 */
@RestController
@RefreshScope
@ConfigurationProperties
@RequestMapping("/invest")
public class UseUserBagService {
	
	@ResponseBody
	@RequestMapping("/use")
	public void give(@RequestBody int pageNum,int pageSize) {
		
		
	}
	
}
