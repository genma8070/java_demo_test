package com.example.demo_test;

public class School {
	
	private class Motto {
		private String name = "bocchi";
		
		public void printInfo() {
			System.out.println(this.name + "爽睡一波");
		}
	}
	
	public void display() {
		Motto mot = new Motto();
		mot.printInfo();
		
	}
	

}
