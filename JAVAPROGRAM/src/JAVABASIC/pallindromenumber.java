package JAVABASIC;

import java.util.Scanner;

public class pallindromenumber {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
		int r=n%10;
		sum=sum*10+r;
		n=n/10;
		}
		if(a==sum) {
			System.out.println(a+" is a pallandrome number");
		}else {
			System.out.println(a+" is not a pallandrome number");
		}

	}

}
