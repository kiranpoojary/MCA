import java.util.Scanner;
class NullPointer
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String name=null;
    try
    {
      System.out.println("Name Size is "+name.length());
    }
    catch(NullPointerException e)
    {
      System.out.println("NullPointerException Occured");

    }
  }
}