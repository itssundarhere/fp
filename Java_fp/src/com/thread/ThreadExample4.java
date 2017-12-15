package com.thread;

import java.io.*;
import java.lang.*;

class NewThreadM implements Runnable {
	Thread t;

	public NewThreadM(String n) {
		t = new Thread(this, n);
		System.out.println(" " + t.getState());
		System.out.println("Thread Name : " + t.getName());
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread  " + t.getName() + " :" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child" + t.getName() + " is exiting");
	}
}

public class ThreadExample4 {
	public static void main(String args[]) throws InterruptedException {
		NewThreadM ob1 = new NewThreadM("One");
		System.out.println("Now...." + ob1.t.getState());
		NewThreadM ob2 = new NewThreadM("Two");
		NewThreadM ob3 = new NewThreadM("Three");
		System.out.println("Thread One status" + (ob1.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Two status" + (ob2.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Three status" + (ob3.t.isAlive() ? "   Alive" : "   No"));
		try {
			Thread.sleep(1000);
			System.out.println("Thread One is going to sleep");
			ob1.t.suspend();
			System.out.println("Now...." + ob1.t.getState());
			System.out.println("Thread One is going to resume the process");
			ob1.t.resume();
			System.out.println("Now...." + ob1.t.getState());
			System.out.println("Waiting for End");
			Thread.sleep(1000);
			ob1.t.join();
			System.out.println("One status  " + ob1.t.getState());
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Thread One status" + (ob1.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Two status" + (ob2.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Three status" + (ob3.t.isAlive() ? "   Alive" : "   No"));
	}
}