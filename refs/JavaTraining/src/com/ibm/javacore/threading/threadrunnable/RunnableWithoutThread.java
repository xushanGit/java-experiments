package com.ibm.javacore.threading.threadrunnable;

import java.util.Calendar;

public class RunnableWithoutThread implements Runnable {

	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.print("|"); 
			delay(100); 
		}
	}

	private void delay(long ms) {
		long start = Calendar.getInstance().getTimeInMillis(); 
		while (Calendar.getInstance().getTimeInMillis() < start + ms); 
	}
	
	public static void main(String[] args) {
		Runnable r = new RunnableWithoutThread(); 
		r.run(); 
		System.out.println("Thread started. "); 
	}
}
