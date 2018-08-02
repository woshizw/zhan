package com.zhan.cloud.commons.cache;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import com.zhan.cloud.commons.base.constant.RedisConstant;

/**
 * redis工具类
 * 
 * @author zhangw
 *
 * @param <K>
 * @param <V>
 */
@ConfigurationProperties
@Component
public class RedisCacheUtil<K, V> {

	@Resource
	private RedisTemplate<K, V> redisTemplate;

	@SuppressWarnings("unchecked")
	/**
	 * 当从缓存中取值且key不存在时,将调用CacheRemoteCallback中的remoteCallback()方法
	 * 例如：
	 * util.get("test", String.class,new CacheRemoteCallback(){

			@Override
			public <T> T remoteCallback() {
				return (T)"ttttttt";
			}
			
		});
	 * @param key
	 * @param entity
	 * @param ca
	 * @return
	 */
	public <T> T get(Object key, Class<?> entity, CacheRemoteCallback ca) {
		ValueOperations<K, V> valueOperations = redisTemplate.opsForValue();
		V value = valueOperations.get(composeKey(key, entity.getName()));
		if (value == null) {
			T obj = ca.remoteCallback();
			setKey(key, entity, (V) obj);
			return obj;
		} else {
			return (T) value;
		}

	}

	/**
	 * 将key和entity的类名组合成新的key
	 * 
	 * @param key
	 * @param entity
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(Object key, Class<?> entity) {
		ValueOperations<K, V> valueOperations = redisTemplate.opsForValue();

		return (T) valueOperations.get(composeKey(key, entity.getName()));
	}

	/**
	 * 通过真实的key取缓存的数据
	 * 
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(Object key) {
		ValueOperations<K, V> valueOperations = redisTemplate.opsForValue();

		return (T) valueOperations.get(key);
	}

	/**
	 * 将key和entity的类名组合成新的key
	 * 
	 * @param key
	 * @param className
	 * @return
	 */
	private static String composeKey(Object key, String className) {
		StringBuilder str = new StringBuilder();
		str.append(className);
		str.append(RedisConstant.CHARACTER);
		str.append(key);
		return str.toString();
	}

	/**
	 * 将key和entity的类名组合成新的key
	 * 
	 * @param key
	 * @param entity
	 * @param object
	 */
	@SuppressWarnings("unchecked")
	public <T> void setKey(Object key, Class<?> entity, Object object) {

		ValueOperations<K, V> valueOperations = (ValueOperations<K, V>) redisTemplate
				.opsForValue();

		valueOperations.set((K) composeKey(key, entity.getName()), (V)object);
	}

	/**
	 * key为真实存放如缓存中的key
	 * 
	 * @param key
	 * @param object
	 */
	public void setKey(Object key, Object object) {

		ValueOperations<K, V> valueOperations = (ValueOperations<K, V>) redisTemplate
				.opsForValue();

		valueOperations.set((K) key, (V)object);
	}
	
	/**
	 * key为真实存放如缓存中的key
	 * @param key
	 * @param object
	 * @param timeout
	 * @param unit
	 */
	public void setKey(Object key, Object object,long timeout,TimeUnit unit) {

		ValueOperations<K, V> valueOperations = (ValueOperations<K, V>) redisTemplate
				.opsForValue();

		valueOperations.set((K) key, (V)object,timeout,unit);
	}

	/**
	 * 根据真实key删除缓存数据
	 * 
	 * @param key
	 */
	public void delete(Object key) {

		redisTemplate.delete((K)key);
	}

	/**
	 * 根据key和类名组合成新的key删除缓存数据
	 * 
	 * @param key
	 */
	public void delete(Object key, Class<?> entity) {

		redisTemplate.delete((K)composeKey(key, entity.getName()));
	}

}