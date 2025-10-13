//WAJP TO FIND THE GIVEN NUMBER IS SPY OR NOT (THE GIVEN NO:123) 1+2+3=6 AND 1*2*3=6

package com.Inheritance;

public class SpyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int product=1;
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			product=product*(num%10);
			num=num/10;
		}
		if(sum==product) {
			System.out.println("It is Spy Number");	
		}
		else {
			System.out.println("It is not Spy Number");
		}
	}

}
