package assignment26Sep;

import java.util.Scanner;

public class Voting {
	
	private int age;
	private boolean citizen;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter age,citizen");
		age = sc.nextInt();
		citizen = sc.nextBoolean();
	}
	
	public void checkCitizen() {
		if(citizen) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible");
		}
	}
	
	public void checkAge() {
		if(age>=18) {
			System.out.println("Can vote");
		}
		else {
			System.out.println("Cannot Vote");
		}
	}

	
	public void display() {
		System.out.println("Age : "+age);
		System.out.println("Citizen :" + citizen);
	}

}
