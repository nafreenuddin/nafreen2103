package com;

public class Reverse {
	public static void main(String[] args) {
		int number = 1234;
		int reverse = 0;
		String s = " ";
		while(number != 0)
		{
			int pick_last = number % 10;
			s = s + Integer.toString(pick_last);
			number = number / 10;	
		}
		System.out.print("Reserve result of a given number :  "+  s);
	}

}
