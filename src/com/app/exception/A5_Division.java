package com.app.exception;

public class A5_Division {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[4]);
			int b=Integer.parseInt(args[4]);
			int c=a/b;
			
			System.err.println(c);
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Please pass atleast two integer values");	
		}
		try {		//1 will print
			int d=40;
			int e=20;
			int f=d/e;
			
			System.err.println(f);
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Please pass atleast two integer values");	
		}
		catch(ArithmeticException ae) {
			System.out.println("Please don't pass second value of zero");
		}
		try {
			int g=40;
			int h=0;
			int i=g/h;
			System.out.println(i);	// i think we take in one class multiple try block with catch or finally.							
		}
		catch(ArithmeticException ae) {
			System.out.println("Please don't pass second value of zero");
		}
		
		catch(NumberFormatException afe) {
			System.out.println("Please pass only integer value");
		}
		
		System.out.println("Program is executed");
	}
	

}
