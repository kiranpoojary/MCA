class Island
{
	Island m;
	public static void main(String[] args)
	{
		Island t1=new Island();
		Island t2=new Island();
		Island t3=new Island();
			t1.m=t2;
			t2.m=t3;
			t3.m=t1;
			t1=null;  //not effected
			System.out.println("t1 is null and no Exception");
			t2=null;  //not effected
			System.out.println("t2 is null and no Exception");
			t3=null;  //not effected
			System.out.println("t3 is null and no Exception");
			System.out.println("t1.m =Null shows bellow Exception");
			t1.m=null;  //shows NullPointerException
			

	}
}