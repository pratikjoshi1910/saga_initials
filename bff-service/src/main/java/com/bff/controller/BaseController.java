package com.bff.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.bff.util.UUIDGenerator;

public class BaseController {

	public static final String TXN_ID = "txnId";
	@Autowired
	HttpServletRequest httpServletRequest;

	public void setAttributes() {
		httpServletRequest.setAttribute(TXN_ID, UUIDGenerator.getTxnId());
	}

}
