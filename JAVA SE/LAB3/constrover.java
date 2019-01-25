import java.io.*;
class Constrclass
{
	
	Constrclass()
	{
     System.out.println("in deafault constructor");
	}

	Constrclass(int a)
	{
		System.out.println("in one argument(int) constructor:value recieved :"+a);

	}

    Constrclass(double a)
	{
		System.out.println("in one argument(double) constructor:value recieved :"+a);

	}
	Constrclass(int a, int b)
	{
		System.out.println("in two(int,int) argument constructor:value recieved :"+a+" "+b);
	}

	
}
class Mainclass31
{
	public static void main(String args[])
	{
     Constrclass obj1=new Constrclass();
     Constrclass obj2=new Constrclass(10);
     Constrclass obj3=new Constrclass(3.142);
     Constrclass obj4=new Constrclass(10,100);
     
	}
}