package com.config.springserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServerConfigApplication.class, args);
	}

}
