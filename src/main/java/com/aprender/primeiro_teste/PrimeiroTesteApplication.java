package com.aprender.primeiro_teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PrimeiroTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroTesteApplication.class, args);
	}

}
