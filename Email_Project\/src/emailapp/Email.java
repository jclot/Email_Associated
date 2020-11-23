package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstname;
	private String lastname; 
	private String password;
	

	private String department;
	private int defaultPasswordLength = 10;
	
	
	private int mailboxCapacity = 500;
	private String alternateEmail;	
	private String email;
	private String companySuffix = "clotIA.com";
	
	
	// Constructor to receive the first and last name (Email)
	
	public Email(String firstname, String lastname) {
		
			this.firstname = firstname;
			this.lastname = lastname;
		
			
			// Call a method for the department
			
			this.department = setDepartment();
			
			// Call a method that return a random password generated
			
			this.password = randomPassword(defaultPasswordLength);
			System.out.println("Your password is: " + this.password);
			
			// Combine elements to generate a email
			
			email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
			
	}
	
	//Create a method and ask the department
	
	private String setDepartment() {
		
		
			System.out.print("New worker: " + firstname + ". Deparment Code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
			Scanner in = new Scanner(System.in);
			int depChoice = in.nextInt();
			
			
			
			if (depChoice == 1) {
				
					return "sales";
					
			} else if (depChoice == 2) {
				
					return "dev";
				
			} else if (depChoice == 3) {
				
					return "acct";
				
			} else {
				
					return "";				
			}
		
	}
	
	// Generate a random password
	
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNNOPQRSTUWXYZ0123456789";
		char[] password = new char[length];
		
		for (int i=0; i<length; i++) {
			
				int rand = (int) (Math.random() * passwordSet.length());
				
				password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
			
	}
	
	// Set the mailbox capacity
	public void setMailbBoxCapacity(int capacity) {
		
		this.mailboxCapacity = capacity;
		
	}
	
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		
		this.alternateEmail = altEmail;
		
	}
	
	
	// Change the password
	public void changePassword(String password) {
		
		this.password = password;	
		
	}
	
	
	
	// get the mailboxcapacity (int)
	
	public int getMailBoxCapacity() {
		
		return mailboxCapacity;
	
	}
	
	// get the alternateEmail (String)
	 
	public String getAlernateEmail() {
		
		return alternateEmail;
		
	}
	
	// get the password (int)
	
	public String getPassword() {
		
		return password;
		
	}
	
	// Display all the info
	
	public String showInfo() {
		
		return "\nDISPLAY NAME: " + firstname + " " + lastname +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "ab";
			
	}

}
