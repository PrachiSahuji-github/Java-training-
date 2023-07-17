package com.citi.main;

import com.citi.domain.ApplicationV2;
import com.citi.domain.Employee;

public class MainApplicationV2 {
	public static void main(String[] args) {
		String [] cars = new String [5];
		cars[0] = "Tata Nexon";
		cars[1] = "Breeza" ;
		cars[2] = "Creta" ;
		cars[3] = "Omni";
		cars[4] = "Scorpio";
		ApplicationV2 applicationV2 = new ApplicationV2(cars);
		applicationV2.process();
		applicationV2.display();		
	}
		
}
		


