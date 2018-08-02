package com.hyh.cloud.give.bag.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hyh.cloud.commons.base.utils.DateUtil;
import com.hyh.cloud.give.bag.bean.Rule;
import com.hyh.cloud.give.bag.bean.RuleConfig;

public class RuleConfigUtil {
	
	public static List<Long> ruleEngine(List<RuleConfig> rules,Object obj) throws Exception{
		List<Long> res = new ArrayList<Long>();
		Map<Long,List<RuleConfig>> map = new HashMap<Long, List<RuleConfig>>();
		for(RuleConfig ruleConfig : rules){
			if(map.containsKey(ruleConfig.getRuleId())){
				map.get(ruleConfig.getRuleId()).add(ruleConfig);
			}else{
				List<RuleConfig> ruleConfigs = new ArrayList<RuleConfig>();
				ruleConfigs.add(ruleConfig);
				map.put(ruleConfig.getRuleId(), ruleConfigs);
			}
		}
		
		for(Long ruleId : map.keySet()){
			//规则对应的条件集
			List<RuleConfig> configOfRule = map.get(ruleId);
			//规则对应条件集中，再根据编号分类
			Map<Long,List<RuleConfig>> configOfNo = sortConfigByNo(configOfRule);
			
			if(checkConfigOK(configOfNo,obj)){
				//规则满足条件
				res.add(ruleId);
			}
		}
		return res;
	}
	
	private static Boolean checkConfigOK(Map<Long,List<RuleConfig>> map,Object obj) throws Exception{
		for(Long no : map.keySet()){
			if(!checkOkOfAnyOne(map.get(no),obj)){
				return false;
			}
		}
		return true;
	}
	
	
	private static Map<Long,List<RuleConfig>> sortConfigByNo(List<RuleConfig> ruleConfigs){
		Map<Long,List<RuleConfig>> map = new HashMap<Long, List<RuleConfig>>();
		for(RuleConfig ruleConfig : ruleConfigs){
			if(map.containsKey(ruleConfig.getConfigNo())){
				map.get(ruleConfig.getConfigNo()).add(ruleConfig);
			}else{
				List<RuleConfig> temp = new ArrayList<RuleConfig>();
				temp.add(ruleConfig);
				map.put(ruleConfig.getConfigNo(), temp);
			}
		}
		return map;
	}
	
	
	private static boolean checkOkOfAnyOne(List<RuleConfig> ruleConfigs,Object obj) throws Exception{
		for(RuleConfig config : ruleConfigs){
			int re = compareObjByConfig(obj,config);
			if(">".equals(config.getOperation())){
				if(re > 0) {return true;}
			}
			if(">=".equals(config.getOperation())){
				if(re >= 0) {return true;}
			}
			if("<".equals(config.getOperation())){
				if(re < 0) {return true;}
			}
			if("<=".equals(config.getOperation())){
				if(re <= 0) {return true;}
			}
			if("==".equals(config.getOperation())){
				if(re == 0) {return true;}
			}
		}
		return false;
		
	}
	
	private static int compareObjByConfig(Object obj,RuleConfig config) throws Exception{
			Class<?> classType = Class.forName(config.getVarType());
			String var = config.getVarName();
			String val = config.getVarValue();
			if(Integer.class == classType){
				Integer objValue = (Integer)getField(obj.getClass(),obj,var);
				Integer valueFirst = Integer.valueOf(val);
				return objValue.compareTo(valueFirst);
			}else if(Long.class == classType){
				Long objValue = (Long)getField(obj.getClass(),obj,var);
				Long valueFirst = Long.valueOf(val);
				return objValue.compareTo(valueFirst);
			}else if(String.class == classType){
				String objValue = (String)getField(obj.getClass(),obj,var);
				return objValue.compareTo(val);
			}else if(BigDecimal.class == classType){
				BigDecimal objValue = (BigDecimal)getField(obj.getClass(),obj,var);
				BigDecimal valueFirst = new BigDecimal(val);
				return objValue.compareTo(valueFirst);
			}else if(Date.class == classType){
				Date objValue = (Date)getField(obj.getClass(),obj,var);
				Date valueFirst =DateUtil.getDateTimeFormat(var);
				return objValue.compareTo(valueFirst);
			}else if(Boolean.class == classType){
				Boolean objValue = (Boolean)getField(obj.getClass(),obj,var);
				Boolean valueFirst =Boolean.valueOf(val);
				return objValue.compareTo(valueFirst);
			}
			throw new Exception("对象的类型匹配失败");
	}
	
	private static Object getField(Class<?> _class,Object obj,String var) throws Exception{
		if(_class == Object.class){
			throw new Exception("没有找到该实体变量");
		}
		try {
		for(Field field : _class.getDeclaredFields()){
			if(field.getName().equals(var)){
					field.setAccessible(true);
					return field.get(obj);
			} 
		}
		return getField(_class.getSuperclass(),obj,var);
		} catch (Exception e) {
			throw new Exception("变量属性获取值失败");
		}
	}

	public static List<Rule> filterRule(List<Rule> rules,List<Long> availRuleIds) {
		List<Rule> re = new ArrayList<Rule>();
		for(Rule rule : rules){
			if(availRuleIds.contains(rule.getId())){
				re.add(rule);
			}
		}
		return re;
	}

}
