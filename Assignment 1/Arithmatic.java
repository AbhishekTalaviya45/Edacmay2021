// Assignment 1 :Que 6

import java.util.Scanner;

class Arithmatic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("enter first number : ");
		a = sc.nextInt();
		
		System.out.println("enter second number : ");
		b = sc.nextInt();
		
		System.out.println("addition of two number : " + (a+b));
		System.out.println("substraction of two number : " + (a-b));
		System.out.println("multiplication of two number : " + (a*b));
		System.out.println("division of two number : " + (a/b));
		System.out.println("remainder of two number : " + (a%b));
	}
}