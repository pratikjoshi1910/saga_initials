package com.saga.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saga.entity.ComponsateEvent;

@Repository
public interface CompansteEventRepository extends MongoRepository<ComponsateEvent, ObjectId> {

}
