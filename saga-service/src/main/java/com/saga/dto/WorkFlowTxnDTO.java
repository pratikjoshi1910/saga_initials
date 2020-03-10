package com.saga.dto;

public class WorkFlowTxnDTO {

	private String id;

	private String txnId;

	private String stepId;

	private String stepStatus;

	private String workFlowType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getStepId() {
		return stepId;
	}

	public void setStepId(String stepId) {
		this.stepId = stepId;
	}

	public String getStepStatus() {
		return stepStatus;
	}

	public void setStepStatus(String stepStatus) {
		this.stepStatus = stepStatus;
	}

	public String getWorkFlowType() {
		return workFlowType;
	}

	public void setWorkFlowType(String workFlowType) {
		this.workFlowType = workFlowType;
	}

}
