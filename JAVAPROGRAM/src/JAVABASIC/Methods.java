package JAVABASIC;

import java.util.Scanner;

public class Methods {
	public static void addition(int a,int b) {
		System.out.println(a+b);
				
	}
	

	public static void main(String[] args) {
		System.out.println("Main starts");
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a=scn.nextInt();
		
		System.out.println("Enter 2nd number");
		int b=scn.nextInt();
		
		addition(a,b);
		m1();
		System.out.println("Main ends");
	

	}
	static void m1() {
		System.out.println("m1 method");
	}
}
