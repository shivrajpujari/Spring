package com.bridgeIt.springPrax.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	@Autowired
	A a;
	
/*	A a;
	@Autowired
	public B(A a) {
		super();
		this.a = a;
	}*/
}
