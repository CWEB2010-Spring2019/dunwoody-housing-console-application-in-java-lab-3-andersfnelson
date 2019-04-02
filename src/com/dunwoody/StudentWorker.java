package com.dunwoody;

import java.util.Random;

public class StudentWorker extends Resident {
	int hoursWorked;
	public StudentWorker(int hoursWorked, int floorNumber, String lastName, String firstName)
	{
		super(floorNumber, lastName, firstName);
		Random rand = new Random();
		this.monthlyRent =(int) (1245-(0.5*(hoursWorked*14)));
		this.idNumber = rand.nextInt(999999);	
	}
	
	public String toString() {
		return String.format("Student Worker "+" First Name: "+firstName+" Last Name: "+lastName+" Monthly Rent: "+monthlyRent+ " Floor Number: "+floorNumber+" ID: "+idNumber);  
	}
}
