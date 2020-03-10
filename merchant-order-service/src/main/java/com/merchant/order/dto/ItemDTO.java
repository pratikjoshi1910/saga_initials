package com.merchant.order.dto;

import com.merchant.order.entity.Item;

public class ItemDTO {

	private String id;

	private String name;

	private Integer price;

	public ItemDTO() {
	};

	public ItemDTO(Item item) {
		this.id = item.getId().toString();
		this.name = item.getName();
		this.price = item.getPrice();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}
