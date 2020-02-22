package com.cts.swmd.service;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Service;

import com.cts.swmd.exceptions.InvalidVisitorException;
import com.cts.swmd.model.Visitor;
@Service
public class VisitorServiceImpl implements VisitorService {

	@Override
	public Visitor computeAge(Visitor visitor) {
		if(visitor!=null) {
			LocalDate today=LocalDate.now();
			int age=Period.between(visitor.getDateOfBirth(),today).getYears();
			visitor.setAge(age);
		}
		return visitor;
	}
	@Override
	public boolean isValid(Visitor visitor) throws InvalidVisitorException{
		boolean isOK=true;
		if(LocalDate.now().isBefore(visitor.getDateOfBirth())) {
			isOK=false;
			throw new InvalidVisitorException("You cannot enter the future year");
		}
	
	return isOK;

}
}