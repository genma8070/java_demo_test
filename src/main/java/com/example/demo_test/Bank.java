package com.example.demo_test;

public class Bank {
	private String name;
	private int balance;

	public Bank() {
	}
	public Bank(String name) {
		this.name = name;
		this.balance = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void getPerBalance() {
		System.out.println(this.name + "目前存款" + this.balance);
	}
	public static void getPerBalance2(String name, int balance) {
		System.out.println(name + "目前存款" + balance);
	}
}
