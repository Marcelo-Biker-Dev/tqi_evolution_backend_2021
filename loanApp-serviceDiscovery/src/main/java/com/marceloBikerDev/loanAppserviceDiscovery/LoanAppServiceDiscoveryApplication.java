package com.marceloBikerDev.loanAppserviceDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LoanAppServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanAppServiceDiscoveryApplication.class, args);
	}

}
