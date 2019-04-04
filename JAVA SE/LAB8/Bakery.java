import java.util.Scanner;
interface Bakery
{
	String[] items={"","cupcake","oreo","jamoon","bread","cake"};
	int[] itemsrate={0,25,55,85,20,350};
	void login();
	void counter1();
	void printBill();
	void store(int count,int itemid,int qty);

}




class AmmaBakery implements Bakery
{
	
	static Scanner scan = new Scanner(System.in);
	static String[] purchaseditem=new String[10];
	static int[]  purchasedqty=new int[10];
	static int[] purchasedtot=new int[10];
	static int[] purchaserate=new int[10];	
    static int total=0;
   	static int bill=0,itemid=0,cont=1,qty=0;
	static int count=0;
	static int collection=0;
	static String userid="kiran";
	static String password="123";

	public void login()
	{
		System.out.println("Enter UserID");
		String inputid=scan.nextLine();
		System.out.println("Enter Password");
		String inputpassword=scan.nextLine();
		if (userid.equals(inputid) && password.equals(inputpassword))
		{
			counter1();
			
		}
		else
		{
			System.out.println("Invalid Password or UserID");
			login();

		}



	}
	public void counter1()
	{
		do
		{
			do
			{
				for(int i=1;i<=5;i++)
				{
					System.out.println(i+"."+items[i]);

				}

				itemid=scan.nextInt();
				System.out.println("enter quantity");
				qty=scan.nextInt();
				count++;
				store(count,itemid,qty); 	                                 
				System.out.println("enter 1 to continue 0 to print bill");
				cont=scan.nextInt();		
			}
			while(cont==1);
			System.out.println("--------------------------------------------------");
			System.out.println("sl       Item         QTY      RATE     TOTAL");
			System.out.println("--------------------------------------------------");
			printBill();
			System.out.println("enter 1 to Next Billing 0 to Close Counter");
			cont=scan.nextInt();
		}
		while(cont==1);
	}


	public void store(int count,int itemid,int qty)
	{
		
		
		if(itemid>0&&itemid<6)
		{

			
				total=itemsrate[itemid]*qty;
				purchaseditem[count]=items[itemid];
				purchasedqty[count]=qty;
				purchaserate[count]=itemsrate[itemid];
				purchasedtot[count]=total;				
				
		}
		else
		{
			System.out.println("Invalid Item ID");
			AmmaBakery.count--;
		}

	}


public void printBill()
	{
		int grandtot=0;
		for(int i=1;i<=count;i++)
		{
			grandtot+=purchasedtot[i];
			System.out.printf("%-8d %-12s %-8d %-8d %-8d ",i,purchaseditem[i],purchasedqty[i],purchaserate[i],purchasedtot[i]);
			System.out.println();	
                
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Grand Total                             "+grandtot);
		System.out.println("--------------------------------------------------");
		collection+=grandtot;
		AmmaBakery.count=0;
		
	}	

    public static void main(String[] args)
    {		
		AmmaBakery open=new AmmaBakery();
		open.login();
		System.out.println("Total Collection Of the Day		"+collection);
		
    }

}

