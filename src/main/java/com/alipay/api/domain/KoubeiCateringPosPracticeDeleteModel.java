package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除做法
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:23:31
 */
public class KoubeiCateringPosPracticeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2239549315516244576L;

	/**
	 * 做法id
	 */
	@ApiField("practice_id")
	private String practiceId;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getPracticeId() {
		return this.practiceId;
	}
	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}