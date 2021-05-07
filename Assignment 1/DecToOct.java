// Assignment 1 :Que 21

import java.util.Scanner;

class DecToOct
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num; 
		System.out.println("Enter Decimal number : ");
		num = sc.nextInt();
		
		int dec = 0;
		int temp = num;
		int power = 0;
		
		while(temp>0)
		{
			int rem = temp%8;
			temp = temp/8;
			dec = dec + rem * (int) Math.pow(10,power++);
		}
		System.out.println("Octal number of " + num + " is = " + dec);
		
	}
}