//WAJP TO CHECK THE GIVEN YEAR IS A LEAP YEAR OR NOT

package com.Inheritance;

public class LeapYearOrNot {

	public static void main(String[] args) {
		
		int year=2023;
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+" Is A Leap Year");
		}
		else {
			System.out.println(year+" Is Not A Leap Year");
		}

	}

}
