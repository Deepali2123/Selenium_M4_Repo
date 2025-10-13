package com.Practice;

public class Special2DigitsNumberOrNot {

	public static void main(String[] args) {
		spcial2Digits(21);

	}
	public static void spcial2Digits(int num) {
		int last=num%10;
		int first=num/10;
		
		int res=(last*first)+(last+first);
		if(res==num) {
			System.out.println("It is a special two digits number");
		}else {
			System.out.println("It is a not special two digits number ");
		}
		
		
	}

}



