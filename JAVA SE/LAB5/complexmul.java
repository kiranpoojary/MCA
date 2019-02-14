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
		Complex c1=new Complex(4,2);
		Complex c2= new Complex(3,7);
		Complex c3=new Complex(0,0);
		c3=mul(c1,c2);
		System.out.println("Complex multiplication result  :"+c3.real+"i"+c3.img);
	}
}