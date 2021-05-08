class InvertedPyramidPattern6

{
	public static void main(String args[])
	{
		int i, j, k;
		
		for(i=9;i>=1;i--)
		{
			for(j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}