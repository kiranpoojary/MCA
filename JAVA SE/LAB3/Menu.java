import java.io.*;
import java.util.*;
class Menu
{
	public static void main(String args[])
	{
     int choice,n,next,i,fact=1,f1=0,f2=1,f3;
     Scanner scan = new Scanner(System.in);
     do
     {
     	System.out.println("1.Find Factorial: ");
        System.out.println("2.Find Fibonacci series ");
        System.out.println("Enter your choice");
        choice = scan.nextInt();
       
        if(choice==1)
        {
 		System.out.println("Enter a number to find factorial");
        n = scan.nextInt();
        fact=1;
        for(i=1;i<=n;i++)
        {
           fact=fact*i;
        }
        System.out.println("factorial :"+fact);
      
        }
        
        else
        	
        	if(choice==2)
        	{
        		f1=0;f2=1;
 			System.out.println("Enter range of fibonacci series");
 			 n = scan.nextInt();
 			System.out.print(f1+" "+f2);
       

        for(i=2;i<n;i++)
        {
          f3=f1+f2;
          System.out.print(" "+f3);
          f1=f2;
          f2=f3;
        }
        
        System.out.println();
        	}
        	System.out.println("Press 1 to continue");
        next = scan.nextInt();
     
     }while(next==1);
	}
}