package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset {
	
	public static void main(String[] args) {
		
		// Array store multipul data using index

		int age = 34;											// Variable
		
		int[] ageWolverine = new int[]{24, 28, 30, 35, 29, 40};	// Array
		
		//Array Index			       [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageWolverine[3]);
		System.out.println("Total Student : " + ageWolverine.length);
		
		String[] nameWolverine = new String[]{"Ansarul", "Liaqath", "Sheakh", "Omar", "Rusthi", "Adnan"};
		System.out.println("Student Name : " + nameWolverine[2]);
		
		//Multi-dimentional Array
		
		int[][] ageWolverine2D = { 	{24, 28, 30, 35, 29, 40}, // [0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
									{35, 22, 27}};			  // [1][0] [1][1] [1][2]
		
		System.out.println("Student Age 2D: " + ageWolverine2D[0][3]);
		
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ansarul", 28);
		Student.put("Omar", 25);
		Student.put("Rusdi", 27);
		Student.put("Sheikh", 30);
		Student.put("Liquath", 35);
		
		System.out.println("Student Age : " + Student.get("Omar"));		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " + Capital.get("USA"));	
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>(); 
		
		car.add("BMW");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		
		//HashTable store multipul data using key-value pair, but is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "North America");
		
		System.out.println("Region : " + Region.get("USA"));	
	}
}
