import java.io.*;
import java.util.Scanner;
class Numbers
{
	public static void main(String args[])
	{
		int i,n,j,t;
		int slarge=0,ssmall=0;
		int[] arr=new int[20];
		 Scanner scan=new Scanner(System.in);
        System.out.println("enter number of elements");
        n=scan.nextInt();
        System.out.println("enter numbers");   
        for(i=0;i<n;i++)
        	 arr[i]=scan.nextInt();
        	for(i=0;i<n;i++)
        	{
        		for(j=0;j<n-1;j++)
        		{
        			if(arr[j]>arr[j+1])
        			{
        				t=arr[j];
        				arr[j]=arr[j+1];
        				arr[j+1]=t;
        			}
        	}
        }
   
     for(i=0;i<n;i++)
    {
    	if(arr[i]==arr[i+1])
    	{
    		continue;
    	}
    	else
    	{
    		slarge=arr[i+1];
    		break;
    	}
	}



	 for(i=n-1;i>0;i--)
    {
    	if(arr[i]==arr[i-1])
    	{
    		continue;
    	}
    	else
    	{
    		ssmall=arr[i-1];
    		break;
    	}
	}
	System.out.println("Second largest number is  :"+slarge);
	System.out.println("Second smallest number is :"+ssmall);

    }
}