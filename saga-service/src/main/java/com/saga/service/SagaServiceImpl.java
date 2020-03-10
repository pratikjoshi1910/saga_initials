package com.saga.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saga.dto.StepDTO;
import com.saga.dto.StepStatusDTO;
import com.saga.dto.WorkFlowConfigDTO;
import com.saga.dto.WorkFlowTxnDTO;
import com.saga.entity.Step;
import com.saga.entity.StepStatus;
import com.saga.entity.WorkFlowTxn;
import com.saga.entity.WorkflowConfig;
import com.saga.repository.CompansteEventRepository;
import com.saga.repository.StepRepository;
import com.saga.repository.StepStatusRepository;
import com.saga.repository.WorkflowConfigRepository;
import com.saga.repository.WorkflowTxnRepository;

@Service
public class SagaServiceImpl implements SagaService {

	@Autowired
	CompansteEventRepository compansteEventRepository;

	@Autowired
	StepRepository stepRepository;

	@Autowired
	StepStatusRepository stepStatusRepository;

	@Autowired
	WorkflowConfigRepository workflowConfigRepository;

	@Autowired
	WorkflowTxnRepository workflowTxnRepository;

	/*
	 * @Override public void createCompansateEvent(List<CompansateEventDTO>
	 * compEvents) {
	 * 
	 * List<ComponsateEvent> componsateEvents = new ArrayList<>(); for
	 * (CompansateEventDTO compansateEventDTO : compEvents) { ComponsateEvent
	 * componsateEvent = new ComponsateEvent();
	 * BeanUtils.copyProperties(compansateEventDTO, componsateEvents);
	 * componsateEvent.setEventType(compansateEventDTO.getEventType());
	 * componsateEvents.add(componsateEvent); }
	 * compansteEventRepository.saveAll(componsateEvents);
	 * 
	 * }
	 */

	@Override
	public void createStep(StepDTO stepDTO) {
		Step step = new Step();
		BeanUtils.copyProperties(stepDTO, step);
		stepRepository.save(step);
	}

	@Override
	public void createStepStatus(StepStatusDTO stepStatusDTO) {
		StepStatus stepStatus = new StepStatus();
		BeanUtils.copyProperties(stepStatusDTO, stepStatus);
		stepStatusRepository.save(stepStatus);

	}

	@Override
	public void createWorkFlowConfig(WorkFlowConfigDTO workFlowConfigDTO) {
		WorkflowConfig workflowConfig = new WorkflowConfig();
		BeanUtils.copyProperties(workFlowConfigDTO, workflowConfig);
		workflowConfigRepository.save(workflowConfig);
	}

	@Override
	public void createWorkFlowTxn(WorkFlowTxnDTO workFlowTxnDTO) {
		WorkFlowTxn workFlowTxn = new WorkFlowTxn();
		BeanUtils.copyProperties(workFlowTxnDTO, workFlowTxn);
		workflowTxnRepository.save(workFlowTxn);
	}

}
