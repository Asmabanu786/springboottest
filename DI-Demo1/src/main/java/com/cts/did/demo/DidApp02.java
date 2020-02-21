package com.cts.did.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cts.did.service.GreetService;
import com.cts.did.service.GreetServiceEnhancedImpl;

public class DidApp02 {
	public static void main(String[]args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("beanscopy.xml");
	GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl) context.getBean("g2");
	gs2.setGreeting("Assalamu Alaikum");
	System.out.println(gs2.greet("India"));
    GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl) context.getBean("g2");
    System.out.println(gs3.greet("India"));
    GreetService gs=(GreetService)context.getBean("g3");
    System.out.println(gs.greet("India"));
	}
}