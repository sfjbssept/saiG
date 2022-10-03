package com.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.publisher.entity.User;

@SpringBootApplication
@RestController
public class KafkaPubApplication {

	@Autowired
	private KafkaTemplate<String, Object> template;
	
	private String topic = "spring-kafka1";
	
	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name) {
		template.send(topic, "Hi!.. I am Sai and here is the string you have passed "+name);
		return "Publsuhed Successfully";
	}
	
	@GetMapping("/publishjson")
	public String sendJson() {
		User user = new User(101,"Sai",new String[] {"Jannaram","Ponkal","Opp:SBIBank"});
		template.send(topic,user);
		return "User added successfully";
	}
	public static void main(String[] args) {
		SpringApplication.run(KafkaPubApplication.class, args);
	}

}
