package com.paytmmoney.sip.sipDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.paytmmoney"})
@SpringBootApplication
public class SipDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SipDemoApplication.class, args);
		System.out.println("Hello World");
	}

}
