package com.order.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.dto.OrderDTO;
import com.order.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping
	public ResponseEntity<String> createOrder(@RequestBody OrderDTO orderDTO) {
		return new ResponseEntity<String>(orderService.createOrder(orderDTO), HttpStatus.OK);

	}

}
