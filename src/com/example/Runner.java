package com.example;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1;
		p1 = new Person("Raj", 25, "777777777", "abc", 'm');

		Person p2 = new Person("Riya", 22, "888888888", "pqr", 'f');

		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p1);
		System.out.println(p2);

	}

}
