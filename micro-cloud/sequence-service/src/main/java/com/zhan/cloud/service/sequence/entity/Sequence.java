package com.zhan.cloud.service.sequence.entity;

import org.apache.ibatis.type.Alias;





/**
 * @author zhangwei
 * 主键表
 */
@Alias(value="Sequence")
public class Sequence {
	

	/***/
	private java.lang.String keyName;

	/***/
	private java.lang.Long initValue;

	/***/
	private java.lang.Long poolSize;

	/***/
	private java.lang.Long curValue;

	
	/***/
	private java.lang.String createBy;

	/***/
	private java.util.Date createDate;

	/***/
	private java.lang.String updateBy;

	/***/
	private java.util.Date updateDate;

	/***/
	private java.lang.Integer version;
	
	private java.lang.Long nextKey;
	
	private java.lang.Long maxValue;
	

	
	/**
	 * 
	 * @return
	 */
	public java.lang.String getKeyName() {
		return keyName;
	}

	/**
	 * 
	 * 
	 * @param keyName
	 * 
	 */
	public void setKeyName(java.lang.String keyName) {
		this.keyName = keyName;
	}

	/**
	 * 
	 * @return
	 */
	public java.lang.Long getInitValue() {
		return initValue;
	}

	/**
	 * 
	 * 
	 * @param initValue
	 * 
	 */
	public void setInitValue(java.lang.Long initValue) {
		this.initValue = initValue;
	}

	/**
	 * 
	 * @return
	 */
	public java.lang.Long getPoolSize() {
		return poolSize;
	}

	/**
	 * 
	 * 
	 * @param poolSize
	 * 
	 */
	public void setPoolSize(java.lang.Long poolSize) {
		this.poolSize = poolSize;
	}

	/**
	 * 
	 * @return
	 */
	public java.lang.Long getCurValue() {
		return curValue;
	}

	/**
	 * 
	 * 
	 * @param curValue
	 * 
	 */
	public void setCurValue(java.lang.Long curValue) {
		this.curValue = curValue;
	}

	/**
	 * 
	 * @return
	 */
	public java.lang.String getCreateBy() {
		return createBy;
	}

	/**
	 * 
	 * 
	 * @param createBy
	 * 
	 */
	public void setCreateBy(java.lang.String createBy) {
		this.createBy = createBy;
	}

	/**
	 * 
	 * @return
	 */
	public java.util.Date getCreateDate() {
		return createDate;
	}

	/**
	 * 
	 * 
	 * @param createDate
	 * 
	 */
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * 
	 * @return
	 */
	public java.lang.String getUpdateBy() {
		return updateBy;
	}

	/**
	 * 
	 * 
	 * @param updateBy
	 * 
	 */
	public void setUpdateBy(java.lang.String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * 
	 * @return
	 */
	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * 
	 * 
	 * @param updateDate
	 * 
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 
	 * @return
	 */
	public java.lang.Integer getVersion() {
		return version;
	}

	/**
	 * 
	 * 
	 * @param version
	 * 
	 */
	public void setVersion(java.lang.Integer version) {
		this.version = version;
	}

	public java.lang.Long getNextKey() {
		return ++this.curValue;
	}

	public void setNextKey(java.lang.Long nextKey) {
		this.nextKey = nextKey;
	}

	public java.lang.Long getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(java.lang.Long maxValue) {
		this.maxValue = maxValue;
	}

	

	
}
