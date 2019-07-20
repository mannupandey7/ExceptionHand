package com.app.exception;

public class A28_PlacingStatementAfterTryCatchFinally {

	public static void main(String[] args) {
		System.out.println(m1());
		
	}
	static int m1() {
			try {
			System.out.println("In try");
			System.out.println(10/0);
			}
			catch(NullPointerException nfe) {
			System.out.println("In catch");
			
			}
			finally {
			System.out.println("In finally");
			//if(true) {
				return 30;
			//	}
			}
			//System.out.println("after try/catch/finally");
			
		}		//if we write without comment line complete code then error will come
}
