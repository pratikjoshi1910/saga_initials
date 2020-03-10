package com.saga.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saga.entity.WorkFlowTxn;

@Repository
public interface WorkflowTxnRepository extends MongoRepository<WorkFlowTxn, ObjectId> {

	WorkFlowTxn findByTxnId(String txnId);

}
