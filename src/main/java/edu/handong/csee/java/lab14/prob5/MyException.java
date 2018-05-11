package edu.handong.csee.java.lab14.prob5;


public class MyException extends Exception { //class which inherits class Exception
	String message;//instance variable String message
	MyException(){//constructor 
		super();//use constructor of super class
	}
	MyException(String errorMessage) {//constructor with message
		super(errorMessage);////use constructor of super class with parameter string
		this.message = errorMessage;//set the message to errorMessage
	}
	public String toString() {//method which returns the message
        return message;//return string message
    }
}
