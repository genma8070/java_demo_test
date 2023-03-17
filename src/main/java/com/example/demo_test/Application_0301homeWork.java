package com.example.demo_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application_0301homeWork {

	public static void main(String[] args) {
		List<Integer> sosuuList = new ArrayList<>();
		int x;
		int y;
		System.out.println("由大到小排出20以下的質數");
		System.out.printf("20以下的質數為 :");
		for (x = 19; x > 1; x--) {
			for (y = 2; y <= x; y++) {
				if (x != y && x % y == 0) {//排除非質數
					break;
				}
				if (y == x) {//找出2
					sosuuList.add(x);//將找到的質數填入LIST
				}
			}
		}
		for (int sosuu : sosuuList) {//foreach提出LIST內的數字
			System.out.printf("%d ", sosuu);
		}
	}
}
