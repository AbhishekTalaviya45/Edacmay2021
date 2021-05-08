class Pattern13
{
	public static void main(String args[])
	{
		int i,j,k;
		char a='A';
		for(i=5;i>=1;i--)
		{
			for(j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=5;k>=i;k--)
			{
				System.out.print(a + " ");
			}
			a++;
			System.out.println();
		}
	}
}