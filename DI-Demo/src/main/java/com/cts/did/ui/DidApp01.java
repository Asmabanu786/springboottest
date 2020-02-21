package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiceSimpleImpl;
public class DidApp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans1.xml");
		GreetService gs=(GreetService) context.getBean("g1");
		System.out.println(gs.greet("Sanu"));

	}

}
