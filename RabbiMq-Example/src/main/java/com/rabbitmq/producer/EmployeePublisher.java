package com.rabbitmq.producer;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.config.MessagingConfig;
import com.rabbitmq.entity.Employee;
import com.rabbitmq.entity.EmployeeStatus;

@RestController
@RequestMapping("/Employee")
public class EmployeePublisher {

	@Autowired
	private RabbitTemplate restTemplate;
	
	@PostMapping("/company/{companyName}")
	public String saveEmployee(@RequestBody Employee emp,@PathVariable String companyName) {
		emp.setEmpId(UUID.randomUUID().toString());
		EmployeeStatus employeeStatus = new EmployeeStatus(emp,"Hi");
		restTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, employeeStatus);
		return "done!";
		
	}
}
