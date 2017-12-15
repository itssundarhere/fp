package com.thread;

import java.io.*;
import java.lang.*;
class ThreadExample5
 { 
public static void main(String args[])
 {
Thread t=Thread.currentThread();
t.setName("Main Thread");
t.setPriority(Thread.MAX_PRIORITY);
System.out.println("The Maximum Priority of Thread  "+t.getName()+" is : "+t.getPriority());
t.setPriority(Thread.NORM_PRIORITY);
System.out.println("The Normal Priority of Thread  "+t.getName()+" is : "+t.getPriority());
t.setPriority(Thread.MIN_PRIORITY);
System.out.println("The Minimum Priority of Thread  "+t.getName()+" is : "+t.getPriority());
} 
}