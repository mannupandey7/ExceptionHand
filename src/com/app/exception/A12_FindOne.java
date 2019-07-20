package com.app.exception;

public class A12_FindOne {		// with exception

	public static void main(String[] args) {
		
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(10/0);	// here occurred exception
			System.out.println("3");
		}
		catch(ArithmeticException ae) {	// thats why came here in this block
			System.out.println("4");
			System.out.println(10/0);	// here occurred exception then direct thrown exception by JDH
			System.out.println("5");
		}
		System.out.println("6");
	}

}
