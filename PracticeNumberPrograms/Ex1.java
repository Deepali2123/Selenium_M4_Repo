package com.Inheritance;

import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value");
		int num =s.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}		
	}
}
