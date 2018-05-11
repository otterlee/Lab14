package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
		CustomId Id1 = new CustomId();//instantiate CustomId as Id1
		while(true)//use loop to try continuously in cusomizing
			try {//use try block to detect exception
				if(Id1.tellStep() == 1) {//if step in customizing id is 1
					System.out.print("Enter your name : ");//prompt to enter the name
					String name = keyboard.nextLine();//take input string to name 
					Id1.setName(name);//call method setName to set name and to know this name is valid
				}
				if(Id1.tellStep() == 2) {//if step in customizing id is 2
					System.out.print("Enter your age : ");//prompt to enter the age
					int age = keyboard.nextInt();//take input number to age
					Id1.setAge(age);//call method setAge to set age and to know this age is valid
				}
				if(Id1.tellStep() == 3) {//if step in customizing id is 3
					System.out.print("Enter your race : ");//prompt to enter the race
					String race = keyboard.next();//take input string to race
					Id1.setRace(race);//call method setRace to set race and to know this race is valid
				}
				break;//if there is no probelm end this loop
			} catch(Exception e) {//if there is exception
				System.out.println(e.getMessage());//print-out there error message
				continue;//and continue to custom id
			}
	}
}
