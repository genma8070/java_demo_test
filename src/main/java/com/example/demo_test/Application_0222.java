package com.example.demo_test;

import java.util.Scanner;//記得import

public class Application_0222 {

	public static void main(String[] args) {
//		String x;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("請輸入姓名 : ");
//		x = scanner.next();//讀字串
//		System.out.printf("嗨! %s 歡迎使用本系統", x);
		
//		String x;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("請輸入姓名 : ");
//		x = scanner.nextLine();//讀整行
//		System.out.printf("嗨! %s 歡迎使用本系統", x);
		
//		int x1, x2;
//		Scanner x1tasux2 = new Scanner(System.in);
//		
//		System.out.println("輸入兩個數字(需空白間隔)");
//		x1 = x1tasux2.nextInt();//讀取下個數
//		x2 = x1tasux2.nextInt();
//		System.out.println("第一個數入的數字是:" + x1);
//		System.out.println("第二個輸入的數字是:" + x2);
//		System.out.println("數字的總合為     :" + (x1 + x2));
//		
//		double x1, x2;//浮點數版本
//		Scanner x1tasux2 = new Scanner(System.in);
//		
//		System.out.println("輸入兩個數字(需空白間隔)");
//		x1 = x1tasux2.nextDouble();//讀取下個數字
//		x2 = x1tasux2.nextDouble();
//		System.out.println("第一個數入的數字是:" + x1);
//		System.out.println("第二個輸入的數字是:" + x2);
//		System.out.println("數字的總合為     :" + (x1 + x2));
		
		int x ;
		x = 10;
		System.out.println("x: " + x);
		System.out.println(++x * 10);//前置運算
		System.out.println("x: " + x);
		int y = 5;
		System.out.println("y: " + y);
		System.out.println(y++ * 10);//後置運算
		System.out.println("y: " + y);
		System.out.println(6>9);//反向運算
		System.out.println(!(6>9));
		System.out.println(8 == 7);
		System.out.println(8 != 7);
		
		int a = 100;//三元運算子
		int b = 50;
		int c = a > b ? 77:88;
		
		System.out.println(c);
		
		int d = 20;
		int e = 30;
		int f = e < d ? 87:78;
		
		System.out.println(f);
	}

}
