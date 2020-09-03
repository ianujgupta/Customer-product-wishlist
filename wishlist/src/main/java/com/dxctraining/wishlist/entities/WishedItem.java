package com.dxctraining.wishlist.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wisheditems")
public class WishedItem {

	@Id
	@GeneratedValue
//	@Column(name = "PR_KEY")
	private String id;

	private Integer customerId;

	private String productId;

	public WishedItem() {
	}

	public WishedItem(Integer customerId, String productId) {
		this.customerId = customerId;
		this.productId = productId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
