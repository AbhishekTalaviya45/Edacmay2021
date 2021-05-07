// Assignment 1 :Que 15

import java.util.Scanner;

class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j,temp;
		
		System.out.println("Enter first number : ");
		i = sc.nextInt();
		System.out.println("Enter second number : ");
		j = sc.nextInt();
		
		System.out.println("i before swap : " + i);
		System.out.println("j before swap : " + j);
		
		temp = i;
		i = j;
		j = temp;
		
		System.out.println("i after swap : " + i);
		System.out.println("j after swap : " + j);
		
		
	}
}