class InvertedPyramidPattern7
{
	public static void main(String args[])
	{
		int i,j,k;
		int a=9;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=9;k>=i;k--)
			{
				System.out.print(a+" ");
			}
			a--;
			System.out.println();
		}
	}
}