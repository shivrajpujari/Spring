package com.bridgeIt.springPrax.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	@Autowired
	B a;
	
/*	B b;
	@Autowired
	public A(B b) {
		super();
		this.b = b;
	}*/
	
	
}
