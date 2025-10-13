//WAJP TO FIND FACTORIAL OF GIVEN NUMBER (5)

package com.Inheritance;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num=5;
		int fact=1;
		for(int i=1;i<num;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of "+num+" is "+fact);

	}
}

//WAY 2
/* int num=5;
int fact=1;
while(num!=0){
fact=fact*num;
num--;

}
System.out.printlin(fact);
}
}*/