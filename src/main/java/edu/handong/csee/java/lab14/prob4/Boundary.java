package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	int a[] = new int[5];//declare array which length is 5
	int i = 0; //declare variable which means index
	public void setElement(int num) throws ArrayIndexOutOfBoundsException { //method which throws rrayIndexOutOfBoundsException
		a[i] = num;//put the num to a[i]
		System.out.println("arr["+i+"] <- "+num); //print-out message to tell success in setting
		i++;//increase index number
	}
}
