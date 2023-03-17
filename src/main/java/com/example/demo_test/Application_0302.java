package com.example.demo_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application_0302 {

	public static void main(String[] args) {// 找出56的因數，並且列出不重複的因數相乘。 老師VER.
		List<Integer> list = new ArrayList<>();
		int target = 56;
		int x;
		for (int i = 1; i <= target; i++) {// 設定被乘數範圍
			int j = target / i;// 設定乘數
			if (i * j == target && !list.contains(i)) {// 當兩數相乘=56且list內不存在相同的數值時輸出算式
				list.add(i);
				list.add(j);
				System.out.printf("%d * %d = %d", i, j, i * j);
				System.out.println();
			} else if (list.contains(i)) {// 若list內已有相同的數字存在則停止
				break;
			}
		}
//		Collections.sort(list,Collections.reverseOrder());可以排序的方法
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		for (x = 0; x < list.size(); x++) {//排出因數
			System.out.printf("%d ", list.get(x));
			x++;
		}
		for (int y = (x - 1); y > 0; y--) {
			System.out.printf("%d ", list.get(y));
			y--;
		}

	}

}

//		System.out.printf("因數有");
//
//		for (int x = 1; x <= 56; x++) {
//			if (56 % x == 0) {
//				System.out.printf("%d ", x);//輸出因數
//				insuuList.add(x);//數值存入list
//			}
//		}
//		System.out.println();
//		for (int z = 0; z < insuuList.size(); z++) {//設定list順序
//			int i = insuuList.get(z);//抓判斷用數值
//			boolean y = insuuList.contains(i);//判斷要用boolean
//			if (i > 56 / i) {//一半停 
//				break;
//			} else if (y == true) {//輸出算式
//				System.out.println("56 = " + insuuList.get(z) + " * " + 56 / insuuList.get(z));
//			}
//		}

//		int[][] x = { { 1, 2, 3 },//二維矩陣
//				      { 4, 5, 6 } };
//
//		for (int i = 0; i < x.length; i++) {
//			for (int j = 0; j < x[i].length; j++) {
//				System.out.printf("x[%d][%d] = %d\t", i, j, x[i][j]);
//			}
//			System.out.println("");
//		}