package com.app.exception;

public class A9_Addition {

	public static void main(String[] args) {
		try {
			/*int a=Integer.parseInt(args[0]);
	 		int b=Integer.parseInt(args[1]);*/
			
			int a=3;
			int b=0;	//in this condition will go in 6+7=13  
			
			/*int a=3;
			int b=2;*/	//in this condition will go in a+b=5
			
			int c=a/b;
			System.out.println("Result: "+(a+b));
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Result: "+(4+5));		// this condition for array
		}
		catch(NumberFormatException nfe) {				// this condition for if we enter value instead of int any data type then they will show nfe
			System.out.println("Result: "+(6+7));
		}
		catch(ArithmeticException ae) {
			System.out.println("Result: "+(8+9));
		}

	}
}
