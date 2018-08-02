package com.zhan.cloud.commons.base.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.zhan.commons.base.constant.Message;
import com.zhan.commons.base.constant.ResultConstantCode;
import com.zhan.commons.base.constant.SystemUniqueCode;

public class ResultDto<T> implements Serializable {
	String returnCode = "0000";// 返回代码
	String returnMessage;// 错误信息描述
	Date invokeTime;
	String version=null;//返回版本信息
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5129953263541523474L;

	
	private T model;// 返回对象
	/** 根据model返回相应的code 
	 * @param <T>*/
	
	@SuppressWarnings({ "rawtypes", "hiding" })
	private <T> Message getCodeByModel(T model,SystemUniqueCode suc) {
		Message code=ResultConstantCode.RETURN_SUCCESS(suc); 
		if (model instanceof List) {
			List list=(List<?>) model;
			if(list == null || list.isEmpty()){
				code = ResultConstantCode.DATA_NOT_FOUND(suc);
			}
		} else if (model == null) {
			code = ResultConstantCode.DATA_NOT_FOUND(suc);
		} else if (model instanceof Map) {
			 Map  map=(Map) model;
			if ((map == null) || (map.isEmpty())) {
				code = ResultConstantCode.DATA_NOT_FOUND(suc);
			}
		}
		return code;
	}
	/**
	 * 服务无异常时，调用此构造函数
	 * @param model
	 */
	public ResultDto(T model,SystemUniqueCode suc){
		Message message=getCodeByModel(model,suc);
		this.returnCode=message.getCode();
		this.returnMessage=message.getText();
		this.model= model;
		this.invokeTime=new Date();
		
	}
	/**
	 * 服务有异常时，调用此构造函数
	 * @param model
	 * @param prompt
	 */
	public ResultDto(T model,Message message){
		
		this.returnCode=message.getCode();
		this.returnMessage=message.getText();
		this.model= model;
	}
	public ResultDto(){
		
		
	}
	
	public T getModel() {
		return model;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
