package com.example.demo_test;

import java.util.Scanner;//記得import

public class A_0226ex {

	public static void main(String[] args) {
		System.out.println("輸入便當個數");// 助教習題
		int bentou = 100;
		int katsuu;

		Scanner scanner = new Scanner(System.in);
		katsuu = scanner.nextInt();
		int y = (katsuu / 10);
		int x = bentou * katsuu;

		if (katsuu * bentou >= 1000) {
			System.out.printf("總價:" + x * 0.7 + " 總數:" + (katsuu + y) + " 原購買量:" + katsuu);

		} else if (katsuu * bentou >= 500) {
			System.out.printf("總價:" + x * 0.9 + " 總數:" + (katsuu + y) + " 原購買量:" + katsuu);
		} else
			System.out.printf("總價:" + x + " 總數:" + (katsuu + y) + " 原購買量:" + katsuu);
	}
}

//		   for (int i = 0; i < 10; i++) {
//	            for (int x = 0 ; x <= i ; x++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }

//	System.out.println("輸入1為勝，0為敗，十局分勝負");//十戰分勝負
//		int x = 0;
//		int o = 0;
//		int count = 0;
//				
//		for( ; ; ) {
//					
//			if (count == 10) {
//				System.out.println("分出勝負 " + o + "勝" + x + "敗");
//				break;
//			}int hanntei = shoubu.nextInt();
//			if (hanntei == 1) {
//				o++;
//				count++;
//				System.out.println("第" + count + "局，目前" + o + "勝" + x + "敗");
//				
//				
//			}else if (hanntei == 0)  {
//				x++;
//				count++;
//				System.out.println("第" + count + "局，目前" + o + "勝" + x + "敗");
//			}	
//		}		

// System.out.println("輸入十個數字計算平均值(只計算整數部分)");//計算十個數字的平均值
//		Scanner suuji = new Scanner(System.in);
//		int sum = 0;
//		int count = 0;
//		
//		
//		for(;;) {
//			
//			if (count == 10) {
//				System.out.println("平均數為" + sum / 10 );
//				break;
//				
//			}else {
//			int x = suuji.nextInt() ;
//			sum += x ;
//			System.out.println("目前總合為: " + sum);
//			count++;
//			}
//		}		 

//		int x;//7的乘階
//		int y = 1;
//		for (x = 2; x < 8; x++) {
//			y *= x;
//			
//		}System.out.printf("7的乘階為:%4d", y);

//		int x;//列出二的八次方為止的數
//		int y = 2;
//		for(x = 1; x < 9; x++) {
//			System.out.printf("2的%d次方=%3d ", x, y *= 2);
//		}

//		int x = 3;//列出九九乘法三的部分
//		int y = 1;
//		for (x = 3; x < 4; x++) {
//			for(y = 1; y < 10; y++) {
//				System.out.printf("%d*%d=%2d%n", x, y, x*y);
//			}
//		}

//		int count = 0;//輸出10次SPAM
//		for (int x =1; x <= 10; x++) {
//			System.out.println("SPAM");
//			}			

//		
