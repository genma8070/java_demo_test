package com.example.demo_test;

import java.util.Scanner;

public class Application_0309 {

	public static void main(String[] args) {
		School school = new School();
		school.display();
		System.out.println("===========");
		School schoolA = new School(){
		public void display() {
			System.out.println( "睡爛");
		}
	};
	schoolA.display();
}

}

//		Animal animal = new Animal("bocchi");
//		Bird bird = new Bird("ikuyo");
//		Cat cat = new Cat("nichika");
//		animal.aniMove(animal);
//		bird.birdMove(bird);
//		cat.catMove(cat);
//
//		System.out.println("===========");
//		Animal animall = new Animal("bocchi");
//		Animal birdd = new Bird("ikuyo");
//		Animal catt = new Cat("nichika");
//		animall.aniMove(animall);
//		birdd.aniMove(birdd);
//		catt.aniMove(catt);
//
//		Dog dog = new Dog("ryou");