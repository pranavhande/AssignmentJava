package assignment26Sep;

import java.util.Scanner;

public class Student {
	
	private int s1,s2,s3;
	private double avg;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter s1,s2,s3");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
	}
	
	public void checkAvg() {
		avg = (s1+s2+s3)/3;
	}
	
	public void checkScore() {
		if(avg>=60 && s1>40 && s2>40 && s3>40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public void display() {
		System.out.println("S1 : "+s1);
		System.out.println("S2 : "+s2);
		System.out.println("S3 : "+s3);
		System.out.println("Average : " + avg);
	}

}
