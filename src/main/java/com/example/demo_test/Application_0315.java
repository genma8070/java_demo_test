package com.example.demo_test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application_0315 {

	public static void main(String[] args) {
		Bank1 bank1 = new Bank1();
		Thread t1 = new Thread() {
			public void run() {
				bank1.withdraw(15000);
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				bank1.deposit(4000);
			}
		};
		t2.start();
		
		
//		SellTicket t = new SellTicket();
//		Thread t1 = new Thread(t, "執行緒1");
//		Thread t2 = new Thread(t, "執行緒2");
//		t1.start();
//		t2.start();
		
		
//		
//		HorseRacing t1 = new HorseRacing("黃金船");
//		HorseRacing t2 = new HorseRacing("米浴");
//		t1.start();
//		t2.start();
//		
//		HorseRacing2 t3 = new HorseRacing2("大和赤齊");
//		HorseRacing2 t4 = new HorseRacing2("目白麥昆");
//		Thread t31 = new Thread(t3);
//		Thread t41 = new Thread(t4);
//		t31.start();
//		t41.start();
		
		
//		MultiThread t = new MultiThread();
//		t.start();
//				System.out.println("印" + t.getName());

	}
}