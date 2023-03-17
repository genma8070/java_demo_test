package com.example.demo_test;

public class Person {
	private String name;
	private String id;
	private int year;
	private String address;
	public Person() {
	}
	public Person(String name, String id, int year, String address) {
		this.name = name;
		this.id = id;
		this.year = year;
		this.address = address;
	}
	public Person(String name, String id, int year) {
		this.name = name;
		this.id = id;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

