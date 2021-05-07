// Assignment 1 :Que 11

import java.util.Scanner;

class Area
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, p, r;
		System.out.println("Enter Radius : ");
		
		r = sc.nextDouble();
		a = 3.14 * r * r;
		p = 2 * 3.14 * r;
		System.out.println("Area is = " + String.format("%.20f", a));
		System.out.println("Perimeter is = " + String.format("%.20f", p));
	}
}
