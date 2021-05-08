class PyramidPattern5
{
	public static void main(String args[])
	{
		int i, j, k, l;
		int a = 9;
		int b = 1;
		int c = 8;
		
		for(i=8;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(k=8;k>=i;k--)
			{
				System.out.print(a++ + " ");
				
			}
			for(l=7;l>=i;l--)
			{
				System.out.print(c-- + " ");
			}
			a--;
			a = a - b; 
			b++;
			c = 8;
			System.out.println();
		}
	}
}