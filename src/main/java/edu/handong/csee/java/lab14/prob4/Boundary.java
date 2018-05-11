package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	int a[] = new int[5];
	int i = 0;
	public void setElement(int num) throws ArrayIndexOutOfBoundsException { 
		a[i] = num;

		System.out.println("arr["+i+"] <- "+num);
		i++;
	}
}
