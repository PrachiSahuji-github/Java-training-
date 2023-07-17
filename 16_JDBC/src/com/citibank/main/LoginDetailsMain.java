
package com.citibank.main;

import java.util.Scanner;

import com.citibank.repository.LoginDetailsRepository;



public class LoginDetailsMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		LoginDetailsRepository loginDetailsRepository = new LoginDetailsRepository();
		//Employee employee = null;
		String loginId;
		String password;
		String continueChoice;
		
		do {
			
		
		System.out.println("Enter Login ID");
		loginId = scanner.next();
		//scanner.nextLine();
		System.out.println("Enter password");
		password = scanner.next();
		
		String result = loginDetailsRepository.loginDetailsValidate(loginId, password);
		if (result != null) {
			if (result.equals("max")) {
				System.out.println("Max attempt reached");
				System.out.println("Exiting!");
				System.exit(0);
			}
			else {
				System.out.println("Validation completed!");
				System.out.println("Hello " + result);
			}
		} 
		else {
			   System.out.println("Invalid login_id or password!");
		}
		System.out.println("Do you want to try again?");
		continueChoice = scanner.next();
		}
		while (continueChoice.equalsIgnoreCase("Yes"));
		       System.out.println("Thank you!!");
		
	
	}

}
