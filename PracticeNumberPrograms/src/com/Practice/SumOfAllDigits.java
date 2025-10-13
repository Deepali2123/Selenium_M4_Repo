//WAJP TO PERFORM SUM OF ALL THE DIGITS


package com.Practice;

public class SumOfAllDigits {

	public static void main(String[] args) {
		sumOfDigits(1234);

	}
	public static void sumOfDigits(int num) {
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
