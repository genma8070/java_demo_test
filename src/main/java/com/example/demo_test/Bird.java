package com.example.demo_test;

public class Bird extends Animal {

	public Bird() {
		
		
	}
	public void birdMove(Bird bird) {
		System.out.println(this.name + "正在飛拉");
	}@Override
	public void aniMove(Animal animal) {
		System.out.println(this.name + "正在飛拉");
	}

	public Bird(String name) {
		super(name);
		
	}

	public void flying() {
		System.out.println(this.name + "正在飛");
	}

}
