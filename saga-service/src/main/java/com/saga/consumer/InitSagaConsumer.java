package com.saga.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.saga.event.SagaEvent;
import com.saga.event.handler.SagaEventHandler;

@Service
public class InitSagaConsumer {

	@Autowired
	SagaEventHandler sagaeventHandler;

	private final Logger logger = LoggerFactory.getLogger(SagaConsumer.class);

	Gson gson = new Gson();

	@KafkaListener(topics = "create_saga", groupId = "saga_consumer")
	public void consume(String message) {
		logger.info(String.format("$$ -> Consumed Message -> %s", message));
		SagaEvent event = gson.fromJson(message, SagaEvent.class);
		sagaeventHandler.handleInitEvent(event);
	}
}
