// Assignment 1 :Que 8

class pattern1
{
	public static void main(String args[])
	{
		int i, j;
		
		for(i=1;i<=2;i++)
		{
			for(j=1;j<=4;j++)
			{
				if(j!=4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("j");
				}
			 }
			 System.out.println();
		 }
		
		for(i=1;i<=2;i++)
		{
			for(j=1;j<=2;j++)
			{
				if(i==j)
				{
					System.out.print("j ");
				}
				else
				{
					System.out.print(" j");
				}
			 }
			System.out.println();
		 }
		 
		 for(i=1;i<=4;i++)
		 {
			 for(j=4;j>=i;j--)
			 {
				 if(i==j)
				 {
					 System.out.print("a");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 for(int m=1;m<=4;m++)
			 {
				 if(i==3)
				 {
					 System.out.print("a");
				 }
			 }
			 for(int k=0;k<=2;k++)
			 {
				 if((i-k)!=2||i==3)
				 {
					 System.out.print("  ");
				 }
				 else
				 {
					 System.out.print(" a");
				 }
			 }
			  System.out.println();
		 }
		 
		 for(i=1;i<=4;i++)
		 {
			 for(j=1;j<=4;j++)
			 {
				 if(i==j)
				 {
					 System.out.print("v");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 for(int k=3;k>=1;k--)
			 {
				 if(i==k)
				 {
					 System.out.print("v");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 
		 for(i=1;i<=4;i++)
		 {
			 for(j=4;j>=i;j--)
			 {
				 if(i==j)
				 {
					 System.out.print("a");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 for(int m=1;m<=4;m++)
			 {
				 if(i==3)
				 {
					 System.out.print("a");
				 }
			 }
			 for(int k=0;k<=2;k++)
			 {
				 if((i-k)!=2||i==3)
				 {
					 System.out.print("  ");
				 }
				 else
				 {
					 System.out.print(" a");
				 }
			 }
			  System.out.println();
		 }
	}
}

