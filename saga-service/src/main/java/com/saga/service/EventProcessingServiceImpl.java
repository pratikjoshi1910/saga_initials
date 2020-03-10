package com.saga.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.saga.event.ProducerEvent;

@Service
public class EventProcessingServiceImpl implements EventProcessingService {

	@Override
	@Async
	public void processEvent(ProducerEvent producerEvent) {

	}

}
