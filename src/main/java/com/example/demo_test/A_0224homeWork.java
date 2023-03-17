package com.example.demo_test;

import java.util.Scanner;//記得import

public class A_0224homeWork {

	public static void main(String[] args) {// 作業
		final int pwd = 87;// 答案
		int num;// 輸入值
		int x = 1;// 值域最小值
		int y = 99;// 值域最大值
		Scanner scanner = new Scanner(System.in);
		System.out.print("猜1-99的數字 : ");
		for (;;) {

			num = scanner.nextInt();

			if (num == pwd) {
				System.out.println("給你賽到ㄌ");
				break;
			}
			if (y > num && num > pwd) {// 若猜太大且在最大值內則縮小最大值範圍
				System.out.println("猜" + x + "-" + (y = num) + "的數字 : ");
			} else if (x < num && num < pwd) {// 若猜太小且在最小值之上則縮小最小值範圍
				System.out.println("猜" + (x = num) + "-" + y + "的數字 : ");
			} else {
				System.out.println("請輸入" + x + "~" + y + "內的數字");// 看不懂文字的文盲給我打範圍內的值
			}
		}

	}

}
