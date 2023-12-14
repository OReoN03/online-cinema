package com.example.onlinecinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.onlinecinema.*")
public class OnlineCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCinemaApplication.class, args);
	}
}
