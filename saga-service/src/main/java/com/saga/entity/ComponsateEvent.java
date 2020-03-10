package com.saga.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.saga.enums.SagaEnum;

@Document
public class ComponsateEvent {

	@Id
	private ObjectId id;

	private SagaEnum eventType;

	private List<String> compenstateTopics;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
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
