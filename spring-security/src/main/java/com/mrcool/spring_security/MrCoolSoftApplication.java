package com.mrcool.spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableWebSecurity
//@EntityScan("com.mrcool.spring_security.model")
//@EnableJpaRepositories("com.mrcool.spring_security.repository")
public class MrCoolSoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrCoolSoftApplication.class, args);
	}

}
