package com.gl.assessment;

import java.util.Scanner;

public class Department {

	int opt;
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	Scanner sc = new Scanner(System.in);

	String selectDept() {

		System.out.println("Please select the department");
		System.out.println("----------------------");
		System.out.println("1 - Technical");
		System.out.println("2 - Admin");
		System.out.println("3 - HR");
		System.out.println("4 - Legal");

		do {
			opt = sc.nextInt();

			switch (opt) {

			case 1:
				department = "Technical";
				break;
			case 2:
				department = "Admin";
				break;
			case 3:
				department = "HR";
				break;
			case 4:
				department = "Legal";
				break;
			default:
				System.out.println("Please enter the valid input");
			}
		} while (opt > 4);
		return department;
	}
}
