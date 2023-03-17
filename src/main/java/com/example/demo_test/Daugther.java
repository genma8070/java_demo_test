package com.example.demo_test;

public class Daugther extends Father{
	
	public Daugther() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Daugther(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void shopping() {
		System.out.println(super.getName() + "正在買爆");
	}

}
