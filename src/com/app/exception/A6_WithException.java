package com.app.exception;

public class A6_WithException {			
		
	public static void main(String[] args) {
		
			System.out.println("1");
			
			try {
				System.out.println("2");
				int x=10/0;
				System.out.println("3");
				
			}
			catch(ArithmeticException ae){ // here exception is handle
				System.out.println("4");
			}
			
				System.out.println("5");
		}
	
}
