package com.example.demo_test;

import java.util.Scanner;//記得import

public class Application_0223 {

	public static void main(String[] args) {
		int i;//for迴圈
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			System.out.println("i=" + i);
			sum = sum + i;
			System.out.println("sum=" + sum);
		}
		
//		int score;//switch case
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("計算最終成績");
//		System.out.print("請輸入分數(0-99) : ");
//		score = scanner.nextInt();
//		switch (score / 10) {
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//			default:
//				System.out.println("F");
//		}
		
//		double price;//if elseif練習
//		int age;
//		int ticket = 100;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("計算票價");
//		System.out.print("請輸入年齡 : ");
//		age = scanner.nextInt();
//		if (age >= 80 || age <= 6) {
//			price = ticket * 0.2;
//			System.out.print("票價為 : " + price);
//		} else if ( (7 <= age) && (age <= 12) ||
//				(60 <= age) && (age <= 79) ) {
//			price =ticket * 0.5;//長すぎワロタ
//			System.out.print("票價為 : " + price);
//			} else {
//				price = ticket;
//				System.out.print("票價為 : " + price);
//			}
		
//		int workTime, hourSalary = 150;//作業
//		Scanner weeklyWorkTime = new Scanner(System.in);
//		
//		System.out.print("輸入這周工時");
//		workTime = weeklyWorkTime.nextInt();
//		if (workTime < 40) {
//			System.out.println("本周薪資為 : " + workTime * hourSalary * 0.8);
//		} else {
//			System.out.println("本周薪資為 : " + workTime * hourSalary);
//		}
		
		
//		int age;//if else練習
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("請輸入年齡 : ");
//		age = scanner.nextInt();
//		if (age < 20) {
//			System.out.println("你的年齡太小");
//			System.out.println("需買20歲才可以購買菸酒");
//		} else {
//			System.out.println("歡迎購買菸酒");
//		}
		
		
//		int age = 15;//else
//		if(age >= 18) {
//			System.out.println("已成年!");
//		}
//		if(age < 18) {
//			System.out.println("未成年!");
//		}
//		if(age >= 18) {
//			System.out.println("已成年!");
//		} else {
//			System.out.println("未成年!");
//		}
	}

}
