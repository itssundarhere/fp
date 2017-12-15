package com.exec;

public class Solution extends Exception {
	public static void main(String args[]){
	 try{
	       throw new CopiedException(20/0);
	  }
	 catch(CopiedException e){
	    System.out.println(e) ;
		// e.printStackTrace();
		 //e.getMessage();
	 }
}

}
