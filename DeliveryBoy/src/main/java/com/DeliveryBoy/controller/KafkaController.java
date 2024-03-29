package com.DeliveryBoy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DeliveryBoy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class KafkaController {
	
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation()
	{
		kafkaService.updateLocation("location is gangwada");
		return ResponseEntity.ok(Map.of("message","location updated")); 
	}

}
