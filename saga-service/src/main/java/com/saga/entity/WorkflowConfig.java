package com.saga.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.saga.commons.enums.EventCategory;
import com.saga.commons.enums.SubEvents;

@Document
public class WorkflowConfig {

	@Id
	private ObjectId id;

	private String stepId;

	private Integer sequence;

	private String workFlowType;

	private String serviceId;

	private SubEvents subEvent;

	private EventCategory category;

	public EventCategory getCategory() {
		return category;
	}

	public void setCategory(EventCategory category) {
		this.category = category;
	}

	public SubEvents getSubEvent() {
		return subEvent;
	}

	public void setSubEvent(SubEvents subEvent) {
		this.subEvent = subEvent;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getStepId() {
		return stepId;
	}

	public void setStepId(String stepId) {
		this.stepId = stepId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getWorkFlowType() {
		return workFlowType;
	}

	public void setWorkFlowType(String workFlowType) {
		this.workFlowType = workFlowType;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
