package com.sqs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqsController {


	  private final static Logger LOGGER = LoggerFactory.getLogger(SqsController.class);

	  @Autowired
	  private QueueMessagingTemplate queueMessagingTemplate;

	  @Value("${cloud.aws.end-point.uri}")
	  private String sqsQueueEndPoint;

	  @PostMapping("/send")
	  public void sendMessageToSQSQueue(@RequestBody String message) {
	    queueMessagingTemplate.send(sqsQueueEndPoint, MessageBuilder.withPayload(message).build());
	  }
	  
	  @GetMapping("/send/{message}")
	  public void readMessageToSQSQueue(@PathVariable String message) {
	    queueMessagingTemplate.send(sqsQueueEndPoint, MessageBuilder.withPayload(message).build());
	  }

	  @SqsListener("saisqs")
	  public void fetchMessageFromSQSQueue(String message) {
	    LOGGER.info("message from the SQS Queue {}", message);
	  }
	
}
