package com.bff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bff.dto.OrderDTO;
import com.bff.exception.BffException;
import com.bff.outBoundCall.OrderRemoteService;
import com.bff.outBoundCall.PaymentRemoteService;

@Service
public class BffOrderserviceImpl implements BffOrderService {

	@Autowired
	OrderRemoteService orderRemoteService;

	@Autowired
	PaymentRemoteService paymentRemoteService;

	@Override
	public String processOrder(OrderDTO orderDTO) throws BffException {

		// place order call to the order service

		String orderId = orderRemoteService.placeOrder(orderDTO);

		// place payment call to the payment service

		paymentRemoteService.performPayment(orderDTO.getUserId(), 100.00f);
		return orderId;
	}

}
