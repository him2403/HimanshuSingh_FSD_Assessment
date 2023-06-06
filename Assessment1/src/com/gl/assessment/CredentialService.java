package com.gl.assessment;

import java.util.Random;

public class CredentialService extends Employee {

	CredentialService(String a, String b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	Department d = new Department();
	String de = d.selectDept();

	String emailid() {

		String email = getFirstName() + getLastName() + "@" + de + ".gl.com";
		String emailid = email.toLowerCase();

		return emailid;
	}

	String generatePassword() {

		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String number = "01234567890";
		String symbol = "!@#$%*_.";

		String pass = capital + small + number + symbol;

		Random random = new Random();

		String password = "";

		for (int i = 0; i < 8; i++) {

			password += pass.charAt(random.nextInt(pass.length()));

		}

		return password;

	}

	void showCredential() {

		System.out.println("Dear " + getFirstName() + " " + getLastName() + " your generated credentials are as follows");
		System.out.println("Email ---> " + emailid());
		System.out.println("Password ---> " + generatePassword());
	}

}
