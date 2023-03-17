package com.example.demo_test;

import java.util.Scanner;

public class Application_0303homeWork {//遞回河內塔
	public static void hannoi(int discNum, char from, char buffer, char to) {
		if (discNum == 1) {
			System.out.printf("將碟子從 %C ", from);
			
			System.out.printf("移動到 %C \n", to);
			
		} else {
			hannoi(discNum - 1, from, to, buffer);
			
			System.out.printf("將碟子從 %C ", from);
			
			System.out.printf("移動到 %C \n", to);
			
			hannoi(discNum - 1, buffer, from, to);
					}
	}
	public static void main(String[] args) {
		int discNum;
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入圓盤數量 : ");
		discNum = scanner.nextInt();
		hannoi(discNum, 'A', 'B', 'C');
	}

}

//	public static int fib(int n) {//遞迴費式
//		if (n <= 1)//若項數小於等於1回傳等同其項數的值,0為0,1為1+0=1
//			return n;
//
//		return fib(n - 1) + fib(n - 2);//若需要進行費式計算則會不斷遞迴項數會等於前一項加前前一項的算式
////		f5
////		=f4 + f3
////		=(f3 + f2) + (f2 + f1)
////		=[(f2 + f1) + (f1 + f0)] + [(f1 + f0) + 1]
////		5
//	}
//
//	public static void main(String[] args) {
//		System.out.println(fib(5));//求費式數列中第n項的值


