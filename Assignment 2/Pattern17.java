class Pattern17
{
	public static void main(String args[])
	{
		int i,j,k;
		k=1;
		
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}