package com.activemq.producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publis")
public class Producer {

	@Autowired
	JmsTemplate jmsTemp;
	@Autowired
	Queue queue;

	@GetMapping("/{msg}")
	public String publish(@PathVariable("msg") final String msg) {
		jmsTemp.convertAndSend(queue, msg);
		return "Published by Sai" + msg;

	}
}
