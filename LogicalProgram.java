package com.bridgelab.logicalprograms;

import java.util.Scanner;

public class LogicalProgram {
	public static int FirstNum1;
	public static int SecondNum2;
	public static int Number;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number:");
		FirstNum1=sc.nextInt();
		System.out.print("Enter the Second number:");
		SecondNum2=sc.nextInt();
		System.out.print("Enter the fibonacci series number:");
		Number=sc.nextInt();
		System.out.println("Fibonacci Series Of " + Number + " is:"+" " + FirstNum1 + ","+ SecondNum2);
		for(int i = 1; i<Number; i++) {
			int nextNumber = FirstNum1 + SecondNum2;
			FirstNum1=SecondNum2;
			SecondNum2=nextNumber;
			System.out.println(nextNumber);
		}
	}
}
