package com.singelton;

public class MySingeltonClass {
	private static MySingeltonClass s;
	
	private MySingeltonClass() {
		
	}
	
	public static MySingeltonClass x() {
		if(s==null) {
		s = new MySingeltonClass(); // when you request for the object for the first time!
		}
		return s;
	}
	
	
}
