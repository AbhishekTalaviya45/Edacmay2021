// Assignment 1 :Que 12

import java.util.Scanner;

class Average
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		float Ave;
		
		System.out.println("Enter first value fo Average : ");
		a = sc.nextInt();
		System.out.println("Enter second value fo Average : ");
		b = sc.nextInt();
		System.out.println("Enter third value fo Average : ");
		c = sc.nextInt();
		
		Ave = (a + b + c)/3;
		
		System.out.println("averge is = " + String.format("%.5f",Ave));
	}
}