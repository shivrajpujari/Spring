package com.bridgIt.springPrax.annotations1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	@Autowired
	A a;
	public void method1() {
		a.method1();
		System.out.println("method of class B ");
	}
}
