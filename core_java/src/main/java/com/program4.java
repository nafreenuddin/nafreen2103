package com;

public class program4 {
	public static void main(String[] args) {
		int n = 23;
		int count=0;
		for(int i = 1 ; i <=n ; i++)	
		{	
			if(n % i == 0)			
			count=count+1;
		}
		if(count == 2)		                        
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime Number");
	}
}
