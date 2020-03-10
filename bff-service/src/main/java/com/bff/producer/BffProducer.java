package com.bff.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class BffProducer {
	private static final Logger logger = LoggerFactory.getLogger(BffProducer.class);
	private Gson gson = new Gson();

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Async
	public void sendMessage(Object message, String topic) {
		String messageJson = gson.toJson(message);
		logger.info(String.format("$$ -> Producing message --> %s", messageJson));
		this.kafkaTemplate.send(topic, messageJson);
	}
}
