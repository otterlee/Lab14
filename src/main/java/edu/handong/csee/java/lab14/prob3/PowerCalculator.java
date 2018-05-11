package edu.handong.csee.java.lab14.prob3;

import java.util.*;
public class PowerCalculator {
	public long power(int n, int p) throws Exception { //method to power by n and p, and throw Exception
		if(n<0 || p<0) throw new Exception("n or p should not be negative.");
		//if n of p is negative number, throw Exception with message
		if(n==0 || p==0) throw new Exception("n or p should not be 0.");	
		//if n of p is 0, throw Exception with message
		long result = (long)Math.pow(n,p); //cast long to convert double to lon
		//calculate the result by use method Math.pow
		return result;//return result
	}

}
