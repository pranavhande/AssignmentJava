package assignment26Sep;

import java.util.Scanner;

public class Person {
	
	private int age;
	private double income;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter age,Income");
		age = sc.nextInt();
		income = sc.nextDouble();
	}
	
	public void checkAge() {
		if(age>18 && age<60) {
			System.out.println("valid ");
		}
		else {
			System.out.println("Invalid ");
		}
	}
	
	public void checkLoan() {
		if(income>=25000) {
			System.out.println("You can get loan");
		}
		else {
			System.out.println("Not able to get loan");
		}
	}
	
	public void display() {
		System.out.println("Age : "+age);
		System.out.println("Income : " + income);
	}


}
