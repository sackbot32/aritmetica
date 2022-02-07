package com.ntt.aritmetica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AritmeticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AritmeticaApplication.class, args);
	}

}
