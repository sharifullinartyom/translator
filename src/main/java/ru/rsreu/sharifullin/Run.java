package ru.rsreu.sharifullin;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"ru.rsreu.sharifullin"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class Run {

	public static void main(String[] args) {
		SpringApplication.run(Run.class, args);
	}
}
