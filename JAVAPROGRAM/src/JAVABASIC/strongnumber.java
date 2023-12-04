package JAVABASIC;

import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int p=1;
			int q=1;
			while(p<=r)
			{
				q=q*p;
				p++;
			}
			sum=sum+q;
			n=n/10;
		}
if(a==sum)
{
	System.out.println(a+" is a strong number");
}else {
	System.out.println(a+" is not a strong number");
	
}
	}

}
