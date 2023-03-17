package com.example.demo_test;

public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println(this.name + "正在吃狗食");
	}

	public void sleep() {
		System.out.println(this.name + "正在假睡");
	}

	String color;// 顏色
	int age;// 顏色

	public Dog() {
		System.out.println("This is a Dog class!!");

	}
	public Dog(String name) {
		super(name);

	}

	public Dog(String color, int age) {
		this.color = color;
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void barking() {
		System.out.println(this.name + "正在叫");
	}
}
