package com.hyh.cloud.sso.client.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyh.cloud.sso.client.dto.UserToken;

@FeignClient(name = "${cloud.sso.service.id}")
public interface SSORemoteClient {
	
	/**
	 * 用户登录接口
	 */
	@ResponseBody
	@RequestMapping("/sso/login")
	public UserToken userSSOLogin(@RequestBody final UserToken userToken);
	/**
	 * 用户登出接口
	 * @param param
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/sso/logout")
	public UserToken userSSOLogout(@RequestBody final UserToken userToken);
	/**
	 * 票据验证
	 * @param param
	 * @return 
	 */
	@ResponseBody
	@RequestMapping("/sso/check")
	public UserToken tokenSSOCheck(@RequestBody final UserToken userToken);

}
