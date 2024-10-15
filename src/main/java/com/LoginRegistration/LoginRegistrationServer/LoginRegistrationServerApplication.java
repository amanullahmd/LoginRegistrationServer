package com.LoginRegistration.LoginRegistrationServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * LoginRegistrationServerApplication is the entry point of the Spring Boot application.
 * This class contains the main method which bootstraps the application.
 */
@SpringBootApplication // Enables auto-configuration and component scanning for the application
public class LoginRegistrationServerApplication {

	/**
	 * The main method to run the Spring Boot application.
	 *
	 * @param args Command-line arguments (not used in this application).
	 */
	public static void main(String[] args) {
		SpringApplication.run(LoginRegistrationServerApplication.class, args); // Starts the application
	}
}
