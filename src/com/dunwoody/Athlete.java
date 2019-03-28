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
		
		this.idNumber = rand.nextInt(999999);	
	}
	
	
	
		// TODO Auto-generated constructor stub
	}


