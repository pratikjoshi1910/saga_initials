package com.saga.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.saga.entity.WorkflowConfig;

public interface WorkflowConfigRepository extends MongoRepository<WorkflowConfig, ObjectId> {

	List<WorkflowConfig> findByWorkFlowType(String eventType);

	WorkflowConfig findByWorkFlowTypeAndServiceId(String workflowType, String serviceId);
}
