package com.singelton;

public class Runner {
	public static void main(String[] args) {
		
		MySingeltonClass d1 = MySingeltonClass.x();
		System.out.println(d1);
		
		MySingeltonClass d2 = MySingeltonClass.x();
		System.out.println(d2);
		
	}
}
 