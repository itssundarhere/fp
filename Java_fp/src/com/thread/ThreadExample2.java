package com.thread;

import java.io.*;
import java.lang.*;

class NewThread extends Thread {
	public NewThread() {
		super("Child Thread");
		System.out.println("Child Thread");
		start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread :" + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child is exiting");
	}
}

public class ThreadExample2 {
	public static void main(String args[]) throws InterruptedException {
		NewThread n = new NewThread();
		// n.start();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread :" + i);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main is exiting");
	}
}