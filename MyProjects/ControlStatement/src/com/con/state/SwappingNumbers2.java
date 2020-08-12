package com.con.state;

import java.util.Scanner;

public class SwappingNumbers2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapping Numbers Are");
		System.out.println(a);
		System.out.println(b);
	}

}
