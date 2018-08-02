package com.hyh.cloud.sso.client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyh.cloud.sso.client.configure.CookieConfigure;
import com.hyh.cloud.sso.client.dto.UserToken;
import com.hyh.cloud.sso.client.remote.SSORemoteClient;

@Service
public class UamsWebClient {
	private final Logger logger = Logger.getLogger(UamsWebClient.class);
	@Autowired
	private CookieConfigure cookieConfigure;
	
	@Autowired
	private SSORemoteClient ssoRemoteClient;
	

	

	/**
	 * 构建Token
	 * 
	 * @param loginName
	 * @param userId
	 * @param sessionId
	 * @throws Exception
	 */
	public void buildToken(HttpServletRequest request,
			HttpServletResponse response, String loginName, String userId,
			String sessionId) throws Exception {

		UserToken ut = new UserToken();

		ut.setLoginName(loginName);

		ut.setUserID(userId);

		ut.setSessionId(sessionId);

		UserToken rut = ssoRemoteClient.userSSOLogin(ut);
					
		
		if (rut != null && rut.getOperatorResult() == 1) {

			updateToken(response, rut);
		}

	}


	public boolean isLogined(HttpServletRequest request,HttpServletResponse response) throws Exception {

		UserToken ut = getUserCookiesToken(request);
		if (ut == null) {
			logger.warn("do not find cookies token!");
			return false;
		}

		UserToken rut = ssoRemoteClient.tokenSSOCheck(ut);

		if (rut != null && rut.getOperatorResult() == 1) {
			updateToken(response,rut);

			return true;
		}

		return false;

	}

	/**
	 * 判断是否登录
	 * 
	 * @return
	 * @throws Exception
	 */
	public boolean isLogined(HttpServletRequest request,HttpServletResponse response,String tokenKey, String token) throws Exception {

		UserToken ut = getUserCookiesToken(request,tokenKey, token);
		if (ut == null) {
			logger.warn("do not find cookies token!");
			return false;
		}

		UserToken rut  = ssoRemoteClient.tokenSSOCheck(ut);

		if (rut != null && rut.getOperatorResult() == 1) {
			updateToken(response,tokenKey, token, rut);

			return true;
		}

		return false;

	}

	/**
	 * 判断是否登录
	 * 
	 * @return
	 * @throws Exception
	 */
	public UserToken getTokenInfo(HttpServletRequest request,HttpServletResponse response) throws Exception {

		UserToken ut = getUserCookiesToken(request);
		if (ut == null) {
			return null;
		}

		UserToken rut = ssoRemoteClient.userSSOLogout(ut);
		if (rut != null && rut.getOperatorResult() == 1) {
			updateToken(response,rut);

			return rut;
		}

		return null;

	}
	
	/**
	 *  从单点登录服务上获取登录用户Id
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String getloginId (HttpServletRequest request,HttpServletResponse response) throws Exception {

		UserToken userToken =getTokenInfo(request,response);
		if(userToken == null){
			return null;
		}else{
			return userToken.getUserID();
		}

	}
	/**
	 * 从单点登录服务上获取登录用户名
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String getLoginName (HttpServletRequest request,HttpServletResponse response) throws Exception {

		UserToken userToken =getTokenInfo(request,response);
		if(userToken == null){
			return null;
		}else{
			return userToken.getLoginName();
		}

	}

	/**
	 * 销毁Token
	 * 
	 * @throws Exception
	 */
	public void destoryToken(HttpServletResponse response,HttpServletRequest request) throws Exception {

		UserToken ut = getUserCookiesToken(request);
		if (ut != null) {
			UserToken rut = ssoRemoteClient.userSSOLogout(ut);
		}

		clearUserToken(response);

	}

