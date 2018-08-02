package com.hyh.cloud.ucs.remote.client;

import java.util.Map;





import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyh.cloud.commons.base.dto.ResultDto;
import com.hyh.cloud.commons.base.remote.PageData;
import com.hyh.cloud.ucs.remote.client.dto.Ucs;


@FeignClient(name = "${cloud.ucs.service.id}")
public interface UserRemoteClient {
	@ResponseBody
	@RequestMapping("/user/detail")
	public ResultDto<Ucs> findById(@RequestBody Long id) ;
	@ResponseBody
	@RequestMapping("/user/create")
	public ResultDto<Integer> createUser(@RequestBody Ucs user) ;
	
	@ResponseBody
	@RequestMapping(value="/user/getUser",method = RequestMethod.POST)
	public ResultDto<Ucs> getUser(@RequestBody Ucs user);
	

	/**
	 * 分页查询list
	 * 
	 * @param pageNumber
	 * @param number
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/all")
	public ResultDto<PageData<Ucs>> findAll(@RequestBody Map map);
	/**
	 * 通过redis返回value,如果此key没有value,则通过回调函数生成数据set到redis
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/cache")
	public ResultDto<Ucs> userCache(@RequestBody Long id) ;

}
