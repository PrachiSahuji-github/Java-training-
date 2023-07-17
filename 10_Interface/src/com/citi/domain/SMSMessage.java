package com.citi.domain;

public class SMSMessage implements Message {

	@Override
	public void sendMessage(String Toname, String Message) {
		// TODO Auto-generated method stub
		System.out.println("SMSMessage");
		System.out.println("To : " +Toname);
		System.out.println("Messege : " + Message);
		
	}

}
