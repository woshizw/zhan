package com.zhan.commons.base.constant;


/** 提示类 */
public class Message implements java.io.Serializable {
	/**
	 * 
	 */
	private static final String separate="-";
	private static final long serialVersionUID = -3043932158079937817L;
	private String code;// 提示编码
	private String text;// 提示编信息
	private SystemUniqueCode suc;//系统唯一编码

	public Message(SystemUniqueCode suc,String code, String text) {
		this.code = code;
		this.text = text;
		this.suc=suc;
	}

	/** 提示编码 */
	public String getCode() {
		return this.suc.getSucValue()+this.separate+this.code;
	}

	/** 提示编码 */
	public void setCode(String code) {
		this.code = code;
	}

	/** 提示编信息 */
	public String getText() {
		return this.text;
	}

	/** 提示编信息 */
	public void setText(String text) {
		this.text = text;
	}

	public SystemUniqueCode getSuc() {
		return suc;
	}

	public void setSuc(SystemUniqueCode suc) {
		this.suc = suc;
	}
}
