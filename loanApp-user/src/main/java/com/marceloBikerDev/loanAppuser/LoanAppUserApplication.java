package com.marceloBikerDev.loanAppuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoanAppUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAppUserApplication.class, args);
	}

}
