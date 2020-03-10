package com.bff.validator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.bff.dto.OrderDTO;
import com.bff.exception.BffException;
import com.bff.outBoundCall.ItemRemoteService;
import com.bff.outBoundCall.MerchantRemoteService;
import com.bff.outBoundCall.UserRemoteService;

@Component
public class BffOrdervalidator implements BffValidator {

	@Autowired
	UserRemoteService userRemoteService;

	@Autowired
	ItemRemoteService itemRemoteService;

	@Autowired
	MerchantRemoteService merchantRemoteService;

	@Autowired
	HttpServletRequest httpServletRequest;

	@Override
	public void validate(Object object) throws BffException {

		OrderDTO orderDto = (OrderDTO) object;
		checkUserIdAvailablity(orderDto.getUserId());
		validateMrchantId(orderDto.getMerchantId());
		validateItems(orderDto.getItems());

	}

	boolean checkUserIdAvailablity(String userId) throws BffException {
		Boolean flag = userRemoteService.checkUserStatus(userId);
		if (flag) {
			return true;
		} else {
			String txn = (String) httpServletRequest.getAttribute("txnId");
			System.out.println("txn is" + txn);
			throw new BffException("ERR_1234", HttpStatus.BAD_REQUEST, "userId does not exist.");
		}

	}

	boolean validateMrchantId(String merchantId) {

		Boolean flag = merchantRemoteService.checkMechant(merchantId);
		return true;

	}

	boolean validateItems(List<String> items) {
		itemRemoteService.validateItem(items);
		return true;
	}

}
