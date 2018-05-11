package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		CustomId Id1 = new CustomId();
		boolean stop = true;
		while(true)
			try {
				if(Id1.tellStep() == 1) {
					System.out.print("Enter your name : ");
					String name = keyboard.nextLine();
					Id1.setName(name);
				}
				if(Id1.tellStep() == 2) {
					System.out.print("Enter your age : ");
					int age = keyboard.nextInt();
					Id1.setAge(age);
				}
				if(Id1.tellStep() == 3) {
					System.out.print("Enter your race : ");
					String race = keyboard.next();
					Id1.setRace(race);
				}
				break;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
	}
}
