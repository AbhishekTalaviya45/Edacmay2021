// Assignment 1 :Que 25

import java.util.Scanner;

class OcttoDec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num; 
		System.out.println("Enter octal number : ");
		num = sc.nextInt();
		
		int dec = 0;
		int temp = num;
		int power = 0;
		
		while(temp>0)
		{
			int rem = temp%10;
			temp = temp/10;
			dec = dec + rem * (int) Math.pow(8,power++);
		}
		System.out.println("Decimal of " + num + " is = " + dec);
		
	}
}