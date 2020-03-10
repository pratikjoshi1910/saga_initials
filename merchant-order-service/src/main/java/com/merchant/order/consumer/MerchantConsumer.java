package com.merchant.order.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MerchantConsumer {
	private final Logger logger = LoggerFactory.getLogger(MerchantConsumer.class);

	@KafkaListener(topics = "test", groupId = "group_id")
	public void consume(String message) {
		logger.info(String.format("$$ -> Consumed Message -> %s", message));
	}
}
