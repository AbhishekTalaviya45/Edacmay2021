// Assignment 1 :Que 7

import java.util.Scanner;

class Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		
		System.out.println("Enter any number : ");
		j = sc.nextInt();
		
		for(i=1; i<=10; i++)
		{
			System.out.println(j + "  *  " + i + "  =  " + i*j);
		}
		
	}
}