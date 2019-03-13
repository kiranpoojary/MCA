abstract class Button
{
static int length=6;
static int height=1;
static String font="Verdhana";
static String style="Bold";			
static int size=11;
static String color="green";

void commonProperties()
{
	System.out.println("length				:"+length);
	System.out.println("height				:"+height);
	System.out.println("font 				:"+font);
	System.out.println("color				:"+color);
	System.out.println("size				:"+size);
	System.out.println("Style 				:"+style);
	

}
abstract void Caption();

}

class Cancellation extends Button
{
void Caption()
{
System.out.println("Properties of Cancellation button");
System.out.println("Button Text 			:Canellation");
}
}

class Registration extends Button
{
void Caption()
{
System.out.println("Properties of registration button");
System.out.println("Button Text 			:Registration");
}
}

class Mainmethod
{
public static void main(String args[])
{
Cancellation c=new Cancellation();
c.Caption();
c.commonProperties();
Registration r=new Registration();
r.Caption();
r.commonProperties();
}
}