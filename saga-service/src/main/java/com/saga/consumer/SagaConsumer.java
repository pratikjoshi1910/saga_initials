package com.saga.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.saga.event.ProducerEvent;
import com.saga.event.handler.TxnEventHandler;

@Service
public class SagaConsumer {
	private final Logger logger = LoggerFactory.getLogger(SagaConsumer.class);
	Gson gson = new Gson();

	@Autowired
	TxnEventHandler validationEventHandler;

	@KafkaListener(topics = "saga", groupId = "saga_consumer")
	public void consume(String message) {
		ProducerEvent event = gson.fromJson(message, ProducerEvent.class);
		try {
			validationEventHandler.handle(event);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
