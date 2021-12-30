package com.bridgelab.logicalprograms;

import java.util.Scanner;

public class LogicalProgram {
	Scanner sc = new Scanner(System.in);
	public static int FirstNum1;
	public static int SecondNum2;
	public static int Number;
	public static int Flag;

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
		LogicalProgram obj=new LogicalProgram();
		obj.primeNumber();
	}
	
	public void primeNumber() {
		 Flag=0;
		System.out.print("Enter a Number To Check Prime Or Not:");
		Number=sc.nextInt();
		if(Number == 1 || Number == 0) {
			System.out.println("Its not a Prime Number");
			Flag=1;
		}else if(Number==2) {
			System.out.println("Its Even Prime Number");
		}else {
			for(int i=2; i<Number; i++) {
				if(Number%i==0) {
					System.out.println(Number +" "+"is not Prime Number");
					Flag=1;
					break;
				}
			}
		}
		if(Flag==0) {
			System.out.println(Number+" "+ "is Prime Number");
		}
	}
}
