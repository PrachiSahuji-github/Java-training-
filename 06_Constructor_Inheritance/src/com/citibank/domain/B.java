package com.citibank.domain;

public class B extends A {
	public B() {
		// TODO Auto-generated constructor stub
		super();
		
		System.out.println("Default constructor of B");
	}
	public B(int x) {
		super(x);
		System.out.println("Parameterized Constroctor of B");
		System.out.println("X = " + x);
	}

}
