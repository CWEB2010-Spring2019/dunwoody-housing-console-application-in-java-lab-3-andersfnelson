package com.dunwoody;

import java.util.Random;

public class StudentWorker extends Resident {
	public StudentWorker(int monthlyRent, int floorNumber, String lastName, String firstName)
	{
		super(monthlyRent, floorNumber, lastName, firstName);
		Random rand = new Random();
		
		this.idNumber = rand.nextInt(999999);	
	}
	
	public String toString() {
		return String.format("Student Worker "+"First Name: "+firstName+"Last Name: "+lastName+"Monthly Rent: "+monthlyRent+ "Floor Number: "+floorNumber+"ID: "+idNumber);  
	}
}
