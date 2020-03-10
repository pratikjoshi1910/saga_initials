package com.saga.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EventPayload {

	@Id
	private ObjectId id;

	private String txnId;

	private Object payload;

	public EventPayload() {

	}

	public EventPayload(String txnId, Object payload) {
		super();
		this.txnId = txnId;
		this.payload = payload;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public Object getPayload() {
		return payload;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

}
