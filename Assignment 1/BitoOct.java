// Assignment 1 :Que 24

import java.util.Scanner;

class BitoOct
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num; 
		System.out.println("Enter binary number : ");
		num = sc.nextInt();
		
		int dec = 0;
		int temp = num;
		int power = 0;
		
		while(temp>0)
		{
			int rem = temp%10;
			temp = temp/10;
			dec = dec + rem * (int) Math.pow(2,power++);
		}
		int Oct = toOct(dec);
		System.out.println("Octal number of " + num + " = " + Oct);
		
	}
	public static int toOct(int n)
	{
		
		int decimal = 0;
		int temp = n;
		int power = 0;
		
		while(temp>0)
		{
			int rem = temp%8;
			temp = temp/8;
			decimal = decimal + rem * (int) Math.pow(10,power++);
		}
		return decimal;
	}
}