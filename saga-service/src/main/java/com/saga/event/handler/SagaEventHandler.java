package com.saga.event.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.saga.entity.EventPayload;
import com.saga.entity.TxnDetails;
import com.saga.entity.WorkFlowTxn;
import com.saga.entity.WorkflowConfig;
import com.saga.enums.StepStatusEnum;
import com.saga.event.SagaEvent;
import com.saga.repository.EventPayloadRepository;
import com.saga.repository.WorkflowConfigRepository;
import com.saga.repository.WorkflowTxnRepository;

@Component
public class SagaEventHandler {

	@Autowired
	WorkflowConfigRepository workFlowConfigRepository;

	@Autowired
	WorkflowTxnRepository workflowTxnRepository;

	@Autowired
	EventPayloadRepository payLoadRepository;

	@Async
	public void handleInitEvent(SagaEvent sagaEvent) {
		// fetch event type
		String eventType = sagaEvent.getEventType();
		List<WorkflowConfig> workFlowConfigEntries = workFlowConfigRepository.findByWorkFlowType(eventType);

		String txnId = sagaEvent.getTxnId();

		Object payload = sagaEvent.getPaylaod();
		// create entry in workflow txn table
		WorkFlowTxn workFlowTxns = new WorkFlowTxn();
		workFlowTxns.setTxnId(txnId);
		List<TxnDetails> txnDetails = new ArrayList<TxnDetails>();
		for (WorkflowConfig workflowConfig : workFlowConfigEntries) {
			TxnDetails txnDetail = new TxnDetails();
			txnDetail.setStepStatus(StepStatusEnum.NP);
			txnDetail.setWfwConfigId(workflowConfig.getId().toString());
			txnDetail.setSequence(workflowConfig.getSequence());
			txnDetail.setSubEvent(workflowConfig.getSubEvent());
			txnDetail.setCategory(workflowConfig.getCategory());
			txnDetails.add(txnDetail);
		}
		workFlowTxns.setTxnDetails(txnDetails);
		workflowTxnRepository.save(workFlowTxns);
		// enter data in payload table
		payLoadRepository.save(new EventPayload(txnId, payload));
	}

}
