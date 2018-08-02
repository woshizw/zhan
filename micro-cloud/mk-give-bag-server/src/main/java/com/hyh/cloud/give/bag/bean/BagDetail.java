package com.hyh.cloud.give.bag.bean;

public class BagDetail implements java.io.Serializable  {

	private static final long serialVersionUID = 150519587892550388L;

	/**创建人*/
	private java.lang.String creator;

	/**有效结束时间*/
	private java.util.Date endDate;

	/**有效开始时间的起始时间*/
	private java.util.Date gtBeginDate;

	/**有效结束时间的起始时间*/
	private java.util.Date gtEndDate;

	/**更新时间*/
	private java.util.Date updateTime;

	/**有效结束时间的结束时间*/
	private java.util.Date ltEndDate;

	/**更新时间的起始时间*/
	private java.util.Date gtUpdateTime;

	/***/
	private java.lang.String sort;

	/**创建时间的结束时间*/
	private java.util.Date ltCreateTime;

	/**礼包ID*/
	private java.lang.Long bagId;

	/**有效开始时间*/
	private java.util.Date beginDate;

	/**有效开始时间的结束时间*/
	private java.util.Date ltBeginDate;

	/**创建时间*/
	private java.util.Date createTime;

	/**券类配置ID*/
	private java.lang.Long discountId;

	/**创建时间的起始时间*/
	private java.util.Date gtCreateTime;

	/**礼包明细状态*/
	private java.lang.String status;

	/**更新时间的结束时间*/
	private java.util.Date ltUpdateTime;

	/**创建人*/
	public java.lang.String getCreator() {
		return creator;
	}

	/**创建人*/
	public void setCreator(java.lang.String creator) {
		this.creator = creator;
	}

	/**有效结束时间*/
	public java.util.Date getEndDate() {
		return endDate;
	}

	/**有效结束时间*/
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	/**有效开始时间的起始时间*/
	public java.util.Date getGtBeginDate() {
		return gtBeginDate;
	}

	/**有效开始时间的起始时间*/
	public void setGtBeginDate(java.util.Date gtBeginDate) {
		this.gtBeginDate = gtBeginDate;
	}

	/**有效结束时间的起始时间*/
	public java.util.Date getGtEndDate() {
		return gtEndDate;
	}

	/**有效结束时间的起始时间*/
	public void setGtEndDate(java.util.Date gtEndDate) {
		this.gtEndDate = gtEndDate;
	}

	/**更新时间*/
	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	/**更新时间*/
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	/**有效结束时间的结束时间*/
	public java.util.Date getLtEndDate() {
		return ltEndDate;
	}

	/**有效结束时间的结束时间*/
	public void setLtEndDate(java.util.Date ltEndDate) {
		this.ltEndDate = ltEndDate;
	}

	/**更新时间的起始时间*/
	public java.util.Date getGtUpdateTime() {
		return gtUpdateTime;
	}

	/**更新时间的起始时间*/
	public void setGtUpdateTime(java.util.Date gtUpdateTime) {
		this.gtUpdateTime = gtUpdateTime;
	}

	/***/
	public java.lang.String getSort() {
		return sort;
	}

	/***/
	public void setSort(java.lang.String sort) {
		this.sort = sort;
	}

	/**创建时间的结束时间*/
	public java.util.Date getLtCreateTime() {
		return ltCreateTime;
	}

	/**创建时间的结束时间*/
	public void setLtCreateTime(java.util.Date ltCreateTime) {
		this.ltCreateTime = ltCreateTime;
	}

	/**礼包ID*/
	public java.lang.Long getBagId() {
		return bagId;
	}

	/**礼包ID*/
	public void setBagId(java.lang.Long bagId) {
		this.bagId = bagId;
	}

	/**有效开始时间*/
	public java.util.Date getBeginDate() {
		return beginDate;
	}

	/**有效开始时间*/
	public void setBeginDate(java.util.Date beginDate) {
		this.beginDate = beginDate;
	}

	/**有效开始时间的结束时间*/
	public java.util.Date getLtBeginDate() {
		return ltBeginDate;
	}

	/**有效开始时间的结束时间*/
	public void setLtBeginDate(java.util.Date ltBeginDate) {
		this.ltBeginDate = ltBeginDate;
	}

	/**创建时间*/
	public java.util.Date getCreateTime() {
		return createTime;
	}

	/**创建时间*/
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/**券类配置ID*/
	public java.lang.Long getDiscountId() {
		return discountId;
	}

	/**券类配置ID*/
	public void setDiscountId(java.lang.Long discountId) {
		this.discountId = discountId;
	}

	/**创建时间的起始时间*/
	public java.util.Date getGtCreateTime() {
		return gtCreateTime;
	}

	/**创建时间的起始时间*/
	public void setGtCreateTime(java.util.Date gtCreateTime) {
		this.gtCreateTime = gtCreateTime;
	}

	/**礼包明细状态*/
	public java.lang.String getStatus() {
		return status;
	}

	/**礼包明细状态*/
	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	/**更新时间的结束时间*/
	public java.util.Date getLtUpdateTime() {
		return ltUpdateTime;
	}

	/**更新时间的结束时间*/
	public void setLtUpdateTime(java.util.Date ltUpdateTime) {
		this.ltUpdateTime = ltUpdateTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BagDetail [");
		builder.append("creator=");
		builder.append(creator);
		builder.append(";  ");
		builder.append("endDate=");
		builder.append(endDate);
		builder.append(";  ");
		builder.append("gtBeginDate=");
		builder.append(gtBeginDate);
		builder.append(";  ");
		builder.append("gtEndDate=");
		builder.append(gtEndDate);
		builder.append(";  ");
		builder.append("updateTime=");
		builder.append(updateTime);
		builder.append(";  ");
		builder.append("ltEndDate=");
		builder.append(ltEndDate);
		builder.append(";  ");
		builder.append("gtUpdateTime=");
		builder.append(gtUpdateTime);
		builder.append(";  ");
		builder.append("sort=");
		builder.append(sort);
		builder.append(";  ");
		builder.append("ltCreateTime=");
		builder.append(ltCreateTime);
		builder.append(";  ");
		builder.append("bagId=");
		builder.append(bagId);
		builder.append(";  ");
		builder.append("beginDate=");
		builder.append(beginDate);
		builder.append(";  ");
		builder.append("ltBeginDate=");
		builder.append(ltBeginDate);
		builder.append(";  ");
		builder.append("createTime=");
		builder.append(createTime);
		builder.append(";  ");
		builder.append("discountId=");
		builder.append(discountId);
		builder.append(";  ");
		builder.append("gtCreateTime=");
		builder.append(gtCreateTime);
		builder.append(";  ");
		builder.append("status=");
		builder.append(status);
		builder.append(";  ");
		builder.append("ltUpdateTime=");
		builder.append(ltUpdateTime);
		builder.append(";  ");
		builder.append("]");
		return builder.toString();
	}
}