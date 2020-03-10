package com.bff.outBoundCall;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.bff.exception.BffException;
import com.saga.commons.enums.SubEvents;

@Component
public class PaymentRemoteService {

	public void performPayment(String userId, Float amount) throws BffException {
		throw new BffException("ERR_1235", HttpStatus.INTERNAL_SERVER_ERROR, "Payment Failed.", SubEvents.PAYMENT_EVENT,
				null);
	}
}
