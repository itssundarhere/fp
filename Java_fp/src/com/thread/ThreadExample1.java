package com.thread;

import java.io.*;
import java.lang.*;

class ThreadExample1 implements Runnable {
	Thread t;

	public ThreadExample1() {
		t = new Thread(this, "Child Thread");
		System.out.println("Thread Name : " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread :" + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child is exiting");
	}
}

