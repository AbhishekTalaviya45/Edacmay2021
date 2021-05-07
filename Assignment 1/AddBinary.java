// Assignment 1 :Que 17

import java.util.Scanner;

class AddBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Enter  First Binary : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter  Second Binary : ");
		num2 = sc.nextInt();
				
		int dec1 = tobinary1(num1);
		int dec2 = tobinary2(num2);
		
		int decimal = dec1 + dec2;
		
		long binary = convertDecimalToBinary(decimal);
		System.out.println(num1 + " + " + num2 + " = " + binary);
		
		
	}
	
	public static int tobinary1(int n)
	{
		int dec = 0;
		int temp = n;
		int power = 0;
		
		while(temp>0)
		{
			int rem = temp%10;
			temp = temp/10;
			dec = dec + rem * (int) Math.pow(2,power++);
		}
		return dec;
	}
	
	public static int tobinary2(int n)
	{
		int dec = 0;
		int temp = n;
		int power = 0;
		
		while(temp>0)
		{
			int rem = temp%10;
			temp = temp/10;
			dec = dec + rem * (int) Math.pow(2,power++);
		}
		return dec;
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