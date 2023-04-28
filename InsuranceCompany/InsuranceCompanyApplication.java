package com.example.InsuranceCompany;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.example.InsuranceCompany")
@SpringBootApplication
public class InsuranceCompanyApplication {
	
	private static final Logger log = LoggerFactory.getLogger(InsuranceCompanyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(InsuranceCompanyApplication.class, args);
	}

}
