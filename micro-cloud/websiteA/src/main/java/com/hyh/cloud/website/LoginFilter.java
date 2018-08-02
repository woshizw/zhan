package com.hyh.cloud.website;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.hyh.cloud.commons.base.dto.SessionUserDTO;
import com.hyh.cloud.passport.service.client.PassportClient;

public class LoginFilter implements Filter {

	private static final String SESSION_USER = "SESSION_USER";
	private static final String SESSION_VALUE_KEY = "SESSION_VALUE_KEY";

	@Autowired
	private PassportClient passportClient;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String contextPath = request.getScheme() + "://"
				+ request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath() + request.getServletPath();
		HttpSession session = request.getSession();
		String token = request.getParameter("token");
		SessionUserDTO user = null;
		//
		if ("true".equals(request.getParameter("passportChecked")) && token == null) {
			chain.doFilter(request, response);
			return;
		}

		if (session.getAttribute(SESSION_VALUE_KEY) != null) {
			user = passportClient.checkVKey((String) session
					.getAttribute(SESSION_VALUE_KEY));
			if (user != null) {
				session.setAttribute(SESSION_USER, user);
				response.sendRedirect("http://my.hyh.dev:8436/loginPage?redirectUrl="
						+ contextPath + "&forceLogin=true");
			}

		} else if (token == null) {

			response.sendRedirect("http://my.hyh.dev:8436/loginPage?redirectUrl="
					+ contextPath + "&forceLogin=true");
			return;

		} else {
			user = passportClient.getUserByTockenFromSSO(token);
			if (user == null) {
				response.sendRedirect("http://my.hyh.dev:8436/loginPage?redirectUrl="
						+ contextPath + "&forceLogin=true");
			} else {
				session.setAttribute(SESSION_USER, user);
			}
		}

		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {

	}

}
