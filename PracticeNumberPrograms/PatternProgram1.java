package com.Inheritance;
import java.util.Scanner;
public class PatternProgram1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}		
	}
}



/*  import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for (int i=1;i<=num;i++)//this is for rows
		{
			for (int j=1;j<=num;j++)//this is for columns
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
} */
