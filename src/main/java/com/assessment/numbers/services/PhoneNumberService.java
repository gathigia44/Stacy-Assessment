package com.assessment.numbers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.numbers.models.PhoneNumber;
import com.assessment.numbers.repository.PhoneNumberRepository;

@Service
public class PhoneNumberService {
	
	@Autowired
	private PhoneNumberRepository phonenumberRepository;
	
	public List<PhoneNumber> findAll() {
		return phonenumberRepository.findAll();
	}
	
	
	public void updateData(List<PhoneNumber> phoneNumbers) {
		  for (PhoneNumber phoneNumber : phoneNumbers) {
		    String phone = phoneNumber.getPhone();
            if (phone.matches("\\(237\\) ?[2368]\\d{7,8}$") && phone.startsWith("(237)")) {
                phoneNumber.setCountry("Cameroon");
                phoneNumber.setCountryCode("+237");
                phoneNumber.setState("Valid");
            } else if (phone.matches("\\(251\\) ?[1-59]\\d{8}$") && phone.startsWith("(251)")) {
                phoneNumber.setCountry("Ethiopia");
                phoneNumber.setCountryCode("+251");
                phoneNumber.setState("Valid");
            } else if (phone.matches("\\(212\\) ?[5-9]\\d{8}$") && phone.startsWith("(212)")) {
                phoneNumber.setCountry("Morocco");
                phoneNumber.setCountryCode("+212");
                phoneNumber.setState("Valid");
            } else if (phone.matches("\\(258\\) ?[28]\\d{7,8}$") && phone.startsWith("(258)")) {
                phoneNumber.setCountry("Mozambique");
                phoneNumber.setCountryCode("+258");
                phoneNumber.setState("Valid");
            } else if (phone.matches("\\(256\\) ?\\d{9}$") && phone.startsWith("(256)")) {
                phoneNumber.setCountry("Uganda");
                phoneNumber.setCountryCode("+256");
                phoneNumber.setState("Valid");
            } else if (phone.matches("\\(237\\) ?[2368]\\d{7,8}$") || phone.startsWith("(237)")) {
                phoneNumber.setCountry("Cameroon");
                phoneNumber.setCountryCode("+237");
                phoneNumber.setState("Not valid");
            } else if (phone.matches("\\(251\\) ?[1-59]\\d{8}$") || phone.startsWith("(251)")) {
                phoneNumber.setCountry("Ethiopia");
                phoneNumber.setCountryCode("+251");
                phoneNumber.setState("Not valid");
            } else if (phone.matches("\\(212\\) ?[5-9]\\d{8}$") || phone.startsWith("(212)")) {
                phoneNumber.setCountry("Morocco");
                phoneNumber.setCountryCode("+212");
                phoneNumber.setState("Not valid");
            } else if (phone.matches("\\(258\\) ?[28]\\d{7,8}$") || phone.startsWith("(258)")) {
                phoneNumber.setCountry("Mozambique");
                phoneNumber.setCountryCode("+258");
                phoneNumber.setState("Not valid");
            } else if (phone.matches("\\(256\\) ?\\d{9}$") || phone.startsWith("(256)")) {
                phoneNumber.setCountry("Uganda");
                phoneNumber.setCountryCode("+256");
                phoneNumber.setState("Not valid");
            } 
            
           
            phonenumberRepository.save(phoneNumber);
        
    }

	}
}
