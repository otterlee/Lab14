package edu.handong.csee.java.lab14.prob3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
		PowerCalculator powcal = new PowerCalculator();//instantiate PowerCalculator to 'powcal'
		System.out.println("Power Calculator");//show program name
		while (true) { //while statement which take input infinitely
			System.out.print("n : ");//prompt to enter n
            int n = keyboard.nextInt();//take input number to n
            System.out.print("p : ");//prompt to enter p
            int p = keyboard.nextInt(); //take input number to p       
            try { //use try block
                System.out.println("-> "+powcal.power(n, p));//call method 'power'. if there has Exception, move to catch block
            } catch (Exception e) { //handle Exception as e
                System.out.println(e);//print-out message of e
            }
        }
	}
}