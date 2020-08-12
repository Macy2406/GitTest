package com.con.arm;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int  a, rem = 0, arm = 0;
		a = n;
		while (a > 0) {
			rem = a % 10;
			arm = arm + (rem * rem * rem);
			a = a / 10;
		}
		if (n == arm) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not a Armstrong");
		}
	}

}
