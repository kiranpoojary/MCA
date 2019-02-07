import java.io.*;
import java.util.*;
class Some
{
	public static void main(String[] args)
	{
		some(10,25);
		some(10,25,30);
		some(10,25,30,40);
		some(10,25,30,40,65);
		some(10,25,30,40,65,70);
	}
	static void some(int... m)
	{
		int total=0;
		float avg,count=0;
		for(int var:m)
		{
           total+=var;
           count++;
		}
		avg=total/count;
		System.out.println("Total    :"+total);
		System.out.println("Average  :"+avg);
		
		
	}
}