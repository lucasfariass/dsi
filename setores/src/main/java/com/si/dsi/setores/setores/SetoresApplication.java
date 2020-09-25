package com.si.dsi.setores.setores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SetoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetoresApplication.class, args);
	}

}
