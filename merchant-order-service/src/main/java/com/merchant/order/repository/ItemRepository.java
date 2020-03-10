package com.merchant.order.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.merchant.order.entity.Item;

public interface ItemRepository extends MongoRepository<Item, ObjectId> {

}
