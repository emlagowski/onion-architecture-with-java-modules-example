package io.github.emlagowski.springbootwithmodules.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.github.emlagowski.springbootwithmodules"})
public class SpringBootWithModulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithModulesApplication.class, args);
	}

}
