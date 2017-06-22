package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerCiExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerCiExampleApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Hello world!");
	}
}
