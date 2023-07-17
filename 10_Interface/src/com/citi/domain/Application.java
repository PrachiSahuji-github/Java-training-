package com.citi.domain;

public class Application {
	
	private Message message;
	
	public Application (Message message) {
		this.message = message;
	}
	
	
	public void processMessage(String name , String msg) {
		message.sendMessage(name, msg);
		
	}
	

	
	
}
