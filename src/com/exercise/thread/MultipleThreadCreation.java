package com.exercise.thread;

public class MultipleThreadCreation extends Thread{

	
	public void run() {
		for (int i=1;i<=5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello threads are executing run method"+i);
		}
	}
	
	public static void main(String args[]) {
		
		MultipleThreadCreation mt1 = new MultipleThreadCreation();
		MultipleThreadCreation mt2 = new MultipleThreadCreation();
		MultipleThreadCreation mt3 = new MultipleThreadCreation();
		MultipleThreadCreation mt4 = new MultipleThreadCreation();
		MultipleThreadCreation mt5 = new MultipleThreadCreation();
		MultipleThreadCreation mt6 = new MultipleThreadCreation();
		
		mt5.start();
		mt6.start();
		
		mt1.start();
		
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mt2.start();
		try {
			mt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mt3.start();
		mt4.start();
	}
}
