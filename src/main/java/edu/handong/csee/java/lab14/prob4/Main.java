package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Boundary arrayBoundary = new Boundary();//create instance based on class Boundary
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
		boolean stop = false;//declare boolean variable to handle loop
		while(!stop) { //if value of stop is stop
			try {//use try block
				System.out.print("Enter an integer : ");//prompt to enter number
				int number = keyboard.nextInt();//take input number to number
				arrayBoundary.setElement(number);//call method setElement with parameter number		
			} catch(Exception e) {//if there is Exception in setting element
				System.out.println("Invalid array index access!");//print-out this message
				stop = true;//and stop this loop
			}
		}

	}

}
