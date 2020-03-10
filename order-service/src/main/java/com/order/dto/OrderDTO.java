package com.order.dto;

import java.util.List;

import com.order.entity.Order;

public class OrderDTO {

	private String id;

	private String userId;

	private String merchantId;

	private List<String> items;

	public OrderDTO() {
	}

	public OrderDTO(Order order) {
		this.id = order.getId().toString();
		this.userId = order.getUserId();
		this.items = order.getItems();
		this.merchantId = order.getMerchantId();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

}
