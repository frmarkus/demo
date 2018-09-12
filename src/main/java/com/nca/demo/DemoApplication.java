package com.nca.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("weniger peinlicher test");
		SpringApplication.run(DemoApplication.class, args);
	}


	@GetMapping("/hello/{name}")
	public String hello (@PathVariable String name) {
		return String.format("hello ", name);
	}
}
