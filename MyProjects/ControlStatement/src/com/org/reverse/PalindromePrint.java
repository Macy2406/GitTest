package com.org.reverse;

public class PalindromePrint {
	public static void main(String[] args) {
		for (int x = 0; x <= 100; x++) {
			int rem = 0, b, a;
			a = x;
			while (a > 0) {
				b = a % 10;
				rem = (rem * 10 + b);
				a = a / 10;
			}
			if (x==rem) {
				System.out.println("Palindrome Num Is : " + rem);
			}
		}
		
	}

}
