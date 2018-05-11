package edu.handong.csee.java.lab14.prob5;


public class MyException extends Exception {
	String message;
	MyException(){
		super();
	}
	MyException(String errorMessage) {
		super(errorMessage);
		this.message = errorMessage;
	}
	public String toString() {
        return message;
    }
}
