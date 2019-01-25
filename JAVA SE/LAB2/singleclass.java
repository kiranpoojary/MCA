import java.io.*;

class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("Executing first main");
		main(100);
		
       
	}

	public static void main(int a) 
	{
		System.out.println("Executing second main: recieved:"+a);
      
	}
}