package com.upskill.java_3;

/*Constructor is instance of class, method same as class name, java will execute constructor first
- 	Constructor cannot be static or override nor void or return type.
- 	Default Constructor : No constructor is initialized
- 	Parameterized Constructor : Add different signature
-	Constructor overloading : Different signature
*/

public class Constructor {
	
	String admin;
	int adAge;
	
	public Constructor(String name, int age){
		admin = name;
		adAge = age;
	}

	public static void main(String[] args) {
		
		Constructor myObj = new Constructor("Zainal", 35);
		
		System.out.println(myObj.admin);
		System.out.println(myObj.adAge);
	}
}
