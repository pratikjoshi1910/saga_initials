package com.bff.outBoundCall;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bff.remote.dto.RemoteItemValidator;

@Component
public class ItemRemoteService {

	public List<RemoteItemValidator> validateItem(List<String> items) {

		return new ArrayList<>();

	}

}
