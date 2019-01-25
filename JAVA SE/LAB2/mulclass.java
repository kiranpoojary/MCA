import java.io.*;
class First
{
	First(int val)
	{
		System.out.println("In First class constructor and value:"+val);
	}
}

class Second
{
	Second(int val)
	{
		System.out.println("In Second class constructor and value:"+val);
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
		First f1= new First(10);
        Second s1=new Second(100);
	}
}