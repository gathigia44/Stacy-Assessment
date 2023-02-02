package com.assessment.numbers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.numbers.models.PhoneNumber;

@Repository("phonenumberRepository")
public interface PhoneNumberRepository extends JpaRepository <PhoneNumber, Integer>{
	
	
}
