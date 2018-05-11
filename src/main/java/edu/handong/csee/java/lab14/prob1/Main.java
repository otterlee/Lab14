package edu.handong.csee.java.lab14.prob1;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//instantiate Scanner as keyboard
		int limit, speed; //declare local integer variable limit and speed
		System.out.print("Set the speed limit, officer : "); //prompt to enter speed limit
		limit = keyboard.nextInt();//take input number into limit
		Random random = new Random(); //to use random number, instantiate Random to random
		speed = random.nextInt(101); //create random number
		SpeedLimiter citizen1 = new SpeedLimiter(speed, limit); //create an instance based on SpeedLimiter and give two parmeter
		citizen1.warnSpeedLimit();//call method warnSpeedLimit
	}
}
