package com.dunwoody;

import java.util.Random;

public class ScholarshipRecipient extends Resident {
	public ScholarshipRecipient(int monthlyRent, int floorNumber, String lastName, String firstName)
	{
		super(monthlyRent, floorNumber, lastName, firstName);
		Random rand = new Random();
		this.monthlyRent = 100;
		this.idNumber = rand.nextInt(999999);	
		this.ResidentType = "Scholarship Recipient";
	}
	
	public String toString() {
		return String.format("Scholarship Recipient "+"First Name: "+firstName+" Last Name: "+lastName+" Monthly Rent: "+monthlyRent+ " Floor Number: "+floorNumber+" ID: "+idNumber);  
	}
}
