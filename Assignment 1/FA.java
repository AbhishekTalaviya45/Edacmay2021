// Assignment 1 :Que 14

class FA
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i%2==1)
				{
					System.out.print("* ");
				}
				else if(j!=6&&i%2==0)
				{
					System.out.print(" *");
				}
				else if(j==6)
				{
					System.out.print("  ");
				}
			}
			for(int k=1;k<=34;k++)
			{
				System.out.print("=");
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=46;j++)
			{
				System.out.print("=");
			}
			System.out.println();
		}
		
	}
}