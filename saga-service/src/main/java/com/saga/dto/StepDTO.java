package com.saga.dto;

import java.util.List;
import java.util.Map;

public class StepDTO {

	private String id;

	private String version;

	private String name;

	private Map<String, List<CompansateEventDTO>> componsateEvents;

	public Map<String, List<CompansateEventDTO>> getComponsateEvents() {
		return componsateEvents;
	}

	public void setComponsateEvents(Map<String, List<CompansateEventDTO>> componsateEvents) {
		this.componsateEvents = componsateEvents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
