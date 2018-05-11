package edu.handong.csee.java.lab14.prob1;

import java.util.Random;

public class SpeedLimiter {
	private int speed = 0, limit = 0;//declare integer instance variable speed, limit and initialize them to 0.
	SpeedLimiter(int initialSpeed, int initialLimit){//constructor method, set the initial value of speed and limit
		this.speed = initialSpeed; //set speed to initial speed given as parameter
		this.limit = initialLimit; //set speed to initial limit given as parameter
	}
	public int getSpeed() {//getter method
		return speed;//return speed value
	}
	public void warnSpeedLimit() {//method which tells you whether you've exceed the limit or not
		try { //to handle Exception, use try block and catch block
			if(this.speed > this.limit) throw new Exception ("Speed Limit " + this.limit + "km exceeded!");
			//if speed exceed limit throw Exception with message
			System.out.println("You are a law abiding citizen!");//if not prit-out this message
		}
		catch(Exception e) { //catch block, handle Exception as e
			System.out.println(e.getMessage());//print-out the error message
			System.out.println("You are being fined!");//print-out warn message
		}
		System.out.println("Your current speed : "+ this.speed);//print-out the current speed
	}
}
