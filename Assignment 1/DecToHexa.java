// Assignment 1 :Que 20

import java.util.Scanner;

class DecToHexa
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("Enter Decimal Number : ");
		num = sc.nextInt();
		
		String hexa = toHexa(num);
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