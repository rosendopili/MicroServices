package com.example.songsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SongsApiApplication {

	@RequestMapping("/")
	public String home() {
		return "some songs";
	}

	public static void main(String[] args) {
		SpringApplication.run(SongsApiApplication.class, args);
	}

}
