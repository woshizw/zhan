package com.hyh.cloud.commons.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.FilterConfig;





public class VersionFilter implements Filter{
	private final static String VERSION="version";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		//HttpServletResponse res=(HttpServletResponse)response;
		String version=req.getParameter(VERSION);
		String uri=req.getRequestURI();
		if(uri.startsWith("/"+VERSION)){
			chain.doFilter(request, response);
		}
		else if(version!=null && !version.trim().equals("")){
			uri="/"+VERSION+"/"+version+uri;
			req.getRequestDispatcher(uri).forward(request, response);
		}else{
			chain.doFilter(request, response);
		}
		

	}

	@Override
	public void destroy() {

	}


}
