
package com.con.state;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		long a = sc.nextLong();
		long c=1;
		for(int b=1;b<=a;b++){
			c = c * b;
		}
		System.out.println(c);
	}

}
