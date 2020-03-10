package com.merchant.order.service;

import java.util.List;

import com.merchant.order.dto.ItemDTO;

public interface ItemService {

	public String createItem(ItemDTO item);

	public List<ItemDTO> getAllItems();

	public ItemDTO getItemById(String id);
}
