package com.saga.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saga.entity.EventPayload;

@Repository
public interface EventPayloadRepository extends MongoRepository<EventPayload, String> {

}
