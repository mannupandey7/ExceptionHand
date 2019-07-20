package com.app.exception;

public class A8_RulesOfExcecptionClass {

	public static void main(String[] args) {
		System.out.println(""
				+">>>case #1-------Right---------"+ "\n"
				+ "try{}"+ "\n"
				+ "catch(Exception e){}"+ "\n"
				+ "finally {}	"+ "\n"
				+ "\n"
				+ "\n"
				+">>>case #2-------Right---------"+ "\n"
				+ "try{}" + "\n"
				+ "finally{}"+ "\n"
				+ "\n"
				+ "\n"
				+">>>case #3-------Wrong---------"+ "\n"
				+ "try{}"+ "\n"
				+ "finally{}"+ "\n"
				+ "catch(Exception e){}"+ "\n"
				+ "\n"
				+ "\n"
				+">>>case #4-------Wrong---------"+ "\n"
				+ "try{}" + "\n"
				+ "\n"
				+ "\n"
				+">>>case #5-------Wrong---------"+ "\n"
				+ "catch(Exception e){}"+ "\n"
				+ "\n"
				+ "\n"
				+">>>case #6-------Wrong---------"+ "\n"
				+ "finally{}"+ "\n"
				+ "\n"
				+ "\n"
				+">>>case #7-------Wrong---------"+ "\n"
				+ "try{}"+ "\n" 
				+ "int a=10;"+ "\n"
				+ "catch(Exception e){}"+ "\n"
				+ "int b=20;"+ "\n"
				+ "finally{}"+ "\n"
				+ "");
				
			
				
				
				
	}

}
