package lab;

import java.util.Scanner;

/**
 * @author KIRAN
 *
 */
public class Compound_Interest {
	public static void main(String[] args) {
		double principle, rate , time ;
		int n; 
		double[] arr=new double[20];
		double sum=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle");
		principle=sc.nextDouble();
		System.out.println("Enter rate");
		rate=sc.nextDouble();
		System.out.println("Enter Time");
		time=sc.nextDouble();
		System.out.println("Total No. of Compound");
		n=sc.nextInt();
		  
        /* Calculate compound interest */
        double CI = principle * (Math.pow((1 + rate / n), n*time)); 
          
        System.out.println("Compound Interest is "+ CI); 
	
	}

}
