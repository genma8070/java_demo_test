package com.example.demo_test;

import java.util.Scanner;//記得import

public class Application_0222homeWork {

	public static void main(String[] args) {

		float x1;
		Scanner onndo = new Scanner(System.in);
		
		System.out.println("將輸入的數字轉換為華氏溫度和攝氏溫度");
		x1 = onndo.nextFloat();//讀取下個數
		System.out.println("華氏溫度為:" + (x1 * 9 / 5 + 32) + "度");
		System.out.println("攝氏溫度為:" + (x1 - 32) * 5 / 9 + "度");
		
		int fristWord, lastWord, howManyWord, sum;
		Scanner math = new Scanner(System.in);
		//高斯數學公式:總和=(首項+末項)*項數/2
		System.out.println("輸入兩數(需空格隔開)，計算兩數之間整數的總和");
		fristWord = math.nextInt();
		lastWord = math.nextInt();
		howManyWord = (lastWord - fristWord + 1);
		sum = (fristWord + lastWord) * howManyWord / 2;
		System.out.println(fristWord + "加至" + lastWord + "的總和為:" + sum);
	}

}
