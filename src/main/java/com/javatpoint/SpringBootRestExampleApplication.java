package com.javatpoint;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootRestExampleApplication implements ApplicationRunner {
	public static void main(String[] args) {
		System.out.println("In Main");
		SpringApplication.run(SpringBootRestExampleApplication.class, args);
		System.out.println("Main Completed");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("In Application Runner");

	}
}
