import java.io.*;
class Blocks
{
		
	
	static
	{
		System.out.println("im in static block");
	}

	{
		System.out.println("im in insance block");

	}

	Blocks()
	{
		this(100);
		System.out.println("im in constructor");
		
	}

	Blocks(int num)
	{
		System.out.println("constructor 1.1:received value"+num);
	}
}

 
class Mainclass
{
	public static void main(String args[])
	{
		Blocks first=new Blocks();
	
	}

}