package com.my.project;

import java.util.Scanner;

public class Prime1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		int b = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				b = 1;
				break;
			}
		}
		if (b == 1) {
			System.out.println("Is Not a Prime Number");
		} else {
			System.out.println("Is a Prime Number");
		}
	}

}
