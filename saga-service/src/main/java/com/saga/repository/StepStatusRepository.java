package com.saga.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saga.entity.StepStatus;

@Repository
public interface StepStatusRepository extends MongoRepository<StepStatus, ObjectId> {

}
