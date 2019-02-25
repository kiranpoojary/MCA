import java.io.*;
import java.util.Scanner;

class Numbers
{
		static Scanner scan= new Scanner(System.in);
        static int num;
    	static String[] units={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
                             "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        static String[] tens={"zero","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"}; 
    	
    	public static void getInput()
    	{
    		do
    		{   			
    			System.out.println("enter a integer number between 1 to 99");
    			num=scan.nextInt();
    		}while(num<0 || num>99);

    	} 

    	public static void inWords()
    	{
    		if(num<20)
    		{
    			System.out.println(units[num]);
    		}
    		else
    			System.out.println(tens[num/10]+units[num%10]);
    		

    	}

}

class mainMethod
{
public static void main(String arge[])
{
	Numbers obj=new Numbers();
	obj.getInput();
	obj.inWords();
} 
}    