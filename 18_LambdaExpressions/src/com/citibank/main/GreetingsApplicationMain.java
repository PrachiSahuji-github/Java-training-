package com.citibank.main;

import com.citibank.domain.GoodAfternoonGreetings;
import com.citibank.domain.GoodMorningGreeting;
import com.citibank.domain.Greetings;
import com.citibank.domain.GreetingsApplication;

public class GreetingsApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
		GoodAfternoonGreetings goodAfternoonGreetings = new GoodAfternoonGreetings();
		GreetingsApplication greetingsApplication = new GreetingsApplication(goodMorningGreeting);
		GreetingsApplication application = new GreetingsApplication(goodAfternoonGreetings);
		
		greetingsApplication.doGreet();
		System.out.println();
		application.doGreet();
		
		System.out.println();
		//Greetings goodEveningGreetings = () -> {
		//	System.out.println("Good Evening");
		//};
		
		
		//Greetings goodEvenings = () -> 
		//			System.out.println("Good Evening ");
		
		
		Greetings goodEveningGreetings = () ->  System.out.println("Good Evening ");
		GreetingsApplication goodEveingGreetings = new GreetingsApplication(goodEveningGreetings);
		goodEveingGreetings.doGreet();
	}

}
