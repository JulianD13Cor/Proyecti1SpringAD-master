package com.example.Proyecti1SpringAD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Proyecti1SpringAdApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyecti1SpringAdApplication.class, args);
	}

}
