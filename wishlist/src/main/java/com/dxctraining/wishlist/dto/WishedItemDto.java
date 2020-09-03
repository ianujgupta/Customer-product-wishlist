package com.dxctraining.wishlist.dto;

public class WishedItemDto {

	private String id;

	private Integer CustomerId;

	private String productId;

	public WishedItemDto() {
	}

	public WishedItemDto(String id, Integer customerId, String productId) {
		this.id = id;
		this.CustomerId = customerId;
		this.productId = productId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(Integer customerId) {
		CustomerId = customerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
