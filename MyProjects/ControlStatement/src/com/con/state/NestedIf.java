package com.con.state;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter The Value of X :");
		int x = a.nextInt();
		if (x<=100 && x>=50) {	
			System.out.println("Enter The Value Of X1 :");
			int x1 = a.nextInt();
			if (x1 < 50) {
				System.out.println("X1 Is Valid");
			} else  {
				System.out.println("X1 Is Invalid");
				}
	     	} else {
		     System.out.println("X is Invalid");
	}

}
}
