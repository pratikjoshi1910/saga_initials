package com.saga.service;

import com.saga.event.ProducerEvent;

public interface EventProcessingService {

	public void processEvent(ProducerEvent producerEvent);
}
