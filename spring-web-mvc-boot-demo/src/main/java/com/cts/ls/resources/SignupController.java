package com.cts.ls.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.ls.beans.SignupDetails;
import com.cts.ls.service.SignupService;


@RestController
@RequestMapping("/signup")

public class SignupController {
		
		@Autowired
		SignupService service;

		@RequestMapping("/id")
		SignupDetails getDetails() {
			return service.getDetails();
		}
		
		@RequestMapping("/all")
		List<Object> getAllDetails() {
				return service.getAllDetails();
		}
		
		
		
		
	}



