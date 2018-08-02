package com.hyh.cloud.service.ucs.service.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhan.cloud.UcsApplication;
import com.zhan.cloud.service.ucs.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = UcsApplication.class)
public class UserApplicationTest {
	@Autowired
	private UserService userService;
	@Test
	public void findId() throws Exception {
		assertThat(userService.findById(1L).getUserName()).isEqualTo("we");

	}
	@Test
	public void findId1() throws Exception {
		assertThat(userService.findById(1L).getUserName()).isEqualTo("we");

	}
	
	

}
