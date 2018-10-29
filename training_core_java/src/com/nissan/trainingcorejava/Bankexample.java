package com.nissan.trainingcorejava;

import java.util.Random;
import java.util.Scanner;

final class Accounts{
	String username;
	int pin;
	int accountType;
	int fd;
	double fd_balance;
	double balance;
	Accounts()
	{
		accountType=0;
		fd=0;
		balance=0;
		fd_balance=0;
	}
	void deposit( double amt)
	{
		this.balance+=amt;
	}
	void changePin(int newpin)
	{
		this.pin=newpin;
	}	
	
	void fd_deposit(double amt)
	{
		this.fd=1;
		this.fd_balance=amt;
	}
}

abstract class Loans{
	abstract void roi(double amt,int yr);
}

class CA extends Loans{
	void roi(double amount, int yr)
	{
		System.out.println("Total Interest for "+yr+" years  " + amount*20*yr/100);
		Double total= amount+(amount*20*yr/100);
		System.out.println("Total payable amount = "+total);	
		
	}
	
}
class FD extends Loans{
	void roi(double amount, int yr)
	{
		System.out.println("Total Interest for "+yr+" years  " + amount*10*yr/100);
		Double total= amount+(amount*10*yr/100);
		System.out.println("Total payable amount = "+total);	
		
	}
}
public class Bankexample {
	
	static Accounts[] acc=new Accounts[100];
	static int noOfAcc=1;
	FD obj=new FD();
	CA obj1=new CA();
	Bankexample(){
		acc[0]=new Accounts();
		acc[0].username="Default";
		acc[0].pin=1111;
		acc[0].accountType=0;
	}
	
	final void Options(int id)
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			
			
			System.out.println("1. Loans ");
			System.out.println("2. Deposit ");
			System.out.println("3. Deposit FD ");
			System.out.println("4. Statement");
			System.out.println("5. Exit");
			System.out.println("Enter a choice : ");
			choice=sc.nextInt();
			if(choice==1)
			{
					double amt;
					int yr;
					System.out.println("Enter the amount ");
					amt=sc.nextDouble();
					System.out.println("Enter the number of years ");
					yr=sc.nextInt();	
					System.out.println("\nDirect Loan Available...");
					System.out.println("ROI=  27% ");
					System.out.println("Total Interest for "+yr+" years 2  " + amt*27*yr/100);
					double total= amt+amt*27*yr/100; 
					System.out.println("Total payable amount = "+total);
					
				
				
						if(acc[id].fd==1)
						{
							System.out.println("\nFD Loan is available ");
							System.out.println("ROI=  10% ");
							//System.out.println("Enter the amount ");
							//amt=sc.nextDouble();
							if(amt>2*acc[id].fd_balance)
							{
								System.out.println("Amount Greater than twice the Balance..");
							}
							else
							{
							//System.out.println("Enter the number of years ");
							//yr=sc.nextInt();
							obj.roi(amt, yr);
							}
						}
						if(acc[id].accountType==2)
						{
						if(acc[id].balance>=20000)
						{
							System.out.println("\nCA Loan is available ");
							System.out.println("ROI=  20% ");
							/*System.out.println("Enter the amount ");
							amt=sc.nextDouble();
							System.out.println("Enter the number of years ");
							yr=sc.nextInt();*/
							obj1.roi(amt, yr);
						}
					}
			}
				
			
			else if(choice==2)
			{
				 double amt;
				if(acc[id].accountType==0)
					System.out.println("You don't have an account...");
				else
				{
					
					System.out.println("Enter the amount..");
					amt=sc.nextDouble();
					acc[id].deposit(amt);
				
				}
			}
			else if(choice==3)
			{
				if(acc[id].fd==1)
				{
					System.out.println("You already have FD deposit");
				}
				else
				{
					double amt;
					System.out.println("Enter the Deposit Amount : ");
					amt=sc.nextDouble();
					acc[id].fd_deposit(amt);
				}
			}
			else if(choice==4)
			{
				System.out.println(" UserName = " + acc[id].username);
				System.out.println(" Balance = " + acc[id].balance);
				System.out.println(" Account Type = " + acc[id].accountType);
				System.out.println(" FD = " + acc[id].fd);
				System.out.println(" FD Balance = " + acc[id].fd_balance);		
			}
			else if(choice==5)
			{
				System.out.println(" taata.... Have a nice Day");
			}
			else
			{
				System.out.println("Invalid Choice");
			}
			
		
	}while(choice!=5);
		
		sc.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int choice=2;
		String temp;
		int type,pin;
		
		Bankexample obj=new Bankexample();
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		do
		{
			System.out.println("1. Create account ");
			System.out.println("2. login ");
			System.out.println("3. Exit ");
			System.out.println("Enter a choice");
			
			choice=sc.nextInt();
			
			if(choice==1)
			{   acc[noOfAcc]=new Accounts();
				System.out.println("Enter the details...");
				System.out.println("Enter the UserName    		:  ");
				acc[noOfAcc].username=sc.next();
				System.out.println("Enter the PIN   (in digits) :  ");
				pin=sc.nextInt();
				int length = String.valueOf(pin).length();
				if(length!=4) {
					System.out.println("Pin must contain 4 digits");
					pin=rand.nextInt(8999)+1000;
					System.out.println("Generated PIN = "+pin);
					acc[noOfAcc].pin=pin;
				}
				else
					acc[noOfAcc].pin=pin;
				System.out.println("Enter the account Type      :  ");
				type=sc.nextInt();
				if(type>2||type<0) {
					System.out.println("Invalid type..");
					acc[noOfAcc].accountType=0;}
				else
					acc[noOfAcc].accountType=type;
				if(acc[noOfAcc].accountType!=0)
				{
					System.out.println("Enter the amount to deposit :");
					acc[noOfAcc].balance=sc.nextDouble();
				}
				System.out.println("Is using FD	?	(Y/N)	    :  ");
				temp=sc.next();
				if(temp.equals("Y")||temp.equals("y")){
					acc[noOfAcc].fd=1;
				System.out.println("Enter the FD amount         :");
				acc[noOfAcc].fd_balance=sc.nextDouble();
				
				}
				
				noOfAcc++;
				
			}
			else if(choice==2)
			{
				String username;
				int pin_number;
				int id=-1;
				do {
				System.out.println("Enter the UserName          : ");
				username=sc.next();
				for(int i=0;i<noOfAcc;i++)
				{
					if((acc[i].username).equals(username))
					{
						id=i;
						break;
					}
				}
				if(id==-1)
					System.out.println("UserName not Found...");
				else
				{
					System.out.println("Enter the Pin         : ");
					pin_number=sc.nextInt();
					if(pin_number==acc[id].pin)
					{
						System.out.println("Account Found..");
						obj.Options(id);
						break;
					}
					else {
						System.out.println("Incorrect PIN...");
						id=-1;
					}
				}
			}while(id==-1);
		}
				
			else if(choice==3)
				System.out.println("Taaata.... Have a Nice Day : D");
			else
				System.out.println("Incorrect Input...");
		}while(choice!=3);
		
		sc.close();

	}

}
