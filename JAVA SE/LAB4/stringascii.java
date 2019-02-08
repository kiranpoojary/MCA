import java.io.*;
import java.util.*;
class Ascii
{
	public static void main(String[] args)
	{
		String text="my name is not agentx"; 
		int i,j,count=0;
		int a[][]=new int[50][50];
		count=text.length();	
		char ch;
		int col=0,row=0,maxcol=0,maxrow=0;
		for(i=0;i<count;i++)
		{  
			ch=text.charAt(i);

			if(Character.isSpace(ch))
			{
				row++;
				col=0;
				continue;
			}
           a[row][col]=text.charAt(i);
           col++;
           if(maxcol<col)
				{
					maxcol=col;
				}			
		}	

		for(i=0;i<=row;i++)
			
		{
			for(j=0;j<maxcol;j++)
				{
                    if(a[i][j]!=0)
					System.out.print(a[i][j]+"  ");
					System.out.print("  ");				
				}
			System.out.println();
        }
	}
}	
