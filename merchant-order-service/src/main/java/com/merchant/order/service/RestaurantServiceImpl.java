package com.merchant.order.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merchant.order.dto.RestaurantDTO;
import com.merchant.order.entity.Restaurant;
import com.merchant.order.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository repo;

	@Override
	public String createRestaurant(RestaurantDTO restaurantDTO) {

		Restaurant resuRestaurant = new Restaurant();
		BeanUtils.copyProperties(restaurantDTO, resuRestaurant);
		return repo.save(resuRestaurant).getId().toString();
	}

}
