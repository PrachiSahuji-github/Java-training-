package com.citibank.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. ArrayList");
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(23);
		//Integer i = Integer.valueOf(45);
		//numbersList.add(i);
		numbersList.add(43);
		numbersList.add(32);
		numbersList.add(23);
		numbersList.add(33);
		numbersList.add(53);
		numbersList.add(21);
		
		System.out.println(numbersList);
		
		numbersList.addAll(numbersList);
		
		System.out.println(numbersList);
		
		System.out.println(numbersList.size());
		System.out.println(numbersList.indexOf(43));
		
		for (Integer integer : numbersList) {
			System.out.println(integer);
		}
		
		numbersList.remove(Integer.valueOf(43));
		System.out.println(numbersList);
		
		
		System.out.println("2. HashSet");
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Prachi");
		nameSet.add("Payal");
		nameSet.add("Varsha");
		nameSet.add("Rohit");
		nameSet.add("Anubhav");
		nameSet.add("Rupesh");
		nameSet.add("Prachi");
		
		System.out.println(nameSet);
		System.out.println(nameSet.size());
		System.out.println(nameSet.contains("Varsha"));
		System.out.println(nameSet.hashCode());
		
		System.out.println("3. TreeSet");
		//Set<String> sortedNameSet = new TreeSet<String>();
		TreeSet<String> sortedNameSet = new TreeSet<String>();
		sortedNameSet.add("Prachi");
		sortedNameSet.add("Payal");
		sortedNameSet.add("Varsha");
		sortedNameSet.add("Abhinav");
		sortedNameSet.add("Rohit");
		sortedNameSet.add("Rupesh");
		sortedNameSet.add("Bala");
		sortedNameSet.add("Prachi");			
		
		System.out.println(sortedNameSet);
		System.out.println(sortedNameSet.descendingSet());
		
		System.out.println("4. HashMap");
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "Prachi");
		hashMap.put(102, "Abhi");
		hashMap.put(102, "Vivek");
		hashMap.put(104, "Pooja");
		hashMap.put(103, "Tejal");
		hashMap.put(106, "Prachi");
		System.out.println(hashMap);
		System.out.println(hashMap.get(102));
		
		Set<Integer> keys = hashMap.keySet();
		System.out.println(keys);
		System.out.println(hashMap.values());
		
		
		
		
	}

}
