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
		
		while(true) {
		int returnValue = JOptionPane.showOptionDialog(null, "Would you like to continue?", "", JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, null, null, null);
		if(returnValue == JOptionPane.YES_OPTION) {
			
		
		int selectionValue = JOptionPane.showOptionDialog(null, "Select what type of student you would like to add",
				"Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, classOptions, null);
		//JOptionPane.showMessageDialog(null, selectionValue);
	lastName = JOptionPane.showInputDialog("Enter the student's last name");
	firstName = JOptionPane.showInputDialog("Enter the student's first name");
	rent = Integer.parseInt(JOptionPane.showInputDialog("Enter the rent"));
	floorNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number"));
		if(selectionValue == 0) {
				ResidentList.add(new Athlete(rent, floorNumber, lastName, firstName));
	}
		else if(selectionValue == 1) {
			ResidentList.add(new StudentWorker(rent,floorNumber, lastName, firstName));
	}
		else if(selectionValue == 2) {
			ResidentList.add(new ScholarshipRecipient(rent,floorNumber, lastName, firstName));
	}
		}
		
		//End of code for "yes option"
		
		//Exit logic
		else if(returnValue == JOptionPane.NO_OPTION) {
			for(int i = 0; i < ResidentList.size(); i++) {
				System.out.println(ResidentList.toArray()[i].toString());
			}
			JOptionPane.showMessageDialog(null, "Goodbye");
			
			System.exit(0);
		}
	}
		}
		
	}

	

