package com.thread;

public class SampleThread {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Thread obj =  Thread.currentThread();
		System.out.println(obj);
		obj.setPriority(Thread.NORM_PRIORITY);
		System.out.println(obj);
		obj.setName("SampleThread");
		System.out.println(obj.getName());
		Thread.sleep(12000);
		//obj.notify();
		System.out.println(obj.getState()+" ");
		//obj.wait();
		obj.interrupt();
		System.out.println(obj.isInterrupted());
		System.out.println(obj.isAlive());
		//obj.resume();
	}

}
