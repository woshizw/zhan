package com.hyh.cloud.give.bag.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hyh.cloud.commons.base.utils.DateUtil;
import com.hyh.cloud.give.bag.bean.Bag;
import com.hyh.cloud.give.bag.bean.BagDetail;
import com.hyh.cloud.give.bag.bean.Campaign;
import com.hyh.cloud.give.bag.bean.Discount;
import com.hyh.cloud.give.bag.bean.Event;
import com.hyh.cloud.give.bag.bean.Rule;
import com.hyh.cloud.give.bag.bean.RuleConfig;
import com.hyh.cloud.give.bag.bean.RuleRelation;
import com.hyh.cloud.give.bag.bean.UserDiscount;
import com.hyh.cloud.give.bag.dao.SendUserBagDao;
import com.hyh.cloud.give.bag.util.RuleConfigUtil;
import com.hyh.cloud.sso.client.UamsWebClient;

/**
 * @author zhangbo
 * 
 * 服务：送给用户礼包【针对活动等】
 *
 */
@RestController
@RefreshScope
@ConfigurationProperties
@RequestMapping("/bag")
public class SendUserBagService {
	
	@Resource
	private UamsWebClient userUtil;
	
	@Resource
	private SendUserBagDao dao;

	
//	@ResponseBody
//	@RequestMapping("/send")
//	public void give(HttpServletRequest request, HttpServletResponse response,Event event) {
//		try {
//			
//			//判断用户登录
//			userUtil.isLogined(request, response);
//			//获取用户ID
//			Long userId = Long.valueOf(userUtil.getloginId(request, response));
//			//获取用户姓名
//			userUtil.getLoginName(request, response);
			
			//根据事件触发规则集，筛选出来满足条件的规则集
//			List<Rule> availRules = fileterByEvent(event);
//			
//			System.out.println("123123123123123");

			
			//保存 数据到数据库
//			dao.add(bagDetails,bagDetails);
			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		
//	}
	
	private List<Rule> fileterByEvent(Event event) throws Exception{
		
		//根据 事件代码 得到规则集合
		List<Rule> rules = dao.findRulesByEventCode(event.getEvent().getCode());
		
		//根据规则  得到 条件集合
		List<RuleConfig> configs =  dao.findRuleConfigsByRules(rules);
		
		//过滤无效的规则，只留下有效的规则集
		List<Long> availRuleIds = RuleConfigUtil.ruleEngine(configs, event.getObj());
		
		//从规则集过滤后的有效集合中
		return RuleConfigUtil.filterRule(rules,availRuleIds);
	}


	private List<UserDiscount> generateUserDiscount(List<Rule> availRules,Event event) {
		
		//根据有效规则集 查询 对应的礼包明细集
		List<BagDetail> bagDetails = dao.findBagDetailsByRules(availRules);
		Map<Long, List<BagDetail>> t_Map = new HashMap<Long, List<BagDetail>>();
		for(BagDetail bagDetail : bagDetails){
			if(t_Map.containsKey(bagDetail.getBagId())){
				t_Map.get(bagDetail.getBagId()).add(bagDetail);
			}else{
				List<BagDetail> t_details = new ArrayList<BagDetail>();
				t_details.add(bagDetail);
				t_Map.put(bagDetail.getBagId(), t_details);
			}
		}
		
		//根据礼包明细 查询 对应的券类配置集
		List<Discount> discounts = dao.findDiscountsByBagDetail(bagDetails);
		Map<Long,Discount> t_discount = new HashMap<Long, Discount>();
		for(Discount discount : discounts){
			t_discount.put(discount.getId(), discount);
		}
		
		for(Rule rule : availRules){
			for(BagDetail bagDetail : t_Map.get(rule.getBagId())){
//				RuleRelation relation = new RuleRelation();
				t_discount.get(bagDetail.getDiscountId());
				
			}
		}
		
		
		
		
		return null;
	}
	
	private UserDiscount getUserDiscount(Long userId,Discount discount){
		UserDiscount userDiscount = new UserDiscount();
		userDiscount.setId(1L);
		userDiscount.setUserId(userId);
		userDiscount.setAmount(discount.getAmount());
		userDiscount.setCreateTime(DateUtil.getNowDate());
		return userDiscount;
	}
}
