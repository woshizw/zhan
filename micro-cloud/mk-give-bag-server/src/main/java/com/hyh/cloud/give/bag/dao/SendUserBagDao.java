package com.hyh.cloud.give.bag.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hyh.cloud.commons.cache.RedisCacheUtil;
import com.hyh.cloud.give.bag.bean.Bag;
import com.hyh.cloud.give.bag.bean.BagDetail;
import com.hyh.cloud.give.bag.bean.Campaign;
import com.hyh.cloud.give.bag.bean.Discount;
import com.hyh.cloud.give.bag.bean.Rule;
import com.hyh.cloud.give.bag.bean.RuleConfig;
import com.hyh.cloud.give.bag.mapper.BagDetailMapper;
import com.hyh.cloud.give.bag.mapper.BagMapper;
import com.hyh.cloud.give.bag.mapper.CampaignMapper;
import com.hyh.cloud.give.bag.mapper.DiscountMapper;
import com.hyh.cloud.give.bag.mapper.RateConfigMapper;
import com.hyh.cloud.give.bag.mapper.RuleConfigMapper;
import com.hyh.cloud.give.bag.mapper.RuleMapper;
import com.hyh.cloud.give.bag.mapper.UserDiscountMapper;
import com.hyh.cloud.give.bag.util.MapUtil;

@Service
public class SendUserBagDao {

	@Autowired
	private UserDiscountMapper userDiscountMapper;
	@Autowired
	private CampaignMapper campaignMapper;
	@Autowired
	private RuleMapper ruleMapper;
	@Autowired
	private RateConfigMapper rateConfigMapper;
	@Autowired
	private BagMapper bagMapper;
	@Autowired
	private BagDetailMapper bagDetailMapper;
	@Autowired
	private DiscountMapper discountMapper;
	@Resource
	private RedisCacheUtil<?, ?> cacheUtil;
	@Autowired
	private RuleConfigMapper ruleConfigMapper;
	
	public Rule findRuleById(Long id){
		Map<String,Long> param = new  HashMap<String, Long>();
		param.put("id", id);
		List<Rule> list = ruleMapper.queryListByParam(param);
		if(CollectionUtils.isEmpty(list)){
			return null;
		}
		return list.get(0);
	}
	
	public Rule findRulePageById(Long id){
		Map<String,Long> param = new  HashMap<String, Long>();
		param.put("id", id);
		List<Rule> list = ruleMapper.queryListByParam(param);
		if(CollectionUtils.isEmpty(list)){
			return null;
		}
		return list.get(0);
	}
	
	public List<Rule> findRulesByEventCode(String eventCode){
		List<Rule> list = cacheUtil.get(eventCode, Rule.class);
		if(CollectionUtils.isNotEmpty(list)){
			return list;
		}
		Rule rule = new Rule();
		rule.setEventCode(eventCode);
		list = ruleMapper.queryListByParam(MapUtil.beanToMap(rule));
		if(CollectionUtils.isEmpty(list)){
			return null;
		}
		cacheUtil.setKey(eventCode, Rule.class, list);
		return list;
	}
	
	public List<Campaign> findCampaingsByRules(List<Rule> rules){
		List<Long> campaignIds = new ArrayList<Long>();
		for(Rule rule : rules){
			campaignIds.add(rule.getCampaignId());
		}
		Map<String,List<Long>> param = new HashMap<String, List<Long>>();
		param.put("ids", campaignIds);
		return campaignMapper.queryListByParam(param);
	}
	
	public List<Bag> findBagsByRules(List<Rule> rules){
		List<Long> bags = new ArrayList<Long>();
		for(Rule rule : rules){
			bags.add(rule.getBagId());
		}
		Map<String,List<Long>> param = new HashMap<String, List<Long>>();
		param.put("ids", bags);
		return bagMapper.queryListByParam(param);
	}
	
	public List<RuleConfig> findRuleConfigsByRules(List<Rule> rules){
		List<Long> ruleIds = new ArrayList<Long>();
		for(Rule rule : rules){
			ruleIds.add(rule.getId());
		}
		Map<String,List<Long>> param = new HashMap<String, List<Long>>();
		param.put("ids", ruleIds);
		
		return ruleConfigMapper.queryListByParam(param);
	}
	
	public List<RuleConfig> findRuleConfigsByRules(Long id){
		Map<String,Long> param = new HashMap<String, Long>();
		param.put("id", id);
		return ruleConfigMapper.queryListByParam(param);
	}

	public List<BagDetail> findBagDetailsByRules(List<Rule> rules) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Discount> findDiscountsByBagDetail(List<BagDetail> bagDetails) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	public List<Discount> add(List<BagDetail> bagDetails,List<BagDetail> b) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
