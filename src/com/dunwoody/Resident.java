package com.dunwoody;
import java.util.Random;

public abstract class Resident {
	public Random rand = new Random();
public int monthlyRent;
public int floorNumber;
public String lastName;
public String firstName;
public int idNumber;

public Resident(int monthlyRent, int floorNumber, String lastName, String firstName
		) {
	this.monthlyRent = monthlyRent;
	this.floorNumber = floorNumber;
	this.lastName = lastName;
	this.firstName = firstName;
	this.idNumber = rand.nextInt(999999);

}


}