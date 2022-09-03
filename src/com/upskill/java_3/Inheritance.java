package com.upskill.java_3;

import com.upskill.java_2.MethodType;

/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
-	Single Inheritance
-	Multiple Inheritance	(Java doesn't support Multiple Inheritance directly rather through Interfaces)
-	Multilevel Inheritance

*/

public class Inheritance extends MethodType{

	public static void main(String[] args) {
		Inheritance myObj = new Inheritance();
		myObj.annualIncomeVoid();
		myObj.weeklyIncomeStatic();
	}

}
