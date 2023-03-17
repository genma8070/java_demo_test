package com.example.demo_test;

public class Animal {
	public String name;

	public Animal() {
		System.out.println("This is a Animal class!!");

	}

	public Animal(String name) {
		
		this.name = name;
	}
	public void move() {
		System.out.println(this.name + "正在移動");
	}
	public void aniMove(Animal animal) {
		System.out.println(this.name + "正在移動");
	}


	public void eat() {
		System.out.println(this.name + "正在吃食物");
	}

	public void sleep() {
		System.out.println(this.name + "正在睡覺");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
