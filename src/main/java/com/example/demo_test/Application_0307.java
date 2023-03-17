package com.example.demo_test;

import java.util.Scanner;

public class Application_0307 {

	public static void main(String[] args) {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		int count = 0;
		int x, y;
		x = str.indexOf("小龍女");
		while (true) {//無限迴圈
			System.out.println("index: " + x);//印出位置
			y = x;
			x = str.indexOf("小龍女", y + 1);//找下一個小龍女
			count++;
			if (x < 0) {
				System.out.println(count);//印出出現幾次
				break;
			}
		}
	}
}

//			str.indexOf('小');
//			str.indexOf('龍');
//			str.indexOf('女');
//			x = str.indexOf('小');
//			y = str.indexOf('龍');
//			z = str.indexOf('女');
//
//			if (x + 1 == y && x + 2 == z) {
//				x = str.indexOf('小', i + 1);
//				y = str.indexOf('龍', i + 1);
//				z = str.indexOf('女', i + 1);
//				i = z;
//				count++;
//				if (str.indexOf('小', i + 1) == -1) {
//					System.out.println(count);
//					break;
//				}
//			}
