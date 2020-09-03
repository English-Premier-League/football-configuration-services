package org.football.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FootballConfigurationServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballConfigurationServicesApplication.class, args);
	}

}
