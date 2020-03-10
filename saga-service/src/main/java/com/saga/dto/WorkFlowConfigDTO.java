package com.saga.dto;

import com.saga.commons.enums.SubEvents;

public class WorkFlowConfigDTO {

	private String id;

	private String stepId;

	private Integer sequence;

	private String workFlowType;

	private String serviceId;

	private SubEvents subEvent;

	public SubEvents getSubEvent() {
		return subEvent;
	}

	public void setSubEvent(SubEvents subEvent) {
		this.subEvent = subEvent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
