package com.EndUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;





@Configuration
public class KafkaConfig {

	@KafkaListener(topics="Location_update_topic",groupId = "group-1")
	public void updateLocation(String value)
	{
		System.out.println(value);
	}
}
