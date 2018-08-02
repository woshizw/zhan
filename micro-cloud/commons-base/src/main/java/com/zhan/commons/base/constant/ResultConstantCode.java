package com.zhan.commons.base.constant;

public class ResultConstantCode {

	public static Message DATA_NOT_FOUND(SystemUniqueCode code){
		return new Message(code,"0001", "没有找到数据！");	
	}
	public static Message RETURN_SUCCESS(SystemUniqueCode code){
		return new Message(code,"0000", "返回正常");	
	}
	public static Message RETURN_REPEAT_DB(SystemUniqueCode code){
		return new Message(code,"0002", "数据存在重复");	
	}
	public static Message RETURN_EXCEPTION_DB(SystemUniqueCode code){
		return new Message(code,"0003", "数据异常");
	}
	public static Message RETURN_EXCEPTION(SystemUniqueCode code){
		return new Message(code,"0004", "系统异常");	
	}
}
