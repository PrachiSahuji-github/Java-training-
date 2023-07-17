package com.citi.domain;

public  class EmailMessage implements Message{

	@Override
	public void sendMessage(String Toname, String Message) {
		// TODO Auto-generated method stub
		System.out.println(" Email Message");
		
		System.out.println("To : " +Toname);
		System.out.println("Messege : " + Message);
	}

}
