package com.zhan.cloud.service.ucs.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.zhan.cloud.commons.base.dto.ResultDto;
import com.zhan.cloud.commons.cache.CacheRemoteCallback;
import com.zhan.cloud.commons.cache.RedisCacheUtil;
import com.zhan.cloud.sequence.remote.client.SequenceRemoteClient;
import com.zhan.cloud.service.entity.User;
import com.zhan.cloud.service.ucs.constant.SystemCode;
import com.zhan.cloud.service.ucs.dao.UserMapper;
import com.zhan.commons.base.constant.ResultConstantCode;

/**
 * 
 * @author zhangw
 *
 */
@RestController
@RefreshScope
@ConfigurationProperties
@RequestMapping("/user")
@Transactional(propagation = Propagation.REQUIRED)
public class UserService {
	private static Log logger = LogFactory.getLog(UserService.class);

	@Resource
	private UserMapper userMapper;

	@Resource
	private RedisCacheUtil<?, ?> util;
	
	@Resource
	private SystemCode sc;
	
	@Resource
	private SequenceRemoteClient src;
	

	@ResponseBody
	@RequestMapping("/detail")
	public User findById(@RequestParam Long id) {
		src.generateSequence("ava");
		return userMapper.selectByPrimaryKey(id);
	}

	@ResponseBody
	@RequestMapping("/create")
	public ResultDto<Integer> createUser(@RequestBody User user) {
		try {
			return new ResultDto<Integer>(userMapper.creatUser(user),sc);
		} catch (Exception e) {
			logger.error(e);
			if (e.getCause() instanceof MySQLIntegrityConstraintViolationException) {
				return new ResultDto<Integer>(null,
						ResultConstantCode.RETURN_REPEAT_DB(sc));
			} else {
				return new ResultDto<Integer>(null,
						ResultConstantCode.RETURN_EXCEPTION_DB(sc));
			}
		}
	}

	@ResponseBody
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public ResultDto<User> getUser(@RequestBody User user) {
		try {
			logger.info("----------查询用户----");
			return new ResultDto<User>(userMapper.selectUser(user),sc);
			
		} catch (Exception e) {
			logger.error(e);

			return new ResultDto<User>(null,
					ResultConstantCode.RETURN_EXCEPTION_DB(sc));

		}
	}
	


	/**
	 * 分页查询list
	 * 
	 * @param pageNumber
	 * @param number
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/all")
	public ResultDto<PageInfo<User>> findAll(@RequestBody Map map) {
		try {
			logger.info("====demo start===");
			Integer pageNumber = (Integer) map.get("pageNumber");
			Integer pageSize = (Integer) map.get("pageSize");
			PageHelper.startPage(pageNumber, pageSize);
			List<User> list = userMapper.selectAll();
			PageInfo<User> pageInfo = new PageInfo<User>(list);
			// Page<CityBean> page = (Page<CityBean>) list;
			// PageData<User> p=new PageData<User>()();
			// p.setList(list);
			return new ResultDto<PageInfo<User>>(pageInfo,sc);
		} catch (Exception e) {
			logger.error(e);

			return new ResultDto<PageInfo<User>>(null,
					ResultConstantCode.RETURN_EXCEPTION_DB(sc));

		}

	}

	/**
	 * 通过redis返回value,如果此key没有value,则通过回调函数生成数据set到redis
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/cache")
	public ResultDto<User> userCache(@RequestBody Long id) {
		// User findOne = this.userRepository.findOne(id);
		try {
			return new ResultDto<User>(util.get(id, String.class,
					new CacheRemoteCallback() {
						public <T> T remoteCallback() {
							return (T) userMapper.selectByPrimaryKey(id);
						}

					}),sc);
		} catch (Exception e) {
			logger.error(e);

			return new ResultDto<User>(null,
					ResultConstantCode.RETURN_EXCEPTION(sc));
		}

	}
}
