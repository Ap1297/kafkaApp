package com.thunderCoder.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
	
	@KafkaListener(topics  = "helloworld-topic", groupId="group_id")
	public void consume(String message)
	{
		System.out.println("Received message: "+message);
	}
	
}
