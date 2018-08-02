package com.hyh.cloud.give.bag.bean;

public class UserDiscount implements java.io.Serializable  {

	private static final long serialVersionUID = 150486170476116560L;

	/**领取时间的结束时间*/
	private java.util.Date ltTokenDate;

	/**过期时间*/
	private java.util.Date expiredDate;

	/**优惠使用规则*/
	private java.lang.Long rule;

	/**创建时间的结束时间*/
	private java.util.Date ltCreateTime;

	/**过期时间的起始时间*/
	private java.util.Date gtExpiredDate;

	/**投资比例*/
	private java.math.BigDecimal rate;

	/**hash code*/
	private java.lang.String hmac;

	/**使用时间*/
	private java.util.Date usedDate;

	/**使用时间的结束时间*/
	private java.util.Date ltUsedDate;

	/***/
	private java.lang.Long id;

	/**投资产品期限天数*/
	private java.lang.Integer proPeriod;

	/**项目编号*/
	private java.lang.String productNo;

	/**发起渠道*/
	private java.lang.String channelCode;

	/**优惠类型*/
	private java.lang.String issuleType;

	/**领取时间*/
	private java.util.Date tokenDate;

	/**使用时间的起始时间*/
	private java.util.Date gtUsedDate;

	/**后台流水号*/
	private java.lang.String backId;

	/**创建人*/
	private java.lang.String creator;

	/**金额*/
	private java.math.BigDecimal amount;

	/**序列号*/
	private java.lang.String serialNum;

	/**投资产品 1:不可转让  2:可转让  3:可转不可转都可以*/
	private java.lang.Integer isTransfer;

	/**活动ID*/
	private java.lang.Long campaignId;

	/***/
	private java.lang.String sort;

	/**用户id*/
	private java.lang.Long userId;

	/**过期时间的结束时间*/
	private java.util.Date ltExpiredDate;

	/**前台流水号*/
	private java.lang.String frontId;

	/**红包使用范围*/
	private java.lang.Long discountScope;

	/**发起系统*/
	private java.lang.String systemCode;

	/**创建时间*/
	private java.util.Date createTime;

	/***/
	private java.util.List<Long> ids;

	/**优惠ID*/
	private java.lang.Long discountId;

	/**领取时间的起始时间*/
	private java.util.Date gtTokenDate;

	/**创建时间的起始时间*/
	private java.util.Date gtCreateTime;

	/**备注*/
	private java.lang.String remarks;

	/**状态*/
	private java.lang.String status;

	/**领取时间的结束时间*/
	public java.util.Date getLtTokenDate() {
		return ltTokenDate;
	}

	/**领取时间的结束时间*/
	public void setLtTokenDate(java.util.Date ltTokenDate) {
		this.ltTokenDate = ltTokenDate;
	}

	/**过期时间*/
	public java.util.Date getExpiredDate() {
		return expiredDate;
	}

