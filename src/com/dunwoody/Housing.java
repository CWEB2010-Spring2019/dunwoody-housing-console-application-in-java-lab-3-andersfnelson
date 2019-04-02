package com.dunwoody;
import javax.swing.JOptionPane;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Map;

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
	
	//Logic for student worker option
	if(selectionValue == 1) {
		rent = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked"));
	}
	else {
		rent = Integer.parseInt(JOptionPane.showInputDialog("Enter the rent"));
	}
	if(selectionValue == 0) {
		floorNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number", "Athletes reside on floors 4-6"));
	}
	else if(selectionValue == 1) {
		floorNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number", "Student workers reside on floors 1-3"));
	}
	else {
		floorNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the floor number", "Scholarship recipients reside on floors 7-8"));
	}
	try {
		if(selectionValue == 0) {
			if(rent != 1200) {
				JOptionPane.showMessageDialog(null, "Rent was automatically corrected to $1200");
			}
				ResidentList.add(new Athlete(rent, floorNumber, lastName, firstName));
	}
		else if(selectionValue == 1) {
			ResidentList.add(new StudentWorker(rent,floorNumber, lastName, firstName));
	}
		else if(selectionValue == 2) {
			if(rent != 100) {
				JOptionPane.showMessageDialog(null, "Rent was automatically corrected to $100");
			}
			ResidentList.add(new ScholarshipRecipient(rent,floorNumber, lastName, firstName));
	}
		}
	
	//Doesn't seem to get to the catch block
	catch(Exception e){
		JOptionPane.showMessageDialog(null, "Something went wrong. All fields may not have been entered correctly.");
	}
	}
		
		//End of code for "yes option"
		
		//Exit logic
		else if(returnValue == JOptionPane.NO_OPTION) {
			for(int i = 0; i < ResidentList.size(); i++) {
				System.out.println(ResidentList.toArray()[i].toString());
			}
			//How to group residents
			JOptionPane.showMessageDialog(null, "Goodbye");
			
			System.exit(0);
		}
	}
		}
		
	}

	

