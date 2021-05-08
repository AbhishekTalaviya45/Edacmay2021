class HollowInvertedHalfPyramid
{
	public static void main(String args[])
	{
		int i, j, k;
		
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(i==5 || j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.print("*");
			System.out.println();
		}
		System.out.print("*");
	}
}