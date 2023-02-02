package com.assessment.numbers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ValidatingNumbersApplication implements CommandLineRunner {
	

	public static void main(String[] args) {
		SpringApplication.run(ValidatingNumbersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Phone();
	}
	
	/*private void Phone() {
		for (PhoneNumber phonenumber : phonenumberService.findAll()){
		System.out.println("id: "+ phonenumber.getId());
		System.out.println("name: "+ phonenumber.getName());
		System.out.println("phone: "+ phonenumber.getPhone());
		System.out.println("country: "+ phonenumber.getCountry());
		System.out.println("countryCode: "+ phonenumber.getCountryCode());
		System.out.println("state: "+ phonenumber.getState());*/

		//}
	}


