package com.zhan.cloud.commons.base.exception;

/**
 * 自定义异常
 * @author zhangw
 *
 */
public class HYHException extends Exception{

    
    /**
	 * 
	 */
	private static final long serialVersionUID = -8204265181793605055L;
	private String errCode;
	private String errMsg;
	
	public HYHException(String errCode,String errMsg){
		super(errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	public HYHException(String errCode,String errMsg,Throwable err){
		super(errMsg,err);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	public HYHException(String comment) {
		super(comment);
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	

}
