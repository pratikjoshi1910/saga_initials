package com.bff.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bff.dto.CustomErrorResponse;
import com.bff.event.ProducerEvent;
import com.bff.exception.BffException;
import com.bff.producer.BffProducer;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
	@Value("${spring.application.name}")
	String applicationName;

	@Autowired
	HttpServletRequest httpServletRequest;

	@Autowired
	BffProducer producer;

	@ExceptionHandler(value = { BffException.class })
	protected ResponseEntity<Object> handleConflict(BffException ex) {
		String txnId = (String) httpServletRequest.getAttribute("txnId");
		CustomErrorResponse errorResponse = new CustomErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setStatus(ex.getStatus().value());
		errorResponse.setCode(ex.getCode());
		errorResponse.setTimestamp(System.currentTimeMillis());
		ProducerEvent producerEvent = new ProducerEvent(txnId, applicationName, ex.getWorkFlowConfigId(),
				ex.getSubEvent());
		producer.sendMessage(producerEvent, "saga");
		return new ResponseEntity<Object>(errorResponse, ex.getStatus());
	}
}
