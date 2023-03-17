package com.example.demo_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application_0302homeWork {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("依次輸入最大五組數字，兩數中間需空格，輸入兩次0則停止");
		for (int i = 0; i < 5; i++) {// 輸入兩數
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (x == 0 && y == 0) {// 連續輸入0則暫停
				System.out.println("停止");
				break;
			}
			numList.add(x);// 兩數放入list
			numList.add(y);
		}
		System.out.println("每組數字相乘的結果為 :");
		for (int j = 0; j < numList.size(); j++) {// 提取數字做算式
			System.out.printf("%n%d * ", numList.get(j));
			j++;
			System.out.printf("%d = %d", numList.get(j), numList.get(j) * numList.get(j - 1));
		}
	}
}
