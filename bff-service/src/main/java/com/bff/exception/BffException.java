package com.bff.exception;

import org.springframework.http.HttpStatus;

import com.saga.commons.enums.SubEvents;

public class BffException extends Exception {

	private static final long serialVersionUID = 1L;

	private String code;

	private String message;

	private HttpStatus status;

	private SubEvents subEvent;

	private String workFlowConfigId;

	public BffException(String code, HttpStatus status, String message, SubEvents subEvent, String workFlowConfigId) {
		this.code = code;
		this.status = status;
		this.message = message;
		this.subEvent = subEvent;
		this.workFlowConfigId = workFlowConfigId;
	}

	public String getWorkFlowConfigId() {
		return workFlowConfigId;
	}

	public void setWorkFlowConfigId(String workFlowConfigId) {
		this.workFlowConfigId = workFlowConfigId;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SubEvents getSubEvent() {
		return subEvent;
	}

	public void setSubEvent(SubEvents subEvent) {
		this.subEvent = subEvent;
	}

}
