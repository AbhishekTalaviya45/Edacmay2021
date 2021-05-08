class Pattern5
{
	public static void main(String args[])
	{
		int i,j;
		int k = 65;
		char a = (char)k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(a);
			}
			a++;
			System.out.println();
		}
	}
}