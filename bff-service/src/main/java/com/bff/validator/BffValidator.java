package com.bff.validator;

import com.bff.exception.BffException;

public interface BffValidator {

	public void validate(Object object) throws BffException;

}
