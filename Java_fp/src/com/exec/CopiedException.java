package com.exec;

public class CopiedException extends Exception {
	private static final long serialVersionUID = -5933677900539827161L;
	int a;
	   CopiedException(int b) {
	     a=b/a;
	   }
	   public String toString(){
	     return ("Exception Number =  "+a) ;
	  }
	
}
