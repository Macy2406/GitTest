package com.con.state;

import java.util.Scanner;

public class SwappingNum1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("The Swapping Numbers Are ");
		System.out.println(a);
		System.out.println(b);
	}

}
