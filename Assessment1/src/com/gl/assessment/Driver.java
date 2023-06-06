package com.gl.assessment;

import java.util.Scanner;

public class Driver {

	static String fname;

	static String lname;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the first name");
		fname = sc.nextLine();
		System.out.println("Enter the last name");
		lname = sc.nextLine();

		CredentialService cs = new CredentialService(fname, lname);

		String fullName = cs.displayName();

		System.out.println("Name of the Employee is " + fullName);

		cs.showCredential();

	}

}
