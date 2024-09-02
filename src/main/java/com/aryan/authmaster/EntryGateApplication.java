package com.aryan.authmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableMongoAuditing
@EnableScheduling
public class EntryGateApplication {
	public static void main(String[] args) {
		SpringApplication.run(EntryGateApplication.class, args);
	}
}