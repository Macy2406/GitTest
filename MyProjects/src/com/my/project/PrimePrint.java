package com.my.project;

public class PrimePrint {
public static void main(String[] args) {
		
		int n=0;
	
		for(int j=1;j<=1000;j++) {
			int b=0;
		for(int i=2;i<j;i++) {
			if(j%i==0) {
				b=1;
				break;
			}
		}if(b==0) {
			n++;
		}
	}
		System.out.println("Total Prime Number is = "+n);
		
}
}
