// Assignment 1 :Que 23

import java.util.Scanner;

class BitoHexa
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
		
		String hexa = toHexa(dec);
		System.out.println("HexaDecimal of " + num + " is = " + hexa);
	}
	
	public static String toHexa(int n)
	{
		int rem;
		String hex="";
		char hexa1[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(n>0)
		{
			rem = n % 16;
			hex = hexa1[rem] + hex;
			n = n/16;
		}
		return hex;
	}
}