package com.zhan.cloud.commons.base.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * BigDecimal的工具类
 * @author zhangw
 *
 */
public class BigDecimalUtil{
	
	public static BigDecimal getScaleMode(BigDecimal d) {
		return d.setScale(2, RoundingMode.DOWN);
	}

	/**
	 * @param one
	 * @param two
	 * @return 
	 */
	public static BigDecimal add(BigDecimal one, BigDecimal two) {
		return getScaleMode(getScaleMode(one).add(getScaleMode(two)));
	}

	/**
	 * @param one
	 * @param two
	 * @return 
	 */
	public static BigDecimal sub(BigDecimal one, BigDecimal two) {
		return getScaleMode(one.subtract(two));
	}

	/**
	 * @param one
	 * @param two
	 * @return 
	 */
	public static BigDecimal mul(BigDecimal one, double two) {
		return getScaleMode(BigDecimal.valueOf(one.doubleValue() * two));
	}
	
	/**
	 * @param one
	 * @param two
	 * @return 
	 */
	public static BigDecimal mul(BigDecimal one, BigDecimal two) {
		return getScaleMode(one.multiply(two));
	}
	
	/**
	 * @param one
	 * @param two
	 * @return 
	 */
	public static BigDecimal did(BigDecimal one, BigDecimal two) {
		return one.divide(two, 2, RoundingMode.HALF_DOWN);
	}
	
	/**返回String类型的BigDecimal值*/
	public static String toBigDecimalOfStr(BigDecimal big){
		if(null == big){
			return null;
		}
		return big.toPlainString();
	}

}
