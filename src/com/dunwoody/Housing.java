package com.dunwoody;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Housing {

	
	public static void main(String[] args) {
		String lastName;
		String firstName;
		int rent;
		int floorNumber;
		ArrayList<Resident> ResidentList = new ArrayList<Resident>();
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to the Dunwoody housing application");
	lastName = JOptionPane.showInputDialog("Enter the student's last name");
	firstName = JOptionPane.showInputDialog("Enter the student's first name");
	rent = Integer.parseInt(JOptionPane.showInputDialog("Enter the rent"));
	floorNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number"));
	ResidentList.add(new Athlete(rent, floorNumber, lastName, firstName));
	
	}
	

}
