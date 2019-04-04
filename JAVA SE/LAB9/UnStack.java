 class Stack
{
     
    
    public static void recursive(int num)
    {
        System.out.println("Number: " + num);
         
        if(num == 0)
            return;
        else
            recursive(num);
    }
  
 /* catch
  {
    System.out.println("Stack Overflow");

  }*/
     
    public static void main(String[] args)
    {
         recursive(5);
    }
}