class PyramidPattern4
{
	public static void main(String args[])
	{
		int i, j, k, l;
		int a = 1;
		int b = 1;
		
		for(i=1;i<=9;i++)
		{
			for(j=9;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(k + " ");
			}
			for(l=2;l<=i;l++)
			{
				System.out.print(a-- + " ");
			}
			
			if(i>1)
			{
			a++;
			a = a + b;
			b++;
			
			}
			System.out.println();
		}
	}
}