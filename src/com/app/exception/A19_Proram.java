package com.app.exception;

public class A19_Proram {

	public static void main(String[] args) {
		try {
			System.out.println("In Outer try");
			try {
				System.out.println("In inner try");
				System.out.println(10/0);
			}
			catch(ArithmeticException e) {
				System.out.println("In inner catch");
				System.out.println(10/0);
			}
			System.out.println("After inner try/catch");
		}
		catch(ArithmeticException e) {
			System.out.println("In outer catch");
		}
		System.out.println("After outer try/catch");
	}

}
