package com.citibank.main;

import com.citibank.domain.MyClass;

public class MyClassMain {
	public static void main(String[] args)   {
		MyClass myclass = new MyClass();
		myclass.display();
		
		System.out.println();
		MyClass myclass1 = new MyClass();
		myclass1.display();
		
		System.out.println(MyClass.number2);
		System.out.println(myclass.number2);
		System.out.println(myclass1.number2);
		
		
	}
}
