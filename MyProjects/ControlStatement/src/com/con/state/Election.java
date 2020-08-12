package com.con.state;

import java.util.Scanner;

public class Election {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int a = s.nextInt();
		if (a >= 18) {
			System.out.println("Eligible For Vote");
		} else {
			System.out.println("Not Eligible");
		}
	}
}
