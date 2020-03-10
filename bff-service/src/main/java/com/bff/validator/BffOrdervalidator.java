package com.bff.validator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.bff.dto.OrderDTO;
import com.bff.exception.BffException;
import com.bff.outBoundCall.ItemRemoteService;
import com.bff.outBoundCall.MerchantRemoteService;
import com.bff.outBoundCall.UserRemoteService;
import com.saga.commons.enums.SubEvents;

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

	}

	boolean checkUserIdAvailablity(String userId) throws BffException {
		Boolean flag = userRemoteService.checkUserStatus(userId);
		if (flag) {
			return true;
		} else {
			throw new BffException("ERR_1234", HttpStatus.BAD_REQUEST, "userId does not exist.",
					SubEvents.USER_VALIDATION, null);
		}

	}

	boolean validateMrchantId(String merchantId) throws BffException {

		Boolean flag = merchantRemoteService.checkMechant(merchantId);
		if (flag) {
			return flag;
		} else {
			throw new BffException("ERR_1234", HttpStatus.BAD_REQUEST, "merchant or item does not exist.",
					SubEvents.MERCHANT_ITEM_VALIDATION, null);
		}

	}

}
