package com.bridgelabz.addressbookappdevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * To implement an Address Book App
 * @author - Sakshi Shetty
 * @version - 0.0.1
 * @since - 13/10/2021
 */

@EnableSwagger2
@SpringBootApplication
public class AddressBookAppDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressBookAppDevelopmentApplication.class, args);
	}
}
