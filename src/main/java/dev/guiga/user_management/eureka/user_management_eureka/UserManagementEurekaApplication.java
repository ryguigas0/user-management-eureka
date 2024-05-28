package dev.guiga.user_management.eureka.user_management_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UserManagementEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementEurekaApplication.class, args);
	}

}
