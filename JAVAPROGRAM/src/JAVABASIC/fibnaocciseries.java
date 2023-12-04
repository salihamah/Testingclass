package JAVABASIC;

import java.util.Scanner;

public class fibnaocciseries {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=scn.nextInt();
	System.out.println("Enter second number");
	int b=scn.nextInt();
	System.out.println("Enter series");
	int n=scn.nextInt();
	System.out.print(a+" ");
	System.out.print(b+" ");
	
	for (int i=1;i<=n;i++)
	{
	int c=a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
	}

}
}