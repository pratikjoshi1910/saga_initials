package com.bff.event;

public class SagaEvent {

	private String txnId;

	private String eventType;

	private String type;

	private String targetClass;

	private Object paylaod;

	public SagaEvent() {

	}

	public SagaEvent(String txnId, String eventType, String type, String targetClass, Object paylaod) {
		super();
		this.txnId = txnId;
		this.eventType = eventType;
		this.type = type;
		this.targetClass = targetClass;
		this.paylaod = paylaod;
	}

	@Override
	public String toString() {
		return "SagaEvent [eventType=" + eventType + ", type=" + type + ", targetClass=" + targetClass + ", paylaod="
				+ paylaod + "]";
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTargetClass() {
		return targetClass;
	}

	public void setTargetClass(String targetClass) {
		this.targetClass = targetClass;
	}

	public Object getPaylaod() {
		return paylaod;
	}

	public void setPaylaod(Object paylaod) {
		this.paylaod = paylaod;
	}

}
