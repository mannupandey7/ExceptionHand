package com.app.exception;

public class A15_InsideInnerCatchWillCatchExp {

	public static void main(String[] args) {
		try {
			System.out.println("In outer try");
			System.out.println(10/0);
			
			try {
			
				System.out.println("In inner try");
			}
			catch(ArithmeticException ae) {			// Here exception will not handled by inner catch
				System.out.println("In inner  catch");
			}
			
			System.out.println("After inner  try/catch");
		}
		
		catch(ArithmeticException e) {		//if using these (NumberFormatException nfe) still will not
											//handled by inner catch always will handle by outer catch of outer try Exception
			System.out.println("In outer catch");
		}
		System.out.println("After outer try/catch");
	}

}
