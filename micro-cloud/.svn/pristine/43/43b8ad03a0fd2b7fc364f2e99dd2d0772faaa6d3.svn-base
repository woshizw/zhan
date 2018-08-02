package com.hyh.cloud.client.ucs.business;

import java.util.HashMap;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hyh.cloud.commons.base.remote.PageData;
import com.hyh.cloud.sequence.remote.client.SequenceRemoteClient;
import com.hyh.cloud.sso.client.UamsWebClient;
import com.hyh.cloud.ucs.remote.client.UserRemoteClient;
import com.hyh.cloud.ucs.remote.client.dto.Ucs;

@RestController("ucsControllerV3")
@RefreshScope
@RequestMapping(value = "/version/3")
public class UcsControllerV3 {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(UcsControllerV3.class);

	

	@Autowired
	private SequenceRemoteClient sequenceRemoteClient;

	@Resource
	private UamsWebClient uamsWebClient;
	
	
	@Autowired
	private UserRemoteClient userRemoteClient;

	/**
	 * 注册用户并登陆
	 * 
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @return
	 */
	@GetMapping("/ucs/user/{userName}/{password}")
	public Ucs create(HttpServletRequest request, HttpServletResponse response,
			@PathVariable String userName, @PathVariable String password) {
		Long id = this.sequenceRemoteClient.generateSequence(Ucs.class.getSimpleName());		
		Ucs user = new Ucs();
		user.setId(id);
		user.setUserName(userName);
		user.setPassword(password);
		this.userRemoteClient.createUser(user).getModel();

		try {

			uamsWebClient.buildToken(request, response, userName,
					id.toString(), request.getSession().getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	/**
	 * 注册用户并登陆
	 * 
	 * @param request
	 * @param response
	 * @param userName
	 * @param password
	 * @return
	 */

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public<T> ModelAndView login(String redirectURL, HttpServletRequest request,
			HttpServletResponse response) {

		Ucs user = new Ucs();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		user.setUserName(userName);
		user.setPassword(password);
		
		//MDC.put("userId", "hahahahaha");
		user = this.userRemoteClient.getUser(user).getModel();
				
		ModelAndView mv = new ModelAndView();
		try {
		
			uamsWebClient.buildToken(request, response, userName, user
					.getId().toString(), request.getSession(true).getId());
			mv.setViewName("welcome");
			mv.addObject("userId", user.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@GetMapping("/ucs/{id}")
	public Ucs findById(HttpServletRequest request,
			HttpServletResponse response, @PathVariable Long id) {
		try {
			if (uamsWebClient.isLogined(request, response)) {
				return this.userRemoteClient.findById(id).getModel();
			}
		} catch (Exception e) {
			LOGGER.error("查找用户失败", e);
		}

		return null;

	}
	

	@SuppressWarnings("unchecked")
	@GetMapping("/ucs/all/{pageNumber}/{pageSize}")
	public PageData<Ucs> getCityAll(HttpServletRequest request,
			HttpServletResponse response, @PathVariable int pageNumber,
			@PathVariable int pageSize) {

		try {
			if (uamsWebClient.isLogined(request, response)) {

				Map<String, Integer> map = new HashMap<String, Integer>();
				map.put("pageNumber", pageNumber);
				map.put("pageSize", pageSize);
				
				/*return this.ucsRemoteClient.sendRemoteRequest("/user/all", map,
						PageData.class);*/
		
				return userRemoteClient.findAll(map).getModel();
			}
		} catch (Exception e) {
			LOGGER.error("登录错误", e);
			e.printStackTrace();
		}

		return new PageData();
	}

	@GetMapping("/ucs/sequence")
	public Long getSequenceId() {

		return this.sequenceRemoteClient.generateSequence(Ucs.class.getSimpleName());
	}

	
	@GetMapping("/ucs/cache/{id}")
	public Ucs getCache(@PathVariable Long id) {
		return this.userRemoteClient.userCache(id).getModel();
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Ucs fallback(Long id) {
		UcsControllerV3.LOGGER.info("异常发生，进入fallback方法，获取Id" + id + "失败");
		return new Ucs();

	}

	public ModelAndView fallbackLogin(String redirectURL,
			HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView();

	}

	@RequestMapping("/loginPage")
	public ModelAndView hello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("loginPage");
		return mv;
	}
}
