package com.cts.examples.cal;

public class Calculator implements ICalculator {

	
	
	       return a - b;
	
	 
	public int multiplication(int a, int b) {
		 
		return a * b;
	}

	public int divison(int a, int b)  {
		
		return a / b;
	}
	 
	public boolean equalIntegers(int a, int b) {
		boolean result = false;
            	if (a == b) {
			result = true;
		}
 
		return result;
	}
}