	/**过期时间*/
	public void setExpiredDate(java.util.Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	/**优惠使用规则*/
	public java.lang.Long getRule() {
		return rule;
	}

	/**优惠使用规则*/
	public void setRule(java.lang.Long rule) {
		this.rule = rule;
	}

	/**创建时间的结束时间*/
	public java.util.Date getLtCreateTime() {
		return ltCreateTime;
	}

	/**创建时间的结束时间*/
	public void setLtCreateTime(java.util.Date ltCreateTime) {
		this.ltCreateTime = ltCreateTime;
	}

	/**过期时间的起始时间*/
	public java.util.Date getGtExpiredDate() {
		return gtExpiredDate;
	}

	/**过期时间的起始时间*/
	public void setGtExpiredDate(java.util.Date gtExpiredDate) {
		this.gtExpiredDate = gtExpiredDate;
	}

	/**投资比例*/
	public java.math.BigDecimal getRate() {
		return rate;
	}

	/**投资比例*/
	public void setRate(java.math.BigDecimal rate) {
		this.rate = rate;
	}

	/**hash code*/
	public java.lang.String getHmac() {
		return hmac;
	}

	/**hash code*/
	public void setHmac(java.lang.String hmac) {
		this.hmac = hmac;
	}

	/**使用时间*/
	public java.util.Date getUsedDate() {
		return usedDate;
	}

	/**使用时间*/
	public void setUsedDate(java.util.Date usedDate) {
		this.usedDate = usedDate;
	}

	/**使用时间的结束时间*/
	public java.util.Date getLtUsedDate() {
		return ltUsedDate;
	}

	/**使用时间的结束时间*/
	public void setLtUsedDate(java.util.Date ltUsedDate) {
		this.ltUsedDate = ltUsedDate;
	}

	/***/
	public java.lang.Long getId() {
		return id;
	}

	/***/
	public void setId(java.lang.Long id) {
		this.id = id;
	}

	/**投资产品期限天数*/
	public java.lang.Integer getProPeriod() {
		return proPeriod;
	}

	/**投资产品期限天数*/
	public void setProPeriod(java.lang.Integer proPeriod) {
		this.proPeriod = proPeriod;
	}

	/**项目编号*/
	public java.lang.String getProductNo() {
		return productNo;
	}

	/**项目编号*/
	public void setProductNo(java.lang.String productNo) {
		this.productNo = productNo;
	}

	/**发起渠道*/
	public java.lang.String getChannelCode() {
		return channelCode;
	}

	/**发起渠道*/
	public void setChannelCode(java.lang.String channelCode) {
		this.channelCode = channelCode;
	}

	/**优惠类型*/
	public java.lang.String getIssuleType() {
		return issuleType;
	}

	/**优惠类型*/
	public void setIssuleType(java.lang.String issuleType) {
		this.issuleType = issuleType;
	}

	/**领取时间*/
	public java.util.Date getTokenDate() {
		return tokenDate;
	}

	/**领取时间*/
	public void setTokenDate(java.util.Date tokenDate) {
		this.tokenDate = tokenDate;
	}

	/**使用时间的起始时间*/
	public java.util.Date getGtUsedDate() {
		return gtUsedDate;
	}

	/**使用时间的起始时间*/
	public void setGtUsedDate(java.util.Date gtUsedDate) {
		this.gtUsedDate = gtUsedDate;
	}

	/**后台流水号*/
	public java.lang.String getBackId() {
		return backId;
	}

	/**后台流水号*/
	public void setBackId(java.lang.String backId) {
		this.backId = backId;
	}

	/**创建人*/
	public java.lang.String getCreator() {
		return creator;
	}

	/**创建人*/
	public void setCreator(java.lang.String creator) {
		this.creator = creator;
	}

	/**金额*/
	public java.math.BigDecimal getAmount() {
		return amount;
	}

	/**金额*/
	public void setAmount(java.math.BigDecimal amount) {
		this.amount = amount;
	}

	/**序列号*/
	public java.lang.String getSerialNum() {
		return serialNum;
	}

	/**序列号*/
	public void setSerialNum(java.lang.String serialNum) {
		this.serialNum = serialNum;
	}

	/**投资产品 1:不可转让  2:可转让  3:可转不可转都可以*/
	public java.lang.Integer getIsTransfer() {
		return isTransfer;
	}

	/**投资产品 1:不可转让  2:可转让  3:可转不可转都可以*/
	public void setIsTransfer(java.lang.Integer isTransfer) {
		this.isTransfer = isTransfer;
	}

	/**活动ID*/
	public java.lang.Long getCampaignId() {
		return campaignId;
	}

	/**活动ID*/
	public void setCampaignId(java.lang.Long campaignId) {
		this.campaignId = campaignId;
	}

	/***/
	public java.lang.String getSort() {
		return sort;
	}

	/***/
	public void setSort(java.lang.String sort) {
		this.sort = sort;
	}

	/**用户id*/
	public java.lang.Long getUserId() {
		return userId;
	}

	/**用户id*/
	public void setUserId(java.lang.Long userId) {
		this.userId = userId;
	}

	/**过期时间的结束时间*/
	public java.util.Date getLtExpiredDate() {
		return ltExpiredDate;
	}

	/**过期时间的结束时间*/
	public void setLtExpiredDate(java.util.Date ltExpiredDate) {
		this.ltExpiredDate = ltExpiredDate;
	}

	/**前台流水号*/
	public java.lang.String getFrontId() {
		return frontId;
	}

	/**前台流水号*/
	public void setFrontId(java.lang.String frontId) {
		this.frontId = frontId;
	}

	/**红包使用范围*/
	public java.lang.Long getDiscountScope() {
		return discountScope;
	}

	/**红包使用范围*/
	public void setDiscountScope(java.lang.Long discountScope) {
		this.discountScope = discountScope;
	}

	/**发起系统*/
	public java.lang.String getSystemCode() {
		return systemCode;
	}

	/**发起系统*/
	public void setSystemCode(java.lang.String systemCode) {
		this.systemCode = systemCode;
	}

	/**创建时间*/
	public java.util.Date getCreateTime() {
		return createTime;
	}

	/**创建时间*/
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/***/
	public java.util.List<Long> getIds() {
		return ids;
	}

	/***/
	public void setIds(java.util.List<Long> ids) {
		this.ids = ids;
	}

	/**优惠ID*/
	public java.lang.Long getDiscountId() {
		return discountId;
	}

	/**优惠ID*/
	public void setDiscountId(java.lang.Long discountId) {
		this.discountId = discountId;
	}

	/**领取时间的起始时间*/
	public java.util.Date getGtTokenDate() {
		return gtTokenDate;
	}

	/**领取时间的起始时间*/
	public void setGtTokenDate(java.util.Date gtTokenDate) {
		this.gtTokenDate = gtTokenDate;
	}

	/**创建时间的起始时间*/
	public java.util.Date getGtCreateTime() {
		return gtCreateTime;
	}

	/**创建时间的起始时间*/
	public void setGtCreateTime(java.util.Date gtCreateTime) {
		this.gtCreateTime = gtCreateTime;
	}

	/**备注*/
	public java.lang.String getRemarks() {
		return remarks;
	}

	/**备注*/
	public void setRemarks(java.lang.String remarks) {
		this.remarks = remarks;
	}

	/**状态*/
	public java.lang.String getStatus() {
		return status;
	}

	/**状态*/
	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserDiscount [");
		builder.append("ltTokenDate=");
		builder.append(ltTokenDate);
		builder.append(";  ");
		builder.append("expiredDate=");
		builder.append(expiredDate);
		builder.append(";  ");
		builder.append("rule=");
		builder.append(rule);
		builder.append(";  ");
		builder.append("ltCreateTime=");
		builder.append(ltCreateTime);
		builder.append(";  ");
		builder.append("gtExpiredDate=");
		builder.append(gtExpiredDate);
		builder.append(";  ");
		builder.append("rate=");
		builder.append(rate);
		builder.append(";  ");
		builder.append("hmac=");
		builder.append(hmac);
		builder.append(";  ");
		builder.append("usedDate=");
		builder.append(usedDate);
		builder.append(";  ");
		builder.append("ltUsedDate=");
		builder.append(ltUsedDate);
		builder.append(";  ");
		builder.append("id=");
		builder.append(id);
		builder.append(";  ");
		builder.append("proPeriod=");
		builder.append(proPeriod);
		builder.append(";  ");
		builder.append("productNo=");
		builder.append(productNo);
		builder.append(";  ");
		builder.append("channelCode=");
		builder.append(channelCode);
		builder.append(";  ");
		builder.append("issuleType=");
		builder.append(issuleType);
		builder.append(";  ");
		builder.append("tokenDate=");
		builder.append(tokenDate);
		builder.append(";  ");
		builder.append("gtUsedDate=");
		builder.append(gtUsedDate);
		builder.append(";  ");
		builder.append("backId=");
		builder.append(backId);
		builder.append(";  ");
		builder.append("creator=");
		builder.append(creator);
		builder.append(";  ");
		builder.append("amount=");
		builder.append(amount);
		builder.append(";  ");
		builder.append("serialNum=");
		builder.append(serialNum);
		builder.append(";  ");
		builder.append("isTransfer=");
		builder.append(isTransfer);
		builder.append(";  ");
		builder.append("campaignId=");
		builder.append(campaignId);
		builder.append(";  ");
		builder.append("sort=");
		builder.append(sort);
		builder.append(";  ");
		builder.append("userId=");
		builder.append(userId);
		builder.append(";  ");
		builder.append("ltExpiredDate=");
		builder.append(ltExpiredDate);
		builder.append(";  ");
		builder.append("frontId=");
		builder.append(frontId);
		builder.append(";  ");
		builder.append("discountScope=");
		builder.append(discountScope);
		builder.append(";  ");
		builder.append("systemCode=");
		builder.append(systemCode);
		builder.append(";  ");
		builder.append("createTime=");
		builder.append(createTime);
		builder.append(";  ");
		builder.append("ids=");
		builder.append(ids);
		builder.append(";  ");
		builder.append("discountId=");
		builder.append(discountId);
		builder.append(";  ");
		builder.append("gtTokenDate=");
		builder.append(gtTokenDate);
		builder.append(";  ");
		builder.append("gtCreateTime=");
		builder.append(gtCreateTime);
		builder.append(";  ");
		builder.append("remarks=");
		builder.append(remarks);
		builder.append(";  ");
		builder.append("status=");
		builder.append(status);
		builder.append(";  ");
		builder.append("]");
		return builder.toString();
	}
}