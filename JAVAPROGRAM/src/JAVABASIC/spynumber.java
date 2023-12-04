package JAVABASIC;

import java.util.Scanner;

public class spynumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();
		int a=n;
		sum=0;
		product=1;
		
		while (a>0)
		{
			r=a%10;
			sum= sum+r;
			product=product*r;
			n=a/10;
		}
		if(sum==product)
			System.out.println(a+ "Given number is spy number");
		else System.out.println(a+ "Given number is not spy number");
	}

}
