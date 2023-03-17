package com.example.demo_test;

public class Cat extends Animal {
	public Cat() {
		super();

	}

	public Cat(String name) {
		super(name);

	}

	@Override
	public void move() {
		System.out.println(this.name + "正在跳走");
	}
	public void catMove(Cat cat) {
		System.out.println(this.name + "正在跳走");
	}

}
