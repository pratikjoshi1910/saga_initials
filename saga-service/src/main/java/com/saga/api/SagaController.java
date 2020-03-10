package com.saga.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saga.dto.StepDTO;
import com.saga.dto.StepStatusDTO;
import com.saga.dto.WorkFlowConfigDTO;
import com.saga.dto.WorkFlowTxnDTO;
import com.saga.service.SagaService;

@RestController
@RequestMapping(value = "/saga")
public class SagaController {

	@Autowired
	SagaService sagaService;

	/*
	 * @PostMapping("/CompensateEvent") public void
	 * createComponsteEvent(@RequestBody List<CompansateEventDTO> compEvents) {
	 * sagaService.createCompansateEvent(compEvents); }
	 */

	@PostMapping("/step")
	public void createStep(@RequestBody StepDTO stepDTO) {
		sagaService.createStep(stepDTO);
	}

	@PostMapping("/stepStatus")
	public void createStepStatus(@RequestBody StepStatusDTO stepStatusDTO) {
		sagaService.createStepStatus(stepStatusDTO);
	}

	@PostMapping("/workflowConfig")
	public void createWorkFlowConfig(@RequestBody WorkFlowConfigDTO workFlowConfigDTO) {
		sagaService.createWorkFlowConfig(workFlowConfigDTO);
	}

	@PostMapping("/workFlowTxn")
	public void createWorkFlowTxn(@RequestBody WorkFlowTxnDTO workFlowTxnDTO) {
		sagaService.createWorkFlowTxn(workFlowTxnDTO);
	}

}
