package com.bff.util;

import java.util.UUID;

public class UUIDGenerator {

	public static String getTxnId() {
		return UUID.randomUUID().toString();
	}
}
