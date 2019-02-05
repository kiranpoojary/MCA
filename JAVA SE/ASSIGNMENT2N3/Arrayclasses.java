import java.io.*;
class Arrayclassnames
{
public static void main(String[] args)
{
	short[] a=new short[5];
	int[] b=new int[5];
	long[] c=new long[5];
	char[] d= new char[5];
	float[] e=new float[5];
    double[] f=new double[5];
    String[] g=new String[5];
    boolean[] h=new boolean[5];
	System.out.println(a.getClass().getName());
	System.out.println(b.getClass().getName());
	System.out.println(c.getClass().getName());
	System.out.println(d.getClass().getName());
	System.out.println(e.getClass().getName());
	System.out.println(f.getClass().getName());
	System.out.println(g.getClass().getName());
	System.out.println(h.getClass().getName());

}
}