package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("g2")
public class GreetServiceAdvancedImpl implements GreetService {
	@Autowired
	@Qualifier("gnp2")
	private GreetNoteProvider gnp;
	
	public GreetNoteProvider getGnp() {
		return gnp;
	}

	public void setGnp(GreetNoteProvider gnp) {
		this.gnp = gnp;
	}

	public GreetServiceAdvancedImpl(GreetNoteProvider gnp) {
		super();
		this.gnp = gnp;
	}
	public GreetServiceAdvancedImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String greet(String userName) {
		// TODO Auto-generated method stub
		return gnp.getGreetNote()+""+userName;
	}

}
