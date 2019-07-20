package com.app.exception;

public class A23_Example {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("In try");
		//	return 10;
			return 10/0;		// if we are occurring exception then then will print "In catch" statement.
		}
		catch(ArithmeticException ae) {
			System.out.println("In catch");
			return 20;
		}
		finally {
			System.out.println("In finally");
			return 30;
		}
		
	}

}
