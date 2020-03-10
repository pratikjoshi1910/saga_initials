package com.merchant.order.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.merchant.order.dto.RestaurantDTO;
import com.merchant.order.producer.MerchantProducer;
import com.merchant.order.service.RestaurantService;

@RestController
@RequestMapping(value = "/merchant")

public class MerchantController {

	@Autowired
	private MerchantProducer producer;

	@Autowired
	RestaurantService resService;

	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
	}

	@PostMapping(value = "/restaurant")
	public ResponseEntity<String> createRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
		return new ResponseEntity<String>(resService.createRestaurant(restaurantDTO), HttpStatus.OK);
	}
}