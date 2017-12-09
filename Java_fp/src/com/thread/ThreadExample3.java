package com.thread;

import java.io.*;
import java.lang.*;

class NewThreadN implements Runnable {
	Thread t;

	public NewThreadN(String n) {
		t = new Thread(this, n);
		System.out.println("Thread Name : " + t.getName());
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread : " + t.getName() + " :" + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child " + t.getName() + " is exiting");
	}
}

public class ThreadExample3 {
	public static void main(String args[]) throws InterruptedException {
		NewThreadN ob1 = new NewThreadN("One");
		NewThreadN ob2 = new NewThreadN("Two");
		NewThreadN ob3 = new NewThreadN("Three");
		NewThreadN ob4 = new NewThreadN("Four");
		/*
		 * NewThread ob5=new NewThread("Five"); NewThread ob6=new
		 * NewThread("Six"); NewThread ob7=new NewThread("Seven"); NewThread
		 * ob8=new NewThread("Eight"); NewThread ob9=new NewThread("Nine");
		 * NewThread ob10=new NewThread("Ten");
		 */
		try {
			System.out.println("Waiting for End");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
	}
}