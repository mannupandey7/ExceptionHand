package com.app.exception;

public class A32_BreakStatement4 {

		static int m1() {
			System.out.println("m1 start");
			int i=0;
			while(++i<=5) {
				System.out.println("while start"+i);
				try {
					System.out.println("In try"+i);
					return 10/0;
				}
				finally {
					System.out.println("in finally"+i);
					System.out.println("break is executed");
					break;
				}
			}
			System.out.println("After while loop");
			System.out.println("m1 end");
			return 20;
		}
		

}
