package com.prashant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExampleFeginClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleFeginClientApplication.class, args);
	}

}
