package com.app.exception;

public class A18_Program2 {

	public static void main(String[] args) {
		try {
			System.out.println("In outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}
			catch(NumberFormatException ae) {
				System.out.println("In inner catch");
			}
			System.out.println("After inner try/catch");// if inner catch not handled so in
														//outer try other statement will not print
		}
		catch(ArithmeticException e) {
			System.out.println("In outer catch");
		}
		
		System.out.println("After outer try/catch");

	}

}
