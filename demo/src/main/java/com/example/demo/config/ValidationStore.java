package com.example.demo.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.example.demo.validator.DemoValidator;

@Component
public class ValidationStore {

	@Autowired
	List<DemoValidator> validators;

	Map<String, DemoValidator> validatorMap = new HashMap<>();

	MultiValueMap<String, List<DemoValidator>> validationMap = new LinkedMultiValueMap<>();

	@PostConstruct

	public void init() {

		for (DemoValidator validator : validators) {
			String type = validator.getType();
			validatorMap.put(type, validator);
		}
	}

	public DemoValidator getValidator(String endpointId) {
		return validatorMap.get(endpointId);

	}

}
