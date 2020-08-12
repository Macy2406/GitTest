package com.org.even;

import java.util.Scanner;

public class Evennum1 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int x = a.nextInt();
		if(x%2==0){
			System.out.println("Even");
			
		}else {
			System.out.println("Odd");
		}
	}
}
