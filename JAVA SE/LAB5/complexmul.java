import java.util.Scanner;
class Complex
{
	int real,img;
		Complex(int r,int i)
		{
			this.real=r;
			this.img=i;
		}

	public static Complex mul(Complex c1,Complex c2)
	{
		Complex t=new Complex(0,0);
		t.real=c1.real*c2.real;
		t.img=c1.img*c2.img;
		return t;


	}	

	public static void main(String[] args)
	{
		
		int r1,r2,i1,i2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number1's real part");
		r1=scan.nextInt();
		System.out.println("Enter Number1's Imaginary part");
		i1=scan.nextInt();
		System.out.println("Enter Number2's real part");
		r2=scan.nextInt();
		System.out.println("Enter Number2's Imaginary part");
		i2=scan.nextInt();
		
		Complex c1=new Complex(r1,i1);
		Complex c2= new Complex(r2,i2);
		Complex c3=new Complex(0,0);
		c3=mul(c1,c2);
		System.out.println("Complex multiplication result  :"+c3.real+"i"+c3.img);
	}

	
}