package com.app.exception;

public class A7_WithOutException {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			int x=20/0;
			System.out.println("3");
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("4");
			
		}	
			System.out.println("5");
	}

}
