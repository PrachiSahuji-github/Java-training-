package com.citibank.main;

import com.citibank.domain.ProcessString;

public class ProcessStringMain {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		ProcessString uppString = (s1) -> {
			return s1.toUpperCase();
			
		};
		String result = uppString.DoProcess("hi");
		System.out.println("Uppercase of string is : " +result);
		
		ProcessString length1 = (s1) -> {
			return s1;
			
		};
		result = length1.DoProcess("LambdaExpression");
		int x = result.length();
		System.out.println("Length of string is : " +x);
		
		ProcessString len = (s1) ->  "Length is " + s1.length();
		System.out.println(len.DoProcess("java training is over"));
		
		ProcessString repeat = (s1) -> {
			return s1.repeat(4);
			
		};
		result = repeat.DoProcess("Hi");
		System.out.println("Repeataion of string is : " +result);
		
		ProcessString LowString = (s1) -> {
			return s1.toLowerCase();
			
		};
		
		result = LowString.DoProcess("HELLOW");
		System.out.println("Lowercase of string is : " +result);
		
		
	}

}
