import java.util.Scanner;
class Bound
{
  public static void main(String[] args)
  {
    int[] a={1,2,3,4,5};
    int sum=0,i=0;
    try
    {
      for( i=0;i<=5;i++)
         sum+=a[i];
       System.out.println("Sum  :"+sum);
      
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Array Index Out Of Bound");

    }
  }
}