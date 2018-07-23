package com.demo.airline.demoSpringAirline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"edu.sjsu.cmpe275.sevice","edu.sjsu.cmpe275.repository","edu.sjsu.cmpe275.controller"})
public class DemoSpringAirlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAirlineApplication.class, args);
	}
}
