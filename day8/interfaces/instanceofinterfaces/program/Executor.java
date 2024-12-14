//Program to demonstrate interface instance using factory method
package com.tns.ifet.day8.interfaces.instanceofinterfaces.program;

public class Executor {
	public static void main(String args[]) {
		
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		
	}
}
