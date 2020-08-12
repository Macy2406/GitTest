package com.org.reverse;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int x = sc.nextInt();
		int rem=0,b,a;
		a=x;
		while (a>0) {
			b=a%10;
			rem=(rem*10+b);
			a=a/10;
		}
		System.out.println("The reverse Number Is :"+rem);
	}

}
