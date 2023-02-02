package com.assessment.numbers.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.numbers.models.PhoneNumber;
import com.assessment.numbers.services.PhoneNumberService;

@RestController
@RequestMapping("/numbers")
@CrossOrigin
public class PhoneNumberController {
	
	@Autowired
	private PhoneNumberService phonenumberService; 
	
	@GetMapping("/getNumbers")
	public List<PhoneNumber> findAll(){
		return phonenumberService.findAll();
		
	}
	
	
	
}
