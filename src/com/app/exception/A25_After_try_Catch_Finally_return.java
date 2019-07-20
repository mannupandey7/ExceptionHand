package com.app.exception;

public class A25_After_try_Catch_Finally_return {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("In try");
			System.out.println(10/0);
		}
		catch(NullPointerException npe) {
			System.out.println("In catch");
		}
		finally {
			System.out.println("In finally");
		}
		return 30;
		
	}
}
