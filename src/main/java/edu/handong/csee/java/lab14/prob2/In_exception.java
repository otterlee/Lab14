package edu.handong.csee.java.lab14.prob2;

import java.util.*;

public class In_exception {
	int x, y;//declare integer instance variable x and y
	public void detectError() {
		try {//to handle Exception, use try block and catch block
			Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
			System.out.print("x : ");//prompt to enter x
			this.x = keyboard.nextInt();//take input number into x
			System.out.print("y : ");//prompt to enter y
			this.y = keyboard.nextInt();//take input number into y

			System.out.println(x/y);//print-out result of dividing x to y
		}
		//if there is error in dividing x to y, throw Exception.
		catch(InputMismatchException e) { //If Exception occured because of Input mismatch
			System.out.println("java.util.InputMismatchException");//print-out Exception type
			System.out.println(e.getMessage()); //print-out message of InputMismatchException

		}
		catch(ArithmeticException e) { //If Exception occured because of arithmetic problem
			System.out.println("java.lang.ArithmeticException");//print-out Exception type
			System.out.println(e.getMessage());//print-out message of ArithmeticException
		}
	}
}
