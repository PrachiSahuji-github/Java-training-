package com.citibank.main;

import java.util.Arrays;
import java.util.Comparator;

import com.citibank.domain.CompareByEmployeeId;
import com.citibank.domain.Employe;

public class ComparatorComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, 5, 3, 1, 8};
		
		for (int i : numbers) {
			System.out.println(i);
		}
		//Arrays.sort(numbers);
		//System.out.println();
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		Employe emp1 = new Employe(102,"B",2000);
		Employe emp2 = new Employe(101, "A", 1000);
		Employe emp3 = new Employe(103,"C", 3000);
		
		
		Employe [] employes = {emp1, emp2, emp3};
		
		for (Employe emp : employes) {
			System.out.println(emp);
		}
		
		System.out.println();
		//Arrays.sort(employes);
		
		for (Employe emp : employes) {
			System.out.println(emp);
		}
		
		System.out.println("----------------------------------------");
		
		System.out.println("Compare employees by employeeID");
		//CompareByEmployeeId compareByEmployeeId = new CompareByEmployeeId();
		//Arrays.sort(employes, compareByEmployeeId);
		
		Comparator<Employe> byName = (e1, e2) -> e1.getName().compareTo(e2.getName());
		Arrays.sort(employes, byName);
		
		Employe emp11 = new Employe(3333,"Abhishek",90000);
		Employe emp22 = new Employe(444, "Prachi", 50000);
		Employe emp33 = new Employe(555,"Vivek", 20000);
		
		
		Employe [] employes1 = {emp11, emp22, emp33};
		
		Comparator<Employe> bySalary = (e1, e2) -> (int) (e1.getSalary() - e2.getSalary());
		Arrays.sort(employes1, bySalary);
		
		for (Employe emp : employes1) {
			System.out.println(emp);
		}
		
	}
	

}
