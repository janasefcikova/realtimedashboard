package com.janasef.realtimedashboard;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public NewTopic topic() {
		return new NewTopic("originating-country", 1, (short) 1);
	}
	
	@Bean
	public NewTopic topic2() {
		return new NewTopic("doubled-country", 1, (short) 1);
	}

}
