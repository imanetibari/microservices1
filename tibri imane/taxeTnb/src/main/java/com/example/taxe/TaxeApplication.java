package com.example.taxe;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class TaxeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxeApplication.class, args);
	}

}

