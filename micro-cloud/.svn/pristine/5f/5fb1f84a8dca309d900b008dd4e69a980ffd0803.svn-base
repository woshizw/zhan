package com.hyh.cloud.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.hyh.cloud.client.ucs.business.UcsController;
import com.hyh.cloud.commons.base.dto.ResultDto;
import com.hyh.cloud.commons.base.remote.PageData;
import com.hyh.cloud.sequence.remote.client.SequenceRemoteClient;
import com.hyh.cloud.sso.client.UamsWebClient;
import com.hyh.cloud.ucs.remote.client.UserRemoteClient;
import com.hyh.cloud.ucs.remote.client.dto.Ucs;
import com.hyh.commons.base.constant.SystemUniqueCode;

/**
 * 对于controller/client的unit test,凡是调用的service都用mock来控制,而不是调用实际的service,
 * 这样可以避免环境造成影响,因为仅仅是为了测试本代码的逻辑,service的测试由其自身完成,集成测试再测试才需相互调用
 * @author zhangw
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UcsClientApplicationTest {
	@Autowired
	private UcsController ucsController;
	
	@MockBean
	private SequenceRemoteClient sequenceRemoteClient;
	@MockBean
	private UamsWebClient uamsWebClient;
	
	
	@MockBean
	private UserRemoteClient userRemoteClient;
	@Mock
	private HttpServletRequest request;
	@Mock
	private HttpServletResponse response;
	@Mock
	private SystemUniqueCode sysCode;

	@Test
	public void exampleTest() {
		
		
		try {
			PageData<Ucs> page = new PageData<Ucs>();
			page.setEndRow(100);
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("pageNumber", 1);
			map.put("pageSize", 2);
		
			given(this.userRemoteClient.findAll(map)).willReturn(new ResultDto(page, sysCode));
			given(this.uamsWebClient.isLogined(request, response)).willReturn(true);
			assertThat(ucsController.getCityAll(request, response, 1, 2).getEndRow()).isEqualTo(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ucsController.getCityAll(request, response, 1, 2);
	//	Ucs body = this.restTemplate.getForObject("http://localhost:8435/ucs/cache/1", Ucs.class);
	//	assertThat(body.toString()).isEqualTo("Hello World");
	}

}
