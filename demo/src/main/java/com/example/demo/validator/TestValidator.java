package com.example.demo.validator;

import org.springframework.stereotype.Component;

@Component
public class TestValidator implements DemoValidator {

	@Override
	public void validate() {
		System.out.println("inside test validator");
	}

	@Override
	public String getType() {
		return "TEST";
	}

}
