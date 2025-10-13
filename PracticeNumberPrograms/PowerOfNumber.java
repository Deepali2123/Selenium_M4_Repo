//WAJP TO FIND POWER OF GIVEN NUMBER

package com.Inheritance;

public class PowerOfNumber {

	public static void main(String[] args) {
		int num=2;
		int pow=3;
		int res=1;
		
		while(pow>0) {
			res=res*num;
			pow--;
		}
		System.out.println(res);
	}

}
