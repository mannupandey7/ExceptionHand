package com.app.exception;

public class A2_WithException {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
		
		int c=a/b;		//thread "main" java.lang.ArithmeticException will come
		
		System.out.println("c value:"+c);
		
		/*int d=30;
		int e=10;
		
		System.out.println("a value:"+d);
		System.out.println("b value:"+e);
		
		int f=d/e;		//thread "main" java.lang.ArithmeticException will come
		
		System.out.println("c value:"+f);*/  //after thrown exception then remaining code will not run
	}

}
