package com.example.demo_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application_0301 {

	public static void main(String[] args) {
		System.out.println("輸入最多五個數字,計算平均");
		int average = 0;
		int total = 0;
		int x;
		List<Integer> numList = new ArrayList<>();// 設置新的list
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 5; i++) {
			x = scanner.nextInt();
			numList.add(x);// 將輸入的數填入list
			if (x == 0) {
				System.out.println("結束");
				break;
			}
			total += numList.get(i);// 提取該位置的數
			count++;
		}
		if (count != 0) {
			average = total / count;
		}
		System.out.printf("已輸入 ");
		for (int f = 0; f < numList.size(); f++) {// size指list長度
			System.out.printf("%d ", numList.get(f));
		}
		System.out.printf("平均: %d", average);
	}
}

//		double average = 0;
//		double total = 0;
//		double[] degree = new double[5];
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("輸入五個數字計算平均");
//		int count = 0;
//		for (int i = 0; i < degree.length; i++) {
//			degree[i] = scanner.nextInt();
//			if (degree[i] == 0) {
//				System.out.println("結束");
//				break;
//			}
//			total += degree[i];
//			count++;
//		}
//		if (count != 0) {
//			average = total / count;
//		}
//
//		System.out.printf("平均: %d", average);

//		double average2;
//		double total2 = 0;
//		
//		List<Integer> degreeList = new ArrayList<>();
//		degreeList.add(25);
//		degreeList.add(22);
//		degreeList.add(24);
//		degreeList.add(20);
//		degreeList.add(26);
//		degreeList.add(21);
//		degreeList.add(22);
//		
//		
//		for (int i = 0; i < degreeList.size(); i++) {
//			total2 += degreeList.get(i);
//		}
//		
//		average2 = total2 / degreeList.size();
//		System.out.printf("平均溫度的拉 : %5.2f",average2);
//
//	}
//}

//		double average;
//		double total = 0;
//		double[] degree = new double[7];
//		
//		degree[0] = 25;
//		degree[1] = 22;
//		degree[2] = 24;
//		degree[3] = 20;
//		degree[4] = 26;
//		degree[5] = 21;
//		degree[6] = 21;
//		int arrayLength = degree.length;
//		for ( int i = 0; i < arrayLength; i++) {
//			total += degree[i];
//		}
//		average = total / arrayLength;
//		System.out.printf("一周平均溫度 : %5.2f", average);
