package com.upskill.java_5;

public class AbstrctClassImplementation extends AbstructClass {

	@Override
	public void iDoor() {
		int door = 4;
	}

	@Override
	public int iWheel() {
		return 4;
	}

	@Override
	public String iEngine() {
		return "50hp";
	}

	@Override
	public void iSeat(String abc) {
		int seat = 5;
	}
	
/*
	(Parent)				(Keyword) 				(Child)
	Class					extends					 Class
	Abstract Class			extends					 Class
	Interface				implements		  		 Class
	Interface				extends					 Interface
	
*/

}
