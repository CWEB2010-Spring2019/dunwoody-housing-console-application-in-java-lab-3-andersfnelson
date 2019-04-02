/**
 * 
 */
package com.dunwoody;
import java.util.Random;
/**
 * @author andersnelson
 *
 */
public class Athlete extends Resident {

	/**
	 * @param monthlyRent
	 * @param floorNumber
	 * @param lastName
	 * @param firstName
	 */
	public Athlete(int monthlyRent, int floorNumber, String lastName, String firstName)
	{
		super(monthlyRent, floorNumber, lastName, firstName);
		Random rand = new Random();
		this.monthlyRent = 1200;
		this.idNumber = rand.nextInt(999999);	
	}
	
	public String toString() {
		return String.format("Athlete "+"First Name: "+firstName+" Last Name: "+lastName+" Monthly Rent: "+monthlyRent+ " Floor Number: "+floorNumber+" ID: "+idNumber);  
	}
	
		// TODO Auto-generated constructor stub
	}


