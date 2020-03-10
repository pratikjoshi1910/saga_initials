package com.merchant.order.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merchant.order.dto.ItemDTO;
import com.merchant.order.entity.Item;
import com.merchant.order.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	@Override
	public String createItem(ItemDTO itemDTO) {
		Item item = new Item();
		BeanUtils.copyProperties(itemDTO, item);
		item = itemRepository.save(item);
		return item.getId().toString();
	}

	@Override
	public List<ItemDTO> getAllItems() {
		List<Item> items = itemRepository.findAll();
		List<ItemDTO> itemDTOs = new ArrayList<ItemDTO>();
		for (Item item : items) {
			ItemDTO itemDTO = new ItemDTO(item);
			itemDTOs.add(itemDTO);
		}
		return itemDTOs;
	}

	@Override
	public ItemDTO getItemById(String id) {
		Optional<Item> item = itemRepository.findById(new ObjectId(id));
		ItemDTO itemDTO = new ItemDTO(item.get());
		return itemDTO;

	}

}
