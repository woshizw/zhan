package com.zhan.cloud.sequence.remote.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "${cloud.sequence.service.id}")
public interface SequenceRemoteClient {
	/**
	 * 获取sequenceId，通过类的simplename来做keyname
	 * @param keyName
	 * @return
	 */
	
	@ResponseBody
	@RequestMapping("/sequence/generate")
	public  Long generateSequence(@RequestBody final String keyName);

}
