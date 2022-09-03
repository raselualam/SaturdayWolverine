package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";			//write & read
	private int ssn = 45358475;					//write only
	private String username = "raselalam";		//read only
	
	//Setter Method - name
	public void setName(String value){             //set the data
		name = value;
	}
	
	//Getter Method - name		 					//get the data
	public String getName(){
		return name;
	}	
	
	//Setter Method - ssn
	public void setSSN(int value){             		//set the data
		ssn = value;
	}
	
	//Getter Method - username		 				//get the data
	public String getUserName(){
		return username;
	}

	public static void main(String[] args) {	
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		obj.getName();
		obj.setSSN(8546745);
		obj.getUserName();
		System.out.println(obj.getUserName());
	}
}

