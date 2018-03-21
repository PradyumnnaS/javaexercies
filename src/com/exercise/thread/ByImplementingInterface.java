package com.exercise.thread;

public class ByImplementingInterface implements Runnable{

	public void run() {
		for (int i=1;i<=5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello threads are executing run method"+i);
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String args[]) {
		
		ByImplementingInterface bi1 = new ByImplementingInterface();
		ByImplementingInterface bi2 = new ByImplementingInterface();
		ByImplementingInterface bi3 = new ByImplementingInterface();
		Thread t1 = new Thread(bi1);
		Thread t2 = new Thread(bi2);
		Thread t3 = new Thread(bi3);
		System.out.println("Name of t1"+ t1.getName());
		System.out.println("Name of t2"+ t2.getName());
		System.out.println("Name of t3"+ t3.getName());
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		
		t1.setName("Pradyumnna Satapathy");
		System.out.println("Name of t1"+ t1.getName());
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
	}
}
