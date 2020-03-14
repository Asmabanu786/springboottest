package com.cts.ls.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.ls.beans.SignupDetails;

@Service
public class SignupService {


	public SignupDetails getDetails() {
		return new SignupDetails(111,"Nayan","Vicky","NV","nayan123","nayan@gmail.com","9000000000");
	}

	public List<Object> getAllDetails() {
//		The URL to hit for the second micro-service
		String urlToHit = "http://localhost:8086/login/all";
		
//		Call the other micro service to fetch data of all books
		return  Arrays.asList(new RestTemplate().getForObject(urlToHit, Object[].class));
	}

}




	

