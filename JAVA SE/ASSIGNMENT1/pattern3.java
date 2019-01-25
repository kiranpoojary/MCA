import java.io.*;
class Pattern3
{
	public static void main(String[] args) 
	{
		int i,j,f1,f2,f3;
		for(i=1;i<=10;i++)
		{
			f1=0;
			f2=1;
			System.out.print(f2+" ");
			for(j=1;j<i;j++)
			{  
				f3=f1+f2;		
				System.out.print(f3+" ");
				f1=f2;
				f2=f3;
			
			}
			System.out.println();
		}
	}
}