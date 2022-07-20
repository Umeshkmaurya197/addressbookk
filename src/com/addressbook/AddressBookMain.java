package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	Contact contact = new Contact() ;
	Scanner scanner = new Scanner(System.in);

	public AddressBookMain() {
		super();
	}
	
	public void addContact(String firstName, String lastName, String address, String city, String state, int zip,
			long phoneNumber, String email) {
		contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
	}
	public void editContact(String firstName,String lastName) {
		System.out.println("\n ----- Edit Contact ------");
		System.out.print(" To Edit Contact press y else n : ");
		char ans = scanner.next().charAt(0);
		
		switch(ans) {
		case 'y' :	if(contact.getFirstName() == firstName & contact.getLastName() == lastName)
					{
						System.out.print("Current  Contact Name : "+contact.getFirstName()+" "+contact.getLastName());
			
						System.out.print("\n Edit first name : ");
						 firstName = scanner.next();
						 
						System.out.print(" Edit last name : ");
						 lastName = scanner.next();
				
						System.out.print(" Edit address : ");
						String address = scanner.next();
				
						System.out.print(" Edit  city : ");
						String city = scanner.next();
				
						System.out.print(" Edit state : ");
						String state = scanner.next();
				
						System.out.print(" Edit zip : ");
						int zip = scanner.nextInt();
				
						System.out.print(" Edit phone number : ");
						long phoneNumber = scanner.nextLong();
				
						System.out.print(" Edit email : ");
						String email = scanner.next();
				
						contact.setFirstName(firstName);
						contact.setLastName(lastName);
						contact.setAddress(address);
						contact.setCity(city);
						contact.setState(state);
						contact.setZip(zip);
						contact.setPhoneNumber(phoneNumber);
						contact.setEmail(email);
							
						System.out.println("\nSuccessfully Updated !");
					}
					break;
		case 'n' : 	
					System.out.println(" Thanks for your input ");
					break;
		default:
					System.out.println(" Wrong Input ");
					break;				
		}
	}
	
	public void displayContact() {
		System.out.println("\n ----- Display Contact ------");
		System.out.println(" First Name : "+contact.getFirstName());
		System.out.println(" Last Name  : "+contact.getLastName());
		System.out.println(" Address    : "+contact.getAddress());
		System.out.println(" City       : "+contact.getCity());
		System.out.println(" State      : "+contact.getState());
		System.out.println(" Zip        : "+contact.getZip());
		System.out.println(" PhoneNumber: "+contact.getPhoneNumber());
		System.out.println(" email      : "+contact.getEmail());
	}
	
	public static void main(String[] args) {
		System.out.println("------- Welcome to Address Book Program -------- ");

	
		AddressBookMain addressBookMain = new AddressBookMain();
		addressBookMain.addContact("Omi","Maurya","CCT","Lucknow","UttarPradersh",271201,87234323,"Omi31@gmail.com");
		addressBookMain.displayContact();
		addressBookMain.editContact("Omi","Maurya");
		addressBookMain.displayContact();
	}
}