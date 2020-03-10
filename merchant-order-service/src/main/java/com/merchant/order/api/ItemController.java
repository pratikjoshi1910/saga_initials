package com.merchant.order.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merchant.order.dto.ItemDTO;
import com.merchant.order.service.ItemService;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

	@Autowired
	ItemService itemService;

	@PostMapping
	public ResponseEntity<String> createItem(@RequestBody ItemDTO itemDTO) {
		String result = itemService.createItem(itemDTO);
		return new ResponseEntity<>(result, HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<List<ItemDTO>> getAllItems() {
		List<ItemDTO> result = itemService.getAllItems();
		return new ResponseEntity<>(result, HttpStatus.OK);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ItemDTO> getItemById(@PathVariable("id") String id) {
		ItemDTO result = itemService.getItemById(id);
		return new ResponseEntity<>(result, HttpStatus.OK);

	}

}
