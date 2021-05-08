class FullPyramid
{
	public static void main(String args[])
	{
		int i, j, k;
		
		for(i=6;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=6;k>=i;k--)
			{
				System.out.print("* ");
		    }
			
			System.out.println();
		}
	}
}