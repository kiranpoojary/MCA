import java.util.Scanner;
class Finally
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
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Array Index Out Of Bound");

    }
    finally
    {
      System.out.println("all opened files are closed");
      System.out.println("server closed now");
      

    }
  }
}