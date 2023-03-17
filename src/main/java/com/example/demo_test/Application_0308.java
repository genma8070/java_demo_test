package com.example.demo_test;

import java.util.Scanner;

public class Application_0308 {

	public static void main(String[] args) {
		ClassA classa = new ClassA();
		ClassB classb = new ClassB();
		ClassD classd = new ClassD();

		classa.printInfo();
		System.out.println("======================");
		System.out.println(classb.getClassc().getCity());
		System.out.println("======================");
		classd.printInfo();

	}
}

//		Father father = new Father("bocchi");
//		
//		father.walk();
//
//		System.out.println("===========");
//		Son son = new Son("ikuyo");
//		son.walk();
//		son.playball();
//		System.out.println("===========");
//		Daugther daugther = new Daugther ("futari");
//		daugther.walk();
//		daugther.shopping();

//Animal animal = new Animal("bocchi");
//		animal.eat();
//		animal.sleep();
//		System.out.println("===========");
//		Dog dog = new Dog("ryou");
//		dog.eat();
//		dog.sleep();
//		dog.barking();
//		System.out.println("===========");
//		Bird bird = new Bird("ikuyo");
//		bird.eat();
//		bird.sleep();
//		bird.flying();