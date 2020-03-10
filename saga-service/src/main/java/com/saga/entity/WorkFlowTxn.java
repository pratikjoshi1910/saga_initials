package com.saga.entity;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class WorkFlowTxn {

	@Id
	private ObjectId id;

	private String txnId;

	private String eventType;

	private List<TxnDetails> txnDetails = new ArrayList<TxnDetails>();

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
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

	public List<TxnDetails> getTxnDetails() {
		return txnDetails;
	}

	public void setTxnDetails(List<TxnDetails> txnDetails) {
		this.txnDetails = txnDetails;
	}

}
