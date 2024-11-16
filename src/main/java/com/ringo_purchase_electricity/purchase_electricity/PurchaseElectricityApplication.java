package com.ringo_purchase_electricity.purchase_electricity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PurchaseElectricityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseElectricityApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
