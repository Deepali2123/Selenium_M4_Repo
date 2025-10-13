package com.Practice;

public class ReverseNumberAndPrintEvenNumber {

	public static void main(String[] args) {
		reverseAndPrintEvenNum(2163);
	}
	public static void reverseAndPrintEvenNum(int num) {
		int rem=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			if(rem%2==0) {
				System.out.println(rem);
			}
		}
	}
}
