import java.io.*;
import java.util.Scanner;
class Mobiles
{
	public void showCommon()
	{
		System.out.println("Touch Screen            :Yes");
		System.out.println("Fingert Print Sensor    :Yes");
		System.out.println("User Removable Battery  :No");
		System.out.println("Water Resistant         :No");
		
	}

}


class Samsung extends Mobiles
{
	public void showSamsung()
	{
		System.out.println("Brand Name               :SAMSUNG");
		System.out.println("Offer Accessories        :Samsung Head Phone");
	}

}

class Micromax extends Mobiles
{
	public void showMicromax()
	{
		System.out.println("Brand Name               :MICROMAX");
		System.out.println("Offer Accessories        :Micromax Powert Bank");
	}

}

class SamsungS10 extends Samsung
{
	public void showsS10()
	{
		System.out.println("Screen Size              :5.5 Inch");
		System.out.println("Camere primary/front     :16MP/8Mp");
		System.out.println("RAM and ROM 	     :4Gb/64Gb");
		System.out.println("Battery Capacity         :4200MaH");
		System.out.println("Price           	     :Rs.14,999");
	}

}

class Micromaxinfinity12 extends Micromax
{
	public void showInfinity()
	{
		System.out.println("Screen Size              :5.0 Inch");
		System.out.println("Camere primary/front     :12MP/5Mp");
		System.out.println("RAM and ROM 	     :3Gb/32Gb");
		System.out.println("Battery Capacity         :3500MaH");
		System.out.println("Price           	     :Rs.11,999");

	}


}

class Welcomecustomer
{
	public static void main(String[] args)
	{
		 System.out.println("***********************************************************************");
		 SamsungS10 m1=new SamsungS10();
		 m1.showSamsung();
		 m1.showCommon();
		 m1.showsS10();
		 System.out.println("***********************************************************************");
		 Micromaxinfinity12 m2=new Micromaxinfinity12();
		 m2.showMicromax();
		 m2.showCommon();
		 m2.showInfinity();

	}
}
