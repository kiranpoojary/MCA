import java.io.*;
class ThreadRacing extends Thread
{
	int completed_rounds;
	static int total_rounds=5;
	static int place=0;
	
	ThreadRacing()
	{
		completed_rounds=0;
	}
	
	public void run()
	{
		try
		{
			
			for (int i=1;i<=total_rounds ;i++ )
			{
				this.completed_rounds++;
				//System.out.println("\n"+this.getName()+"--->Round"+i);
				//System.out.println((this.completed_rounds==ThreadRacing.total_rounds)?this.getName():"");
				if(i<5)
				System.out.println(this.getName()+" Round :"+i);
				if(this.completed_rounds==ThreadRacing.total_rounds)
				{
					
					System.out.println(this.getName()+" Completed Roundd "+completed_rounds+" Laps Completed :YES ");

				}
				
			}
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong");
    		
		}
		
	}
}

class MainThread
{
	public static void main(String[] args)
	{
		ThreadRacing car1=new ThreadRacing();
		ThreadRacing car2=new ThreadRacing();
		ThreadRacing car3=new ThreadRacing();
		ThreadRacing car4=new ThreadRacing();
		ThreadRacing car5=new ThreadRacing();
		ThreadRacing car6=new ThreadRacing();
		System.out.println("Car Race Started");
		car1.setName("BMW");
		car2.setName("Ferari");
		car3.setName("RangeRover");
		car4.setName("Forche");
		car5.setName("Bugatti");
		car6.setName("Lamorgini");
		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		car6.start();
		
	}
}