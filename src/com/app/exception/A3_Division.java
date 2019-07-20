package com.app.exception;

public class A3_Division {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[0]);
		
		int c=a/b;		//thread "main" java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println("Result:"+c);
	}

}
