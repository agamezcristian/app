package com.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesApplication.class, args);
	}

}
