package com.con.state;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter The Mark");
		int x = a.nextInt();
		if (x <= 100 && x >= 91) {
			System.out.println("S Grade");
		} else if (x <=90 && x >=81 ) {
			System.out.println("A Grade");
		} else if (x <= 80 && x >= 71) {
			System.out.println("B Grade");
		} else if (x<70 && x>=61) {
			System.out.println("C Grade");
		} else if(x<=40&&x>=01){
			System.out.println("Fail");
		}

	}
}
