package com.upskill.java_5;

public abstract class AbstructClass {

	//Abstract class has both abstract method and regular method
	
	//Abstract Method
	
	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract String iEngine();
	
	public abstract void iSeat(String abc);
	
	//Non-Abstract or regular Method
	
	public void brand(){
		String brand = "BMW";
	}
	
	public String color(){
		String colors = "Black";
		return colors;
	}


}
