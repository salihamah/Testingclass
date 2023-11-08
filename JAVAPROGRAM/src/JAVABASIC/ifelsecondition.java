package JAVABASIC;

import java.util.Scanner;

public class ifelsecondition {

	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter imput value");
		int a=scn.nextInt();
		if (a%2==0)
		{
			System.out.println(a+"is an even number");
		}else {
			System.out.println(a+"is an odd number");
		}
		
		

	}

}
