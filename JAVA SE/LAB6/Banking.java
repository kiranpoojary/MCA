import java.io.*;
import java.util.Scanner;
class Bank
{
	Scanner scan=new Scanner(System.in);
	int accno;
	String cust_name;
	public void custInfo()
	{
		System.out.println("enter customer name ");
		cust_name=scan.nextLine();
		System.out.println("enter customer Account No. ");
		accno=scan.nextInt();
	} 

	public void showCustInfo()
	{
		System.out.println("customer Name  :"+cust_name);
		System.out.println("customer Account No.   :"+accno);

	}

}

class Loan extends Bank
{
	int laccno;
	String loantype;
	public void getLoanInfo()
	{
		
		System.out.println("enter loan Account No. ");
		laccno=scan.nextInt();
		scan.nextLine();
		System.out.println("enter loantype ");
		loantype=scan.nextLine();
	}

	public void showLoanInfo()
	{
		System.out.println("Loan type   :"+loantype);
		System.out.println("Loan Account No.   :"+laccno);

	}

}

class Vloan extends Loan
{
	String vno;
	int vlamt;
	public void getVloan()
	{
		System.out.println("enter Vehicle No.");
		vno=scan.nextLine();
		scan.nextLine();
		System.out.println("enter vehicle loan amount ");
		vlamt=scan.nextInt();
	}

	public void showVLloan()
	{
		System.out.println("Vehicle No.   :"+vno);
		System.out.println("vehicle loan amount   :"+vlamt);

	}

}

class Hloan extends Loan
{
	String hno;
	int hlamt;
	public void getHloan()
	{
		System.out.println("enter home loan amount ");
		hlamt=scan.nextInt();
		scan.nextLine();
		System.out.println("enter Home No.");
		hno=scan.nextLine();
	}

	public void showHLloan()
	{
		System.out.println("Home No.   :"+hno);
		System.out.println("Home Loan Ammount   :"+hlamt);

	}
}

class Ploan extends Loan
{
	String adhar;
	int plamt;
	public void getPloan()
	{
		System.out.println("enter Customer Adhar No.");
		adhar=scan.nextLine();
		scan.nextLine();
		System.out.println("enter personal loan amount ");
		plamt=scan.nextInt();
	}

	public void showPLloan()
	{
		System.out.println("Customer adhar No.   :"+adhar);
		System.out.println("personal loan amount  :"+plamt);

	}
}

class SBI
{
	public static void main(String[] args) 
	{
		Hloan loanid1=new Hloan();
		loanid1.custInfo();
		loanid1.getLoanInfo();
		loanid1.getHloan();
		loanid1.showCustInfo();
		loanid1.showLoanInfo();
		loanid1.showHLloan();
	}
}
