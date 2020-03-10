package com.merchant.order.dto;

import java.util.List;

public class RestaurantDTO {

	private String id;

	private String name;

	private List<ItemDTO> items;

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
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

}
