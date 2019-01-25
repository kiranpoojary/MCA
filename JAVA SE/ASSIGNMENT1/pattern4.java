import java.io.*;
class Pattern4
{
	public static void main(String[] args) 
	{
		int i,j,num;
		{
			
			for(i=1;i<=10;i++)
			{  
				num=1;	
				for(j=1;j<=i;j++)
				{
					num=num*j;
					System.out.print(num+" ");

				}
			System.out.println();
			}
			
		}
	}
}