package com.example.demo_test;

public class Son extends Father{
	
	public Son() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void playball() {
		System.out.println(super.getName() + "正在打球");
	}

}
