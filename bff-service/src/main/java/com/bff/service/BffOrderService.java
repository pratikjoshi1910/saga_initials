package com.bff.service;

import com.bff.dto.OrderDTO;
import com.bff.exception.BffException;

public interface BffOrderService {

	public String processOrder(OrderDTO orderDTO) throws BffException;

}
