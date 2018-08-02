package com.hyh.cloud.website;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hyh.cloud.commons.base.dto.SessionUserDTO;
import com.hyh.cloud.passport.service.client.PassportClient;


@RestController
@RefreshScope
public class MemberController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(MemberController.class);
	
	private static final String SESSION_USER="SESSION_USER";
	private static final String SESSION_VALUE_KEY="SESSION_VALUE_KEY";

	@Autowired
	private PassportClient passportClient;
	
	

	
	@RequestMapping(value="/welcome")
	public ModelAndView welcome(HttpServletRequest request,
			HttpServletResponse response, @RequestParam(value="token",required = false) String token) {
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		
		SessionUserDTO user = null;
		/*mv.setViewName("welcome");
		if("true".equals(request.getParameter("checked"))){
			return mv;
		}
		String contextPath = request.getScheme() +"://" + request.getServerName() + ":" +request.getServerPort() +request.getContextPath()+request.getServletPath();
		*//**
		 * 不能通过拦截器或过滤器控制
		 *//*
		
		if(session.getAttribute(SESSION_VALUE_KEY)!=null){
			user = passportClient.checkVKey((String)session.getAttribute(SESSION_VALUE_KEY));
			if(user!=null){
				session.setAttribute(SESSION_USER, user);
				return mv;
			}
			
			
		}		
		if(token==null ){
			
			mv.setViewName("redirect:http://my.hyh.dev:8436/loginPage?redirectUrl="+contextPath+"&forceLogin=true");
			return mv;
		}else {
			user = passportClient.getUserByTockenFromSSO(token);
			if(user==null){
				mv.setViewName("redirect:http://my.hyh.dev:8436/loginPage?redirectUrl="+contextPath+"&forceLogin=true");
			}else{
				session.setAttribute(SESSION_USER, user);
			}
		}
		*/
		//mv.setViewName("redirect:http://my.hyh.dev:8436/loginPage");
		
		return mv;
	}
	
	
	@RequestMapping(value="/recheck")
	public ModelAndView recheck(HttpServletRequest request,
			HttpServletResponse response, @RequestParam(value="token",required = false) String token) {
		HttpSession session = request.getSession();
		ModelAndView mv = new ModelAndView();
		SessionUserDTO user = null;
		mv.setViewName("welcome");
		String contextPath = request.getScheme() +"://" + request.getServerName() + ":" +request.getServerPort() +request.getContextPath()+request.getServletPath();
		/**
		 * 不能通过拦截器或过滤器控制
		 */
	
		
		if(session.getAttribute(SESSION_VALUE_KEY)!=null){
			SessionUserDTO sessionUser = passportClient.checkVKey((String)session.getAttribute(SESSION_VALUE_KEY));
			if(sessionUser!=null){
				return mv;
			}
			
			
		}		
		if(token==null ){
			
			mv.setViewName("redirect:http://my.hyh.dev:8436/loginPage?redirectUrl="+contextPath);
			return mv;
		}else {
			user = passportClient.getUserByTockenFromSSO(token);
			if(user==null){
				mv.setViewName("redirect:http://my.hyh.dev:8436/loginPage?redirectUrl="+contextPath);
			}else{
				session.setAttribute(SESSION_VALUE_KEY, user.getVkey());
				session.setAttribute(SESSION_USER, user);
			}
		}
		
		//mv.setViewName("redirect:http://my.hyh.dev:8436/loginPage");
		
		return mv;
	}
	
	
	

	

}
