import java.util.Scanner;
class DifferentTry3
{
  public static void main(String[] args)
  {
    int[] a={1,2,3,4,5};
    int sum=0,i=0;
    try
    {
      System.out.println("Connection opened with server");
      System.out.println("server file opened");

      for( i=0;i<=5;i++)
         sum+=a[i];
       System.out.println("Sum  :"+sum);
      
    }
     finally
    {
      System.out.println("Finally:close all opened connection and files");
      
      

    }
   
  }
}