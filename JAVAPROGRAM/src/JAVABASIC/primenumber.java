package JAVABASIC;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();
		int a=1;
		for(int i=2;i<n;i++)
		{
			if(n%1==0)
			{
				a=0;
				break;
			}
		}
		if (a==1)
		{
		System.out.println(n+" is a prime number");
		}else
		{
			System.out.println(n+" is not a prime number");
		}
		}
	{
}
}