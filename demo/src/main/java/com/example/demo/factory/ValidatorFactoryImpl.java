package com.example.demo.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.config.ValidationStore;
import com.example.demo.validator.DemoValidator;

@Component
public class ValidatorFactoryImpl implements ValidatorFactory {

	@Autowired
	ValidationStore validationStore;

	@Override
	public void validate(String value) {
		DemoValidator validator = validationStore.getValidator(value);
		validator.validate();

	}

}
