package com.Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		reversePrintEvenNum(2385);
	
	}
	public static void reversePrintEvenNum(int num) {
		int rem=0;
		while(num!=0) {
			rem=num%10;
			/*if(rem%2==0) {
				System.out.println(rem);
			}*/
			num=num/10;
			//System.out.print(rem);
			if(rem%2==0) {
				System.out.println(rem);
			}
		}
	}

}

/* num=num/10;
 * if(num%2==0)
 */

