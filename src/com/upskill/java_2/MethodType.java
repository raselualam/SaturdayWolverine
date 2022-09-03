package com.upskill.java_2;

public class MethodType {
	
	/* 	Types of Methods
	 
  			1.Void Method
   			2.Static Method
   			3.Return Type Method   */
	
	public static int hourlyIncome = 75;

	public static void main(String[] args) {
		MethodType myObj = new MethodType();										//Creating Class object
		myObj.annualIncomeVoid();													//calling Void method
		
		weeklyIncomeStatic();														//calling Static method
		
		System.out.println("My Monthly Income = " + myObj.monthlyIncomeReturn());	//calling Return method
	}
	
	//void Method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}

	//return type Method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public boolean myMethod(){
		return true;
	}
}
