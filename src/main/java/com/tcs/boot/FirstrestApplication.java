package com.tcs.boot;
//Testing to test change
//Test Pipeline

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstrestApplication.class, args);
		
	}
	
	@Bean
	//@Scope("Singleton")
	RestTemplate createTemplate() {
		return new RestTemplate();
	}

}
