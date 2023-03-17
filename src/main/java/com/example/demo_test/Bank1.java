package com.example.demo_test;

public class Bank1 {
	int balance = 5000;
//	int withdrawAmount = 0;設定可以共用的參數

	synchronized void withdraw(int amount) {
		System.out.println("餘額:" + balance + "元");
		System.out.println("提取:" + amount + "元");
		
		while (balance < amount) {
//			withdrawAmount = amount;
			System.out.println("餘額不足, 請存錢");
			System.out.println("======================");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}notify();

		}
		balance -= amount;
		System.out.println("提取:" + amount + "元");
		System.out.println("成功提取現金,餘額: " + balance + "元");
	}

	synchronized void deposit(int amount) {
		System.out.println("存錢");
		while (true) {
//			while (balance < withdrawAmount) {
			balance += amount;
			System.out.println("存入" + amount + "元");
			System.out.println("存款完成,餘額: " + balance + "元");
			System.out.println("======================");
			notify();
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
			if (balance < amount) {//判斷領錢這個動作有沒有成功
				break;
			}
		}

	}

}
