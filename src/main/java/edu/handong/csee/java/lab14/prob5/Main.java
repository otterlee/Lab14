package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the message");
		try {
		String message = keyboard.next();
		Main.myTest(message);
		} catch(MyException e) {
			System.out.println("Inside catch block: " + e); 
		}
	}
	
	public static void myTest(String message) throws MyException {
		if(message.equals("null")) throw new MyException("String val is null");
		else System.out.println("String val is: " + message);
	}
}
