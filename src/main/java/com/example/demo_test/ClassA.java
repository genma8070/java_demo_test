package com.example.demo_test;

public class ClassA {
	private int id;
	private String name;
	private ClassC classc = new ClassC();

	public ClassA() {

	}

	ClassA(int id, String name, ClassC class_c) {
		this.id = id;
		this.name = name;
		this.classc = class_c;
	}

	public void printInfo() {
		
		System.out.println("城市:" + classc.getCity());
		System.out.println("省:" + classc.getState());
		System.out.println("國:" + classc.getCountry());

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ClassC getClassc() {
		return classc;
	}

	public void setClassc(ClassC classc) {
		this.classc = classc;
	}

}
