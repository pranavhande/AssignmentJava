package assignment26Sep;

import java.util.Scanner;

public class AccessControl {
	
	private boolean validId,validCard;
	private boolean admin;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter id,card or admin");
		validId = sc.nextBoolean();
		validCard = sc.nextBoolean();
		admin = sc.nextBoolean();
	}
	
	public void checkAccess() {
		if((validId && validCard) ||(admin)) {
			System.out.println("Access ");
		}
		else {
			System.out.println("Access Denied");
		}
	}

	
	public void display() {
		System.out.println("Valid Id : "+validId);
		System.out.println("Valid Card : "+validCard);
		System.out.println("Admin : "+admin);
	}

}
