package com.citi.main;

import java.util.Scanner;

import com.citi.domain.Application;
import com.citi.domain.EmailMessage;
import com.citi.domain.Message;
import com.citi.domain.SMSMessage;
import com.citi.domain.WhatsappMessage;



public class ApplicationMain {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String name;
		String msg;
		Message message = null;
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1.SMS Message");
		System.out.println("2.Email Message");
		System.out.println("2.Whatsapp Message");
		
		System.out.println("Enter your choice");
		choice = scanner.nextInt();
		
		
		
		switch (choice) {
		case 1:
			System.out.println("SMS Message selected");
			message = new SMSMessage();
			break; 
			
		case 2:
            System.out.println("Email Message selected");
			message = new EmailMessage();
			break;	
		case 3:
            System.out.println("Whastsapp Message selected");
			message = new WhatsappMessage();
			break;	
		default:
			System.out.println("Invalid choice");
		
			}
		System.out.println("Enter To Name");
		name = scanner.next();
		scanner.nextLine();
		System.out.println();
		
		System.out.println("Enter Message");
		msg = scanner.nextLine();
		
		Application application = new Application(message);
		application.processMessage(name, msg);
	}

}