	protected UserToken getUserCookiesToken(HttpServletRequest request) {

		String token = getCookieValue(request,cookieConfigure
				.getUserTokenName());

		String tokenKeyCacheKey = getCookieValue(request,cookieConfigure
				.getUserTokenKeyCacheName());

		if (token == null || tokenKeyCacheKey == null) {

			return null;
		}

		UserToken userToken = new UserToken();

		userToken.setToken(token);

		userToken.setTokenKey_Cache_Key(tokenKeyCacheKey);

		return userToken;
	}

	protected UserToken getUserCookiesToken(HttpServletRequest request,String tokenKey, String token) {

		String tokenVal = getCookieValue(request,token);

		String tokenKeyCacheKey = getCookieValue(request,tokenKey);

		if (tokenVal == null || tokenKeyCacheKey == null) {

			return null;
		}

		UserToken userToken = new UserToken();

		userToken.setToken(tokenVal);

		userToken.setTokenKey_Cache_Key(tokenKeyCacheKey);

		return userToken;
	}

	private void updateToken(
			HttpServletResponse response, UserToken ut) {
		try {

			setCookie(response, cookieConfigure.getUserTokenName(),
					URLEncoder.encode(ut.getToken(), "UTF-8"),
					cookieConfigure.getDomain(), -1);

			setCookie(response, cookieConfigure.getUserTokenKeyCacheName(),
					URLEncoder.encode(ut.getTokenKey_Cache_Key(), "UTF-8"),
					cookieConfigure.getDomain(), -1);

			logger.info("set cookies token value [domain:"
					+ cookieConfigure.getDomain()
					+ cookieConfigure.getUserTokenName() + ":" + ut.getToken()
					+ "]");

		} catch (UnsupportedEncodingException e) {
			clearUserToken(response);

			logger.error(e);
		}
	}

	public void setCookie(HttpServletResponse response, String name,
			String value, String domain, int expire) {

		Cookie cookie = new Cookie(name, value);

		cookie.setDomain(domain);

		cookie.setPath("/");

		if (expire >= 0) {

			cookie.setMaxAge(expire);

		}

		response.addCookie(cookie);
	}

	private void updateToken(HttpServletResponse response, String tokenKey,
			String token, UserToken ut) {
		try {

			setCookie(response, token,
					URLEncoder.encode(ut.getToken(), "UTF-8"),
					cookieConfigure.getDomain(), -1);

			setCookie(response, tokenKey,
					URLEncoder.encode(ut.getTokenKey_Cache_Key(), "UTF-8"),
					cookieConfigure.getDomain(), -1);

			logger.info("set cookies token value [domain:"
					+ cookieConfigure.getDomain()
					+ cookieConfigure.getUserTokenName() + ":" + ut.getToken()
					+ "]");

		} catch (UnsupportedEncodingException e) {
			clearUserToken(response);

			logger.error(e);
		}
	}

	protected void clearUserToken(HttpServletResponse response) {

		clearUserToken(response,cookieConfigure.getUserTokenName());

		clearUserToken(response,cookieConfigure.getUserTokenKeyCacheName());
	}

	protected void clearUserToken(HttpServletResponse response,String cookieName) {

		clearCookie(response,cookieName, cookieConfigure.getDomain());

	}

	public void clearCookie(HttpServletResponse response,String name, String domain) {

		setCookie(response,name, "", domain, 0);
	}

	
	/**
	 *@Descripton: 获取COOKIE
	 *@author: twotoo
	 *@time: 2012-2-15 下午04:24:29
	 * @param name
	 * @return
	 */
	public String getCookieValue(HttpServletRequest request,String name) {

		logger.info("Cookie Name=" + name);

		Cookie[] cookies = request.getCookies();

		if (cookies == null) {

			logger.warn("cookies is null");

			return null;
		}

		Cookie cookie = null;

		for (int i = 0; i < cookies.length; i++) {

			cookie = cookies[i];

			logger.info("cookieName" + i + ":: " + cookie.getName());

			if (cookie.getName().equalsIgnoreCase(name)) {

				logger.info("cookie value=" + cookie.getValue());

				return cookie.getValue();
			}
		}

		return null;

	}
}
