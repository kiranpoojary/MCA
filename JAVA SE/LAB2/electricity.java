import java.io.*;
import java.util.*;
class Bill
{
   public static void main(String[] args) 
   {
   	int current,previous,totunit,min=50;
   	double amt=0.0,totamt=0.0,slab1,slab2,slab3;

   	Scanner scan = new Scanner(System.in);
        System.out.print("Enter pre reading: ");
        previous = scan.nextInt();
        System.out.print("Enter current reading: ");
        current = scan.nextInt();
        scan.close();
        totunit=current-previous;
        slab1=99*1.2;
        slab2=100*2.1;
        slab3=100*3.5;
        if(totunit>=300)
        {
        	amt=slab1+slab2+slab3+((totunit-299)*4.2);
        }
        else
        	if(totunit>=200)
        {
        	amt=slab1+slab2+((totunit-199)*3.5);
        }
        else
        	if(totunit>=100)
        {
        	amt=slab1+((totunit-99)*2.1);
        }
        else
        	if(totunit>=1)
        {
        	amt=((totunit)*1.2);
        }
        totamt=amt+min;
        System.out.print("total amount to pay :"+totamt);



	}
}