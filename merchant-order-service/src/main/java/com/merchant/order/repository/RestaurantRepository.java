package com.merchant.order.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.merchant.order.entity.Restaurant;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

}
