import java.io.*;
import java.lang.Math.*;
class Format
{
	public static void main(String args[])
	{
       long i,j=1;
     
     for(i=1;i<=9;i++)
     {
       System.out.println(j*j);
        j=j+(int)Math.pow(10,i);       
         System.out.println();
     }
 }

}
    
       




       /*class Format
{
	public static void main(String args[])
	{
       double i,j=1;
     
     for(i=1;i<10;i++)
     {
       System.out.printf("%.0f",Math.pow(j,2));
        j=j+Math.pow(10,i);      
         System.out.println();
     }*/