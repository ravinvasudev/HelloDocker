package com.vasudev.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <p>
 * This is the classic Spring Boot Class and has nothing to do with Docker
 * capabilities.
 * </p>
 * <p>
 * There's a file called Dockerfile (with Capital D) which has configuration
 * specific for Docker.
 * </p>
 *
 * @author Ravin Vasudev
 */
@SpringBootApplication
@RestController
public class HelloDockerApplication {

	@RequestMapping("/")
	public String sayHello() {
		return "<h1>Hello From Docker</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloDockerApplication.class, args);
	}
}
