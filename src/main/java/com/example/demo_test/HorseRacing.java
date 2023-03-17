package com.example.demo_test;

public class HorseRacing extends Thread{
	private String name;
	HorseRacing(String name){
		this.name = name;
	}
	public void run(){
		for(int i = 1; i <= 5; i++) {
			System.out.println(name + "正在跑第" + i + "圈");
		}
	}

}
