package com.devinhouse.senaidevinhouse;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = "java.com.calculadora.calculator.*")
public class SenaiDevinhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiDevinhouseApplication.class, args);

		CalculatorService calculadora = applicationContext.getBean(CalculatorService.class);
	}

}
