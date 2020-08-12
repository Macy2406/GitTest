package com.org.reverse;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int x = sc.nextInt();
		int rem = 0, b,a;
		a=x;
		while (a > 0) {
			b = a % 10;
			rem = (rem * 10 + b);
			a = a / 10;
		}
		if (x == rem) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome Number");
		}

	}
}
