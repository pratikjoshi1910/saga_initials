package com.saga.event;

import com.saga.commons.enums.SubEvents;

public class ProducerEvent {

	private String txnId;

	private Boolean result = false;

	private String service;

	private String workFlowConfigId;

	private SubEvents subEvent;

	public ProducerEvent() {

	}

	public ProducerEvent(String txnId, String applicationName, String workFlowConfigId, SubEvents subEvent) {

		this.txnId = txnId;
		this.service = applicationName;
		this.workFlowConfigId = workFlowConfigId;
		this.subEvent = subEvent;

	}

	public String getWorkFlowConfigId() {
		return workFlowConfigId;
	}

	public void setWorkFlowConfigId(String workFlowConfigId) {
		this.workFlowConfigId = workFlowConfigId;
	}

	public SubEvents getSubEvent() {
		return subEvent;
	}

	public void setSubEvent(SubEvents subEvent) {
		this.subEvent = subEvent;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

}
