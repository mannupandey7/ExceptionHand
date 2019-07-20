package com.app.exception;

public class A16_ExceptionRaisedInnerTry {		// try inside try block

	public static void main(String[] args) {
			try {
				try {
					System.out.println("In inner try"); // this is always executes
					System.out.println(10/0); 		// occurred exception 
				}
				//if we will written instead that (NumberFormatException nfe) then catch block not matched 
				// so this will go to outer catch block and there will be handled .
				// and if will matched then all inner code and after try/catch statement will be print 
				catch(ArithmeticException ae) {		// catching exception 
													
					System.out.println("In inner catch");
				}
			}
			// if here also not match then jvm will thrown Exception only executes "In inner try"
			catch(ArithmeticException e) {	
				System.out.println("In outer catch");
			}
			
			System.out.println("After outer try/catch");
	}

}
