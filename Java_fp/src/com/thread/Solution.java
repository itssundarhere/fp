package com.thread;

public class Solution extends Thread {

	public static void main(String[] args) {
		System.out.println("Main class thread");
		NewApp np = new NewApp("Demo");
		np.start();
		for(int i=0;i<5;i++){
			System.out.println("main : "+i);
			System.out.println("CT : "+np.getState());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		

	}

}
