package com.upskill.java_1;

public class Variables {
	
//	Variables in Java
	
	public String country = "USA";				//Instance OR global variable - Variables declared in Class level, outside method
	
	public static String region = "America";	//Static variable - variables belong to class and don't required creating object

	public static void main(String[] args) {
		
		String city = "NewYork"; 				//Local variable - variables declared in methods 
	}
	
	public void method (String county){			//Method parameter - variables used as method parameter
		
		String myCounty = county;
	}
	
	//Test git - new change 
	//This is SAKIB THE BOSS
}
