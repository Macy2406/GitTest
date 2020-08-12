package com.org.reverse;

public class PalinDromeCount {
	public static void main(String[] args) {
		int count = 0;
		for (int x = 0; x <= 100; x++) {
			int rem = 0, b, a;
			a = x;
			while (a > 0) {
				b = a % 10;
				rem = (rem * 10 + b);
				a = a / 10;
			}
			if (x == rem) {
				System.out.println("Palindrome Number Is : " + rem);
				count++;
			}
		}
		System.out.println("Total Palindrome Is :" + count);
	}
}
