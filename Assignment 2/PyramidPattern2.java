class PyramidPattern2

{
	public static void main(String args[])
	{
		int i, j, k;
		
		for(i=1;i<=9;i++)
		{
			for(j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}