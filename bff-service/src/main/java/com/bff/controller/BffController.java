package com.bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bff.constants.EventTags;
import com.bff.dto.OrderDTO;
import com.bff.event.SagaEvent;
import com.bff.exception.BffException;
import com.bff.producer.BffProducer;
import com.bff.service.BffOrderService;
import com.bff.validator.BffValidator;

@RestController
@RequestMapping("/bff")
public class BffController extends BaseController {

	@Autowired
	BffValidator bffValidator;

	@Autowired
	BffProducer bffProducer;

	@Autowired
	BffOrderService bffOrderService;

	@Value("${spring.application.name}")
	private String applicationName;

	@PostMapping("/order")
	public ResponseEntity<String> placeOrder(@RequestBody OrderDTO orderDTO) throws BffException {
		setAttributes();
		System.out.println("application name is " + applicationName);
		String event = EventTags.ORDER_EVENT;
		bffProducer.sendMessage(new SagaEvent((String) httpServletRequest.getAttribute(TXN_ID), event,
				HttpMethod.POST.name(), OrderDTO.class.getName(), orderDTO), "create_saga");
		bffValidator.validate(orderDTO);

		String orderId = bffOrderService.processOrder(orderDTO);
		return new ResponseEntity<String>(orderId, HttpStatus.OK);
	}

}
