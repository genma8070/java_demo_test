package com.example.demo_test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application_0313homeWork {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9);
		List<Integer> list2 = new ArrayList<>();

		for (int z = 0; z < list.size(); z++) {
			System.out.print(list.get(z));
		}
		System.out.println();
		int i = list.size() - 1;

		for (i = list.size() - 1; i > 0; i--) {// 將數列視為一數後個位數+1
			int x = list.get(i) + 1;
			if (x >= 10 && (list.get(i - 1) == 9)) {// 若需要進位且全為9
				list.set(i, 0);
				list.set(i - 1, list.get(i - 1) + 1);

			} else if (x < 10 && i == (list.size() - 1)) {// 若不需要進位就單純+1
				list.set(i, list.get(i) + 1);
				break;
			} else {// 需要進位但不全為9
				list.set(i, 0);
				list.set(i - 1, list.get(i - 1) + 1);
				break;
			}
		}
		if (list.get(0) == 10 || (list.size() == 1 && list.get(0) == 9)) {// 將需要增加位數後的數塞成數列
			list2.add(1);// 增加位數後的首項一定是1
			for (int y = 1; y <= list.size(); y++) {// 原本是幾位數就塞幾個零
				list2.add(0);
			}
			System.out.println(list2);// 多一位數的數列
		} 
		else {
			System.out.println(list);// 長度不變的數列
		}
	}
}