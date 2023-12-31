package com.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class RegistrationFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationFormApplication.class, args);
		
		System.out.println("starting code...");
	}

}
