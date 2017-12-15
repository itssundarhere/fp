package com.thread;

public class NewApp extends Thread {

	
	@Override
	public void run(){
		System.out.println("New app class thread");
		for(int i=0;i<5;i++){
			System.out.println("child : "+i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public NewApp() {
		super();
	}

	public NewApp(String string) {

	}

}
