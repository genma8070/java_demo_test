package com.example.demo_test;

import java.util.Scanner;

public class Application_0306 {

	public static void main(String[] args) {//給予隨機一值，輸入數字到猜到答案
		int pwd = (int) ((Math.random() * (99 - 1 + 1)) + 1);// 隨機給予一數
		System.out.println("本局的密碼為: " + pwd);
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
				System.out.println("請輸入" + x + "~" + y + "內的數字");// 打範圍內的值
			}
		}
	}
}
//		Bank bank = new Bank("bocchi");
//		bank.getPerBalance();
//		bank.setBalance(1000);
//		bank.getPerBalance();
//		Bank.getPerBalance2("yamada ryou", 200);

//		Person person = new Person("yamada ryou", "ryou", 17, "gotoukei");
//		Person person2 = new Person("hitori", "bocchi", 17);
//
//		System.out.println(person2.getName());
//		System.out.println(person2.getId());
//		System.out.println(person2.getYear());
//
//		System.out.println(person.getName());
//		System.out.println(person.getId());
//		System.out.println(person.getYear());
//		System.out.println(person.getAddress());
