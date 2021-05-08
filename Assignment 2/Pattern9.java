class Pattern9
{
	public static void main(String args[])
	{
		char i,j,k;
		char a='A';
		for(i='A';i<='E';i++)
		{
			for(j='D';j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k='A';k<=i;k++)
			{
				System.out.print(k + " ");
				
			}
			
			System.out.println();
		}
	}
}