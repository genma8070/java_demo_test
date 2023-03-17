package com.example.demo_test;

public class SellTicket implements Runnable {
	private int tickets = 10;
	
	@Override
	
	public synchronized void run() {
		for(int i = 0; i < 10; i++) {
			if(tickets > 0) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("票剩" + tickets--);
			}
		}
	}
}
