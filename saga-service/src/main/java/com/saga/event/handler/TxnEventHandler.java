package com.saga.event.handler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.saga.commons.enums.SubEvents;
import com.saga.entity.TxnDetails;
import com.saga.entity.WorkFlowTxn;
import com.saga.enums.StepStatusEnum;
import com.saga.event.ProducerEvent;
import com.saga.repository.WorkflowTxnRepository;

@Component
public class TxnEventHandler {

	@Autowired
	WorkflowTxnRepository workflowTxnRepository;

	@SuppressWarnings("unlikely-arg-type")
	@Async
	public void handle(ProducerEvent producerEvent) throws InterruptedException {
		Optional<TxnDetails> txnDetail = null;
		Boolean result = producerEvent.getResult();
		String txnId = producerEvent.getTxnId();
		SubEvents subEvent = producerEvent.getSubEvent();
		String workFlowConfigId = producerEvent.getWorkFlowConfigId();
		Thread.sleep(1000);
		WorkFlowTxn workflowTxn = workflowTxnRepository.findByTxnId(txnId);
		List<TxnDetails> txns = workflowTxn.getTxnDetails();
		if (null != workFlowConfigId) {
			txnDetail = txns.stream().filter(x -> x.getWfwConfigId() == workFlowConfigId).findFirst();

		} else if (subEvent != null) {
			txnDetail = txns.stream().filter(x -> x.getSubEvent() == subEvent).findFirst();
		}
		txns.remove(txnDetail);
		if (result) {
			txnDetail.get().setStepStatus(StepStatusEnum.PASSED);
		} else {
			txnDetail.get().setStepStatus(StepStatusEnum.FAILED);

		}
		txns.add(txnDetail.get());
		workflowTxn.setTxnDetails(txns);
		workflowTxnRepository.save(workflowTxn);

	}
}
