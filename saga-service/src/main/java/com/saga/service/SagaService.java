package com.saga.service;

import com.saga.dto.StepDTO;
import com.saga.dto.StepStatusDTO;
import com.saga.dto.WorkFlowConfigDTO;
import com.saga.dto.WorkFlowTxnDTO;

public interface SagaService {

	// void createCompansateEvent(List<CompansateEventDTO> compEvents);

	void createStep(StepDTO stepDTO);

	void createStepStatus(StepStatusDTO stepStatusDTO);

	void createWorkFlowConfig(WorkFlowConfigDTO workFlowConfigDTO);

	void createWorkFlowTxn(WorkFlowTxnDTO workFlowTxnDTO);

}
