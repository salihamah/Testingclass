package JAVABASIC;

public class Increments12 {

	public static void main(String[] args) {
	int a=1;
	int b=1;
	
	a=++a + b++;
	b=a++ + ++b;
	System.out.println(a);
	System.out.println(b);

	int x=1;
	int y=1;
	
	x=++x + ++y;
	y=++x + y++;
	System.out.println(x);
	System.out.println(y);
	
	int p=1;
	int q=1;
	int r=1;
	
	p=++p + ++r;
	q=p++ + ++q +r++;
	r=++p + ++q + r++;
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
	
	
	}

}

