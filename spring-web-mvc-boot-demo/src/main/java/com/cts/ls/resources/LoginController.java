package com.cts.ls.resources;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ls.beans.User;


@RestController
@RequestMapping("/login")

public class LoginController {
	
	@RequestMapping("/all")
	List<User> getAllDetails() {
		return Arrays.asList(
				new User(111,"Nayan","Vicky","NV","nayan123","nayan@gmail.com","9000000000"),
				new User(112,"Anushka","Shetty","Anu","anuanu","anushka@gmail.com","9000011882"),
				new User(113,"Aditya","Roy","Adi","adiroy","adiroy@gmail.com","8123456709"),
				new User(114,"Shradha","Kapoor","SK","shradhoor","shradha@gmail.com","9876543210"),
				new User(115,"Arijith","Singh","arijith","arjuarji123","arjith@gmail.com","9989876540")
				
				);
	}
	
}









	