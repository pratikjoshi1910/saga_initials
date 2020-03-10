package com.saga.dto;

import java.util.List;

import com.saga.enums.SagaEnum;

public class CompansateEventDTO {

	private String id;

	private SagaEnum eventType;

	private List<String> compenstateTopics;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SagaEnum getEventType() {
		return eventType;
	}

	public void setEventType(SagaEnum eventType) {
		this.eventType = eventType;
	}

	public List<String> getCompenstateTopics() {
		return compenstateTopics;
	}

	public void setCompenstateTopics(List<String> compenstateTopics) {
		this.compenstateTopics = compenstateTopics;
	}

}
