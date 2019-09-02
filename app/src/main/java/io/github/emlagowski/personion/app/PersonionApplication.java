package io.github.emlagowski.personion.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.github.emlagowski.personion"})
public class PersonionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonionApplication.class, args);
	}

}
