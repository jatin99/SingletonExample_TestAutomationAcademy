package com.example;

public class Person {
	private String name;
	private int age;
	private String contactNo;
	private String address;
	private char gender;

	
	
	public Person(String name, int age, String contactNo, String address, char gender) {
		this.name = name;
		this.age = age;
		this.contactNo = contactNo;
		this.address = address;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
