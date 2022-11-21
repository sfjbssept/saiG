package com.sqs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(exclude = {ContextStackAutoConfiguration.class})
public class SpringSqsProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSqsProject1Application.class, args);
	}

}
