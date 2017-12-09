package com.thread;
import java.io.*;
import java.lang.*;
public class ThreadExample
{
public static void main(String args[]) throws InterruptedException
{
	Thread t=Thread.currentThread();
	System.out.println("Hey me  .... :  "+t);
	t.setName("Demo Thread");
	t.setPriority(2);
	System.out.println("Waiting for end .... :  "+t);
	Thread.sleep(5000);
	System.out.println(t.getPriority());
	System.out.println(t.getName());
	System.out.println(t.getState());
	System.out.println(t.isAlive());
}
}






/*try{
System.out.println("Hey me  .... :  "+t);
t.setName("Demo Thread");
t.setPriority(2);
System.out.println("Waiting for end .... :  "+t.getName());
System.out.println("I am going to sleep ............  .... :  "+t);
Thread.sleep(10000);
System.out.println("Byeeee.........");
}
catch(InterruptedException e)
{
System.out.println("Main Thread Interrupted");
}
System.out.println("Main Thread Exiting");
}
}*/