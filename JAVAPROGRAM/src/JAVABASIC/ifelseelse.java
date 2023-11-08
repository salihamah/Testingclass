package JAVABASIC;

import java.util.Scanner;

public class ifelseelse {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=scn.nextInt();
		System.out.println("Enter 2nd number");
		int b=scn.nextInt();
		if (a>b)
		{System.out.println(a+"is greater than"+b);}
		else if (a<b) {
			System.out.println(a+"is smaller than"+b);
		}else {
			System.out.println(a+"is equal to"+b);
		}
		}
	}


