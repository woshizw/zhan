package com.zhan.cloud.commons.cache;

/**
 * 回调接口，用来实现缓存没有key时新生成key
 * @author zhangw
 *
 */
public interface CacheRemoteCallback {
	 public <T> T remoteCallback();
	

}
