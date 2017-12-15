package com.thread;
class Queen
{
	int n;
	synchronized int get()
	{
		System.out.println("i got : "+this.n);
		return this.n;
	}
	synchronized void put(int n)
	{
		this.n=n;
		System.out.println("i set : "+this.n);
	}
}
class Producer implements Runnable
{
	Queen q;
	Producer(Queen q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
			while(true)
				q.put(i++);
	}
}
class Consumer implements Runnable
{
	Queen q;
	Consumer(Queen q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
			q.get();
	}
}
class ThreadExample6
{
	public static void main(String args[])
	{
		Queen q=new Queen();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Ctrl-c to stop");
	}
}