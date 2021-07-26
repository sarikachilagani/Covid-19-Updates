package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"/controller"})
@ComponentScan("com.springboot.app")
@EntityScan({"com.springboot.app.model"})
@EnableJpaRepositories({"com.springboot.app.repo"})
public class CovidupdatesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidupdatesApplication.class, args);
	}

}
