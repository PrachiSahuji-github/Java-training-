package com.citibank.main;

import java.util.Arrays;

import com.citibank.domain.Employe;
import com.citibank.domain.Person;

interface Condition {
	boolean test(Person person);
}

public class PersonMain {
	public static void displayAllPerson(Person [] persons, Condition condition) {
		for (Person person : persons) {
			if (condition.test(person))
				System.out.println(person);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Vivek", "Gohil", 33);
		Person person1 = new Person("Gurubux", "Gill", 26);
		Person person2 = new Person("Samarth", "Patil", 12);
		Person person3 = new Person("Trupti", "Acharekar", 38);
		
		Person [] persons = {person, person1, person2, person3};
		
		//1. sort array by last name
		Arrays.sort(persons);
		//2. create method that will print all the person of arrray
		Condition nocondition = (p)-> true;
		displayAllPerson(persons, nocondition);
		
		
		//3. create a method that prints all people last name begining with G
		System.out.println("Person last name starts with G");
		Condition startWith = (p) -> {
			if (p.getLastName().startsWith("G")) {
			return true;	
			}
		 return false;
		 
		};
		displayAllPerson(persons, startWith);
		
		//4. create a method tht prints all people that last name ending with 'l'
		System.out.println("Person last name ends with l");
		Condition endsWith = (p) -> {
			if (p.getLastName().endsWith("l")) {
			return true;
			
			}
		 return false;
		};
		displayAllPerson(persons, endsWith);
		
//		System.out.println("Print all details");
//		displayAllPerson(persons);
//		
//		System.out.println();
//		System.out.println("Person with last name starts with G");
//		displayLastNameG(persons);
//		
//		System.out.println();
//		System.out.println("person with last name end with l");
//		displayendwithL(persons);	
		
		
//
	}
	
	
	
//	public static void displayLastNameG(Person[] persons) {
//		
//		for (Person person : persons) {
//			if (person.getLastName().startsWith("G"))
//			System.out.println(person);
//		}
//	}
//	
//	public static void displayendwithL(Person[] persons) {
//		
//		for (Person person : persons) {
//			if (person.getLastName().endsWith("l"))
//			System.out.println(person);
//		}
//	}

}
