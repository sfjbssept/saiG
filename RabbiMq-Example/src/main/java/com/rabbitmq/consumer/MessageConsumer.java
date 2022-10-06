package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.config.MessagingConfig;
import com.rabbitmq.entity.EmployeeStatus;

@Component
public class MessageConsumer {

	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessage(EmployeeStatus status) {
		System.out.println("Hi it is done "+status);
	}
}
