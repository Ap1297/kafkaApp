package com.thunderCoder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic ="helloworld-topic";
	
	public void send (String message)
	{
		try {
			kafkaTemplate.send(kafkaTopic,message);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
