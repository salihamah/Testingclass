package JAVABASIC;

import java.util.Scanner;

public class switchcasestatement {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter half year");
		int a=scn.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");	
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
			
			default:
				System.out.println("Invalid input");
		}

	}

}
