package com.example.demo_test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application_0313 {

	public static void main(String[] args) {//回文
		Scanner scanner = new Scanner(System.in);
		String str1;
		str1 = scanner.nextLine();
		String str2 = "";
		int y = 0;

		for (int x = str1.length() - 1; x >= 0; x--) {
			str2 += str1.charAt(x);
		}
		if (str1.equals(str2)) {
			System.out.println("回文");
		} else {
			System.out.println("不是回文");
		}
	}
}

//		Human human = new Human();
//		Person1 ps1 = new Person1();
//		Dog1 d1 = new Dog1();
//		Car car = new Car();
//		
//		human.run();
//		ps1.run();
//		d1.run();
//		car.run();

//Airplane airplane = new Airplane();
//		airplane.flying();
//		Bird1 b1 = new Bird1();
//		b1.flying();