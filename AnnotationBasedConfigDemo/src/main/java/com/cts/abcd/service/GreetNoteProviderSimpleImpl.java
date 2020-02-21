package com.cts.abcd.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("gnp2")
//@Primary

public class GreetNoteProviderSimpleImpl implements GreetNoteProvider{
	public String getGreetNote() {
	return "Hola";
	}
	public GreetNoteProviderSimpleImpl() {
		super();
	}
}
