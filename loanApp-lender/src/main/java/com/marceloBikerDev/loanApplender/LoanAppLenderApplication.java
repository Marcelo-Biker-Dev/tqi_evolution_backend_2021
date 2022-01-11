package com.marceloBikerDev.loanApplender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoanAppLenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAppLenderApplication.class, args);
	}

}
