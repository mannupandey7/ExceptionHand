package com.app.exception;

public class A13_FindOne {

	public static void main(String[] args) {
		System.out.println("1-first out of try ");
		try {
			System.out.println("2-first try");
			System.out.println(10/0);
			System.out.println("3-second try ");	// not will execute
		}
		catch(ArithmeticException ae) {
			System.out.println("4-first catch");
			
			try {
				System.out.println("5-first inner try");
				System.out.println(10/0);
				System.out.println("6-second inner try"); //not will execute
			}
			catch(ArithmeticException a) {
				
				System.out.println("7-first inner catch");
			}
			System.out.println("8-first out of inner catch");
		}
		System.out.println("9-complete outer of try catch");
	}

}
