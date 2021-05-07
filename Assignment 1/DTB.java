// Assignment 1 :Que 19

import java.util.Scanner;

class DTB
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter your number : ");
		num = sc.nextInt();
		System.out.println("Decimal to Binary");
		long binary = convertDecimalToBinary(num);
		System.out.println("\n" + num + " = " + binary);
	}

	public static long convertDecimalToBinary(int n) 
	{
		long binaryNumber = 0;
		int remainder, i = 1, step = 1;

		while (n!=0) 
			{
				remainder = n % 2;
				
				n /= 2;
				binaryNumber += remainder * i;
				i *= 10;
			}
    
		return binaryNumber;
    }
}
