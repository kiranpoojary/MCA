import java.io.*;

class Pattern5
{
    public static void main(String args[])
    {
       long i,j=1,k,n=9;
     
     for(i=1;i<=n;i++)
     {
        for(k=1;k<=n-i;k++)
        {
         System.out.print(" "); 
        }
       System.out.println(j*j);
        j=j+(int)Math.pow(10,i);       
         System.out.println();
     }
 }

}
