//WAJP TO PRINT THE EVEN POSITON IN REVERSE ORDER

package com.Practice;

public class PrintEvenPositionInReverseOrder {

	public static void main(String[] args) {
		evenPositionInReverseOrder(32456);//  Rev--->65423
	}
	public static void evenPositionInReverseOrder(int num) {
		int count=0;
		while(num!=0) {
			count++;
			if(count%2==0) {
				System.out.println((num%10));
			}
			num=num/10;
		}
		
	}

}
