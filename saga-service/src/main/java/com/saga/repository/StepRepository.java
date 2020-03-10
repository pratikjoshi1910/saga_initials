package com.saga.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saga.entity.Step;

@Repository
public interface StepRepository extends MongoRepository<Step, ObjectId> {

}
