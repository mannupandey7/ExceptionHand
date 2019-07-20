package com.app.exception;

public class A11_FindOne {			// without exception

	public static void main(String[] args) {
		System.out.println("1");	// 1
			try {
				System.out.println("2");//2	// in try block no any exception raised 
											// and always executes try block by jvm (JDH)
			}
			catch(ArithmeticException ae) {
				System.out.println("3");
				System.out.println(10/0);
				System.out.println("4");
			}
			
		System.out.println("5");	//3 // this also will be print
			
	}

}	
