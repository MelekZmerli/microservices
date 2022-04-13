package tn.micros.Chef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class ChefApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChefApplication.class, args);
	}

}
