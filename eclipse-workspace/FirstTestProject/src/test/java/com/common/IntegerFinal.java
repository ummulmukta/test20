package com.common;

public class IntegerFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=12345;
		int count=0;
		while(i>0) {
			i=i/10;
			count= count+1;
		}
System.out.println(count);
	}

}
