package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("------- Welcome to Address Book Program -------- ");

		Scanner scanner = new Scanner(System.in);

		System.out.print(" Enter  first name : ");
		String firstName = scanner.next();

		System.out.print(" Enter last name : ");
		String lastName = scanner.next();

		System.out.print(" Enter address : ");
		String address = scanner.next();

		System.out.print(" Enter city : ");
		String city = scanner.next();

		System.out.print(" Enter state : ");
		String state = scanner.next();

		System.out.print(" Enter zip : ");
		int zip = scanner.nextInt();

		System.out.print(" Enter phone number : ");
		long phoneNumber = scanner.nextLong();

		System.out.print(" Enter email : ");
		String email = scanner.next();

		AddressBook addressBook = new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);
	
		System.out.println(" First Name : "+addressBook.getFirstName());
		System.out.println(" Last Name  : "+addressBook.getLastName());
		System.out.println(" Address    : "+addressBook.getAddress());
		System.out.println(" City       : "+addressBook.getCity());
		System.out.println(" State      : "+addressBook.getState());
		System.out.println(" Zip        : "+addressBook.getZip());
		System.out.println(" PhoneNumber: "+addressBook.getPhoneNumber());
		System.out.println(" email      : "+addressBook.getEmail());
	
	}

}
