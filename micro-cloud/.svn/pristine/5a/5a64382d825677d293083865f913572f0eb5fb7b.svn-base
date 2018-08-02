package com.hyh.cloud.give.bag.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hyh.cloud.give.bag.bean.UserDiscount;

/**
 * @author zhangbo
 * 
 * 服务：前段礼包展示
 * 我的红包、我的现金券、我的加息券、我的体验金
 *
 */
@RestController
@RefreshScope
@ConfigurationProperties
@RequestMapping("/front")
public class FrontDisplayBagService {
	
	@ResponseBody
	@RequestMapping("/display")
	public void give(@RequestBody int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);  
		List<UserDiscount> list = new ArrayList<UserDiscount>();
		PageInfo<UserDiscount> pageInfo = new PageInfo<UserDiscount>(list);
		pageInfo.getList();
		pageInfo.getPageNum();//页码
		pageInfo.getPageSize();//每页大小
		pageInfo.getPages();//总页数
		pageInfo.getTotal();//总条数
	}	
}
