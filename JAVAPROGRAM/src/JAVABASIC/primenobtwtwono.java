package JAVABASIC;

import java.util.Scanner;

public class primenobtwtwono {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=scn.nextInt();
		System.out.println("Enter 2nd number");
		int b=scn.nextInt();
		boolean num=false;
		for(int i=a;i<=b;i++)
		{
	 num=checkprimenumber(i);
	if(num==true)
	{
		System.out.print(i+",");
	}
		}

	}
	public static boolean checkprimenumber(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
