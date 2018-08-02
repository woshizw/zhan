package com.zhan.cloud.service.ucs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhan.cloud.service.entity.User;


@Mapper
public interface UserMapper {
		User selectByPrimaryKey(@Param("id") Long id);
	    List<User> selectAll();
	    User selectUser(User user);
	   
	    Integer creatUser(User city);

}
