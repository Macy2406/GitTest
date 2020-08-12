package com.con.state;

import java.util.Scanner;

public class SwitchCase {
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The Payment Mode Num : ");
	int x = s.nextInt();
	switch (x) {
	case 1:
		System.out.println("GPAY");
		break;
	case 2:
		System.out.println("PhonePY");
		break;
	case 3:
		System.out.println("Paytm");
		break;
	case 4:
		System.out.println("Neft");
		break;
	case 5:
		System.out.println("AmazonPay");
		break;
		
	default:
		System.err.println("You Have Entered Incorrect Number");
		break;
	}
}

}
