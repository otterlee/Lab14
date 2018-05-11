package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Boundary arrayBoundary = new Boundary();//create instance based on class Boundary
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
		boolean stop = false;//
		while(!stop) {
			try {
				System.out.print("Enter an integer : ");
				int number = keyboard.nextInt();
				arrayBoundary.setElement(number);			
			} catch(Exception e) {
				System.out.println("Invalid array index access!");
				stop = true;
			}
		}

	}

}
