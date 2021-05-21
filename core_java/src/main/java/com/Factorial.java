package com;

public class Factorial {
	public static void main(String[] args) {
		int number = 4;
		if(number >= 0)
		{
			int fac = 1;
			for(int i = number ; i >= 1 ; i--)
			fac = fac * i;
			System.out.println("Factorial of "+number+" is : "+fac);
			
		}
		else
			System.out.println("Value is not defined, please re-enter the value");
	}

}
