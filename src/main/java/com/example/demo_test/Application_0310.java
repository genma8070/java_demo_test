package com.example.demo_test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Application_0310 {

	public static void main(String[] args) {

		Date date = new Date();
//     
//     System.out.println(date);
//     System.out.println(System.currentTimeMillis());
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	}
}

//		Circle cir = new Circle(1);
////		cir.draw();
//		System.out.println("園面積: " + cir.area(1));
////		Square squ = new Square();
////		squ.draw();