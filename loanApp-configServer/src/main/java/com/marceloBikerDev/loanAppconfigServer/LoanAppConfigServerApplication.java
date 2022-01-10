package com.marceloBikerDev.loanAppconfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LoanAppConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAppConfigServerApplication.class, args);
	}

}
