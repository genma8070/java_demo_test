package com.example.demo_test;

public class Father {
	private String name;

	public Father() {
		super();
		
	}

	public Father(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void walk() {
		System.out.println(this.name + "正在走路");
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
