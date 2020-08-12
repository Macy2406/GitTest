package com.con.arm;

public class ArmstrongPrint {
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) {
		int  a, rem = 0, arm = 0;
		a = i;
		while (a > 0) {
			rem = a % 10;
			arm = arm + (rem * rem * rem);
			a = a / 10;
		}if(i==arm) {
		System.out.println("Armstrong Number Is : " + arm);
		}
		}
	}
	
}
