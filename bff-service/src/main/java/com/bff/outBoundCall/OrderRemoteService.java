package com.bff.outBoundCall;

import org.springframework.stereotype.Component;

import com.bff.dto.OrderDTO;
import com.bff.exception.BffException;

@Component
public class OrderRemoteService {

	public boolean checkOrderId(String orderId) {
		return false;
	}

	public String placeOrder(OrderDTO orderDTO) throws BffException {
		/*
		 * throw new BffException("ERR_1234", HttpStatus.BAD_REQUEST,
		 * "userId does not exist.", SubEvents.ORDER_EVENT, null);
		 */
		return "order-1";
	}

}
