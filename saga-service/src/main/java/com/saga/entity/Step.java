package com.saga.entity;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Step {

	@Id
	private ObjectId id;

	private String name;

	private String version;

	private Map<String, List<ComponsateEvent>> componsateEvents;

	private Action action;

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Map<String, List<ComponsateEvent>> getComponsateEvents() {
		return componsateEvents;
	}

	public void setComponsateEvents(Map<String, List<ComponsateEvent>> componsateEvents) {
		this.componsateEvents = componsateEvents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
