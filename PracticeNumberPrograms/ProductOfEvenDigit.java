//WAJP TO FIND PRODUCT OF EVEN DIGIT

package com.Inheritance;

public class ProductOfEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num=1234;
		 int product=1;
		 
		 while(num!=0) {
			 int last=num%10;
			 if(last%2==0) {
				 product=product*last;				 
			 }
			 num=num/10;
			 
		 }
		 System.out.println(product);

	}
}
