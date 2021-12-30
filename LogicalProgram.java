package com.bridgelab.logicalprograms;

import java.util.Arrays;
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
		obj.perfectNumber();
		obj.reverseNumber();
		obj.couponCode();
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
	
	public void perfectNumber() {
		int sumOfDivisor=0;
		System.out.print("Please Enter a Number To Check Perfect Or Not:");
		Number=sc.nextInt();
		for(int i=1; i<Number; i++) {
			if(Number%i == 0) {
				sumOfDivisor=sumOfDivisor+i;
			}
		}
		if(sumOfDivisor == Number) {
			System.out.println(Number +" " +"is Perfect Number");
		}else {
			System.out.println(Number +" "+ "is not Perfect Number");
		}
	}
	
	public void reverseNumber() {
		System.out.println("Enter The Number To Reverse");
		Number=sc.nextInt();
		int reverse=0;
		while(Number>0) {
			int remainder=Number%10;
			reverse=reverse*10+remainder;
			Number=Number/10;
		}
		System.out.println("The reverse of the given number is:"+reverse);
	}
	
	public void couponCode() {
		int numberOfCoupons;
		System.out.print("How Many Coupons You Want:");
		numberOfCoupons=sc.nextInt();
		int [] couponsCodes=new int[numberOfCoupons];
		int countOfCoupons=0;
		System.out.print("Enter a Random Number:");
		Number=sc.nextInt();
		while(countOfCoupons < numberOfCoupons) {
			int randomCoupons = (int) Math.floor(Math.random()*Number);
			boolean couponInCouponsCode=false;
			for(int i=0; i<couponsCodes.length; i++)
			{
				if(randomCoupons == couponsCodes[i]) {
					couponInCouponsCode=true;
				}
			}
			if(!(couponInCouponsCode)) {
				couponsCodes[countOfCoupons++]=randomCoupons;
			}
		}
		System.out.println("These are"+ numberOfCoupons+"coupons you want:"+Arrays.toString(couponsCodes));	
	}
}
