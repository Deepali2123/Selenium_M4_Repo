package com.Practice;

public class CoughtGivenDigits {

	public static void main(String[] args) {
		countDigits(12345678);
	}
	public static void countDigits(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;			
		}
		System.out.println(" The Count is:"+count);
	}

}
