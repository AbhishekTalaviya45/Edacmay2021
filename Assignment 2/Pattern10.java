class Pattern10
{
	public static void main(String args[])
	{	
		int a = 69;
		int b = 1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print((char)(a++));
			}
			a--;
			a = a - b;
			b++;
			System.out.println();
		}
	}
}