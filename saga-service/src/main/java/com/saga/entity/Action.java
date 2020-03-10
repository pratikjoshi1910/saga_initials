package com.saga.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.saga.enums.ActionType;

@Document
public class Action {

	private String eventType;

	private ActionType actionType;

	private String endPoint;

	private List<String> actionTopics;

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public List<String> getActionTopics() {
		return actionTopics;
	}

	public void setActionTopics(List<String> actionTopics) {
		this.actionTopics = actionTopics;
	}

}
