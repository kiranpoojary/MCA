import java.io.*;
import java.util.*;
class Matrix
{
	public static void main(String[] args)
	{
		int[][] a=new int[20][20];
		int i,j,m,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rows and column size");
		m=scan.nextInt();
		n=scan.nextInt();
		
		System.out.println("enter matrix values");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=scan.nextInt();

        System.out.println();	
        System.out.println("Changed row");	
		for(i=0;i<m;i++)
		{
			for(j=n-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();		
		}

		 System.out.println();	
		 System.out.println("Changed column");
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();		
		}			

	}
}
