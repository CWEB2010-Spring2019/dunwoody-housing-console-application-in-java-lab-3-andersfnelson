package com.dunwoody;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Housing {

	
	public static void main(String[] args) {
		String lastName;
		String firstName;
		int rent;
		int floorNumber;
		String[] classOptions = {"Athlete", "Student Worker", "Scholarship Recipient"};
		ArrayList<Resident> ResidentList = new ArrayList<Resident>();
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to the Dunwoody housing application");
		//what does this return?  need to incorporate
		int returnValue = JOptionPane.showOptionDialog(null, "Would you like to continue?", "", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, null, null, null);
		if(returnValue == JOptionPane.YES_OPTION) {
			
		
		JOptionPane.showOptionDialog(null, "Select what type of student you would like to add",
				"Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, null);
	lastName = JOptionPane.showInputDialog("Enter the student's last name");
	firstName = JOptionPane.showInputDialog("Enter the student's first name");
	rent = Integer.parseInt(JOptionPane.showInputDialog("Enter the rent"));
	floorNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number"));
	ResidentList.add(new Athlete(rent, floorNumber, lastName, firstName));
		}
		else if(returnValue == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Goodbye");
		}
	
	}
}
