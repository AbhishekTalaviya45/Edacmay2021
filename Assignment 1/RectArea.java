// Assignment 1 :Que 13

import java.util.Scanner;

class RectArea
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float h, w, Area,Perimeter;
		
		System.out.println("Enter Height : ");
		h = sc.nextFloat();
		
		System.out.println("Enter Width : ");
		w = sc.nextFloat();
		
		Area = h * w;
		Perimeter = 2 * (h + w);
		
		System.out.println("Area is : " + String.format("%.2f",Area));
		System.out.println("Perimeter is : " +  String.format("%.2f",Perimeter));
		
		
	}
}