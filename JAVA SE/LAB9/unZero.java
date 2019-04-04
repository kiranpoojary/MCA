
class Zero
{
   public static void main(String[] args)
   {
      int number1 = 3000;
      int number2 = 0;
      int result=0;
      try {
         result=number1 / number2;
      }
      catch (ArithmeticException e)
      {
         System.out.println("Division by zero.");
      }
   }
}