/**
 * 
 */
package com.hyh.cloud.give.bag.enumeration;

/**
 * @author zhangbo
 *
 */
public enum EventEnum {
	
	REGISTER("注册","1");
	
	EventEnum(String name,String code){
		this.name = name;
		this.code = code;
	}
	
	private String name;
	
	private String code;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
