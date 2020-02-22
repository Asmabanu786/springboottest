package com.cts.swmd.service;

import com.cts.swmd.exceptions.InvalidVisitorException;
import com.cts.swmd.model.Visitor;

public interface VisitorService {
	boolean isValid(Visitor visitor) throws InvalidVisitorException;
	Visitor computeAge(Visitor visitor);

}
