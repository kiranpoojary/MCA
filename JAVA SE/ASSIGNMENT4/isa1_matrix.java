import java.io.*;
class Matrix
{
	public static void main(String args[])
	{
		int m=3,n=4;
		int i,j,smallest,largest;
		int[][] matrix={{1,3,5,9},{4,5,6,7},{7,0,63,8}};

		for(i=0;i<m;i++)
		{
			largest=matrix[i][0];
			smallest=matrix[i][0];
			for(j=1;j<n;j++)
			{
				if(largest<matrix[i][j])
					largest=matrix[i][j];
				else
					if(smallest>matrix[i][j])	
						smallest=matrix[i][j];
			}
			System.out.println("matrix row"+(i+1)+"   largest:"+largest+"   smallest:"+smallest);
		}	
	}
}