package com.hyh.cloud.give.bag.bean;

public class Campaign implements java.io.Serializable  {

	private static final long serialVersionUID = 150519504702590199L;

	/**创建人*/
	private java.lang.String creator;

	/**活动结束时间*/
	private java.util.Date endDate;

	/**活动描述*/
	private java.lang.String description;

	/**活动开始时间的起始时间*/
	private java.util.Date gtBeginDate;

	/**活动结束时间的起始时间*/
	private java.util.Date gtEndDate;

	/**活动结束时间的结束时间*/
	private java.util.Date ltEndDate;

	/**更新时间*/
	private java.util.Date updateTime;

	/**更新时间的起始时间*/
	private java.util.Date gtUpdateTime;

	/***/
	private java.lang.String sort;

	/**创建时间的结束时间*/
	private java.util.Date ltCreateTime;

	/**活动开始时间*/
	private java.util.Date beginDate;

	/**活动开始时间的结束时间*/
	private java.util.Date ltBeginDate;

	/**创建时间*/
	private java.util.Date createTime;

	/**活动名称*/
	private java.lang.String name;

	/***/
	private java.util.List<Long> ids;

	/***/
	private java.lang.Long id;

	/**创建时间的起始时间*/
	private java.util.Date gtCreateTime;

	/**活动状态*/
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

	/**活动结束时间*/
	public java.util.Date getEndDate() {
		return endDate;
	}

	/**活动结束时间*/
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

	/**活动描述*/
	public java.lang.String getDescription() {
		return description;
	}

	/**活动描述*/
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**活动开始时间的起始时间*/
	public java.util.Date getGtBeginDate() {
		return gtBeginDate;
	}

	/**活动开始时间的起始时间*/
	public void setGtBeginDate(java.util.Date gtBeginDate) {
		this.gtBeginDate = gtBeginDate;
	}

	/**活动结束时间的起始时间*/
	public java.util.Date getGtEndDate() {
		return gtEndDate;
	}

	/**活动结束时间的起始时间*/
	public void setGtEndDate(java.util.Date gtEndDate) {
		this.gtEndDate = gtEndDate;
	}

	/**活动结束时间的结束时间*/
	public java.util.Date getLtEndDate() {
		return ltEndDate;
	}

	/**活动结束时间的结束时间*/
	public void setLtEndDate(java.util.Date ltEndDate) {
		this.ltEndDate = ltEndDate;
	}

	/**更新时间*/
	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	/**更新时间*/
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
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

	/**活动开始时间*/
	public java.util.Date getBeginDate() {
		return beginDate;
	}

	/**活动开始时间*/
	public void setBeginDate(java.util.Date beginDate) {
		this.beginDate = beginDate;
	}

	/**活动开始时间的结束时间*/
	public java.util.Date getLtBeginDate() {
		return ltBeginDate;
	}

	/**活动开始时间的结束时间*/
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

	/**活动名称*/
	public java.lang.String getName() {
		return name;
	}

	/**活动名称*/
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/***/
	public java.util.List<Long> getIds() {
		return ids;
	}

	/***/
	public void setIds(java.util.List<Long> ids) {
		this.ids = ids;
	}

	/***/
	public java.lang.Long getId() {
		return id;
	}

	/***/
	public void setId(java.lang.Long id) {
		this.id = id;
	}

	/**创建时间的起始时间*/
	public java.util.Date getGtCreateTime() {
		return gtCreateTime;
	}

	/**创建时间的起始时间*/
	public void setGtCreateTime(java.util.Date gtCreateTime) {
		this.gtCreateTime = gtCreateTime;
	}

	/**活动状态*/
	public java.lang.String getStatus() {
		return status;
	}

	/**活动状态*/
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
		builder.append("Campaign [");
		builder.append("creator=");
		builder.append(creator);
		builder.append(";  ");
		builder.append("endDate=");
		builder.append(endDate);
		builder.append(";  ");
		builder.append("description=");
		builder.append(description);
		builder.append(";  ");
		builder.append("gtBeginDate=");
		builder.append(gtBeginDate);
		builder.append(";  ");
		builder.append("gtEndDate=");
		builder.append(gtEndDate);
		builder.append(";  ");
		builder.append("ltEndDate=");
		builder.append(ltEndDate);
		builder.append(";  ");
		builder.append("updateTime=");
		builder.append(updateTime);
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
		builder.append("beginDate=");
		builder.append(beginDate);
		builder.append(";  ");
		builder.append("ltBeginDate=");
		builder.append(ltBeginDate);
		builder.append(";  ");
		builder.append("createTime=");
		builder.append(createTime);
		builder.append(";  ");
		builder.append("name=");
		builder.append(name);
		builder.append(";  ");
		builder.append("ids=");
		builder.append(ids);
		builder.append(";  ");
		builder.append("id=");
		builder.append(id);
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