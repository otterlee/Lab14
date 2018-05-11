package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
		System.out.println("Enter the message");//prompt to enter the message
		try {//use try block
		String message = keyboard.next();//take input into String message
		Main.myTest(message);//call static method myTest with parameter message
		} catch(MyException e) {//
			System.out.println("Inside catch block: " + e);//print-out this message with "String val is null"
		}
	}
	
	public static void myTest(String message) throws MyException { //static method which throw MyException by message
		if(message.equals("null")) throw new MyException("String val is null");//if message is "null", throw Exception with message
		else System.out.println("String val is: " + message);//if not show the input message
	}
}
