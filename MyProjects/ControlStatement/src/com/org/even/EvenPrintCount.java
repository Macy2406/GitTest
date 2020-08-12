package com.org.even;

public class EvenPrintCount {
	public static void main(String[] args) {
		int count=0;
			for(int i=0;i<=100;i++) {
			if (i % 2 == 0) {
				System.out.println("Even : " +i);
				count++;
			} 
			}
			System.out.println("Total Even Number Is : " +count);
		}
}
