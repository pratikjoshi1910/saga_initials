package com.saga.entity;

import com.saga.commons.enums.EventCategory;
import com.saga.commons.enums.SubEvents;
import com.saga.enums.StepStatusEnum;

public class TxnDetails {

	private String wfwConfigId;

	private StepStatusEnum stepStatus = StepStatusEnum.NP;

	private Integer sequence;

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

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getWfwConfigId() {
		return wfwConfigId;
	}

	public void setWfwConfigId(String wfwConfigId) {
		this.wfwConfigId = wfwConfigId;
	}

	public StepStatusEnum getStepStatus() {
		return stepStatus;
	}

	public void setStepStatus(StepStatusEnum stepStatus) {
		this.stepStatus = stepStatus;
	}

}
