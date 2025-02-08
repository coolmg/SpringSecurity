package com.mrcool.spring_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@EnableMethodSecurity(jsr250Enabled = true,securedEnabled = true)
//@EntityScan("com.mrcool.spring_security.model")
//@EnableJpaRepositories("com.mrcool.spring_security.repository")
public class MrCoolSoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrCoolSoftApplication.class, args);
	}

}
