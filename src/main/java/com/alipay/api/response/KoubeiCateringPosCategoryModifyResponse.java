package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.category.modify response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-26 11:51:13
 */
public class KoubeiCateringPosCategoryModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3765277239487775626L;

	/** 
	 * 类别ID
	 */
	@ApiField("cate_id")
	private String cateId;

	public void setCateId(String cateId) {
		this.cateId = cateId;
	}
	public String getCateId( ) {
		return this.cateId;
	}

}