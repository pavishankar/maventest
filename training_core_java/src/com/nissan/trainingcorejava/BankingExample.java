package com.nissan.trainingcorejava;

import java.util.Random;
import java.util.Scanner;

interface Accounts_Main{
	abstract void changePin( int newpin);
	abstract void deposit(double amt,int type);

}

final class Accountss implements Accounts_Main{
	StringBuffer name;
	StringBuffer phone;
	StringBuffer mail;
	StringBuffer addr;
	int pin,accNo,counter;
	Double type_bal[][]=new Double[2][4];
	Accountss()
	{
		accNo=1000;
		for(int i=0;i<4;i++)
		{
			type_bal[0][i]=0.0;		// Initializing all accounts and balance to 0
			type_bal[1][i]=0.0;
		}

	}
	public void deposit( double amt, int type)
	{
		this.type_bal[1][type]+=amt;
	}
	public void changePin(int newpin)
	{
		this.pin=newpin;
	}	


}
public class BankingExample {
	
	static Accountss ob[]=new Accountss[100];
	static int noAcc=0;

	static final void Options( int id) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do
		{
			
			
			System.out.println("1. Create Account ");
			System.out.println("2. Edit Details ");
			System.out.println("3. Balance and Statement");
			System.out.println("4. Change Pin");
			System.out.println("5. Exit");
			System.out.println("Enter a choice : ");
			choice=sc.nextInt();
			sc.nextLine();
			if(choice==1)
			{
				int op=1;
				int choices=0;
				if(ob[id].type_bal[0][0]==0)  // Checking if basic account exist or not
				{
					System.out.println("1. Basic Account");
					System.out.println("\n Enter a choice   : ");
					choices=sc.nextInt();
					if(choices!=1)
					{
						System.out.println("Invalid Choice..");
					}
					else
					{
						double bal;
						ob[id].type_bal[0][0]=1.0;
						while(true) {
						System.out.println("\n Account Created. Enter the amount to deposit (Minimum 1000)");
						bal=sc.nextDouble();
						
						if(bal<1000)
							System.out.println("You need to deposit minimum Rs.1000");
						else{					
							ob[id].type_bal[1][0]=bal;
							System.out.println(" Successfully Deposited Rs."+bal+"\n Current Balance :"+ob[id].type_bal[1][0]);
							break;
							}
						}
					}
					
				}
				
				else  // if basic account already exist
				{
						int flag=0;
						Integer temp[]=new Integer[5];
						
						if(ob[id].type_bal[0][1]==0) {			// checking for accounts which are not yet created
						System.out.println(op+". Current Account");
						temp[op]=1;
						op++;
						
						flag=1;
						}
						if(ob[id].type_bal[0][2]==0) {
							System.out.println(op+". FD Account");
							temp[op]=2;
							op++;
							flag=1;
							
						}
						if(ob[id].type_bal[0][3]==0) {
							System.out.println(op+". Recurring Account");
							temp[op]=3;
							
							flag=1;
							
						}
						if(flag==0)  // One user can have maximum of one account of a particular type
							System.out.println("You Already Have All Accounts. No more accounts allowed.");
						else {
							System.out.println("Enter a choice :");
							choices=sc.nextInt();
							if(choices<=op) {
							int ch=temp[choices];
							double bal;
							ob[id].type_bal[0][ch]=1.0;
							
							if(ch==2)  //If FD account minimum amount should be maintained
							{
								
								while(true) {
								 System.out.println("\n FD Account Created. Enter the amount to deposit (Minimum Rs.10000) ");
								 bal=sc.nextDouble();
								
								 if(bal<10000)
								 	System.out.println("You need to deposit minimum Rs.10000");
								 else{					
									break;
									}
								 }
								
							}
							else
							{
								while(true) {
								System.out.println("\n  Account Created. Enter the amount to deposit ");
								 bal=sc.nextDouble();
								 if(bal<0)
									 	System.out.println("Amount cannot be less than 0");
									 else{					
										break;
										}
									 }
							}
							ob[id].type_bal[1][ch]=bal;
							System.out.println(" Successfully Deposited Rs."+bal+"\n Current Balance :"+ob[id].type_bal[1][ch]);
							
							
							}
						}
				}
				
				
			}
			else if(choice==2)
			{
				int choices;
				System.out.println("1. Phone Number ");
				System.out.println("2. Address ");
				System.out.println("3. Email ");
				System.out.println("Enter a choice :");
				choices=sc.nextInt();
				sc.nextLine();
				if(choices==1)
				{
					System.out.println("Enter the new Phone Number : ");
					String phone=sc.next();
					int flag=1;
					do {
						flag=1;
						if(phone.length()!=10)  //Phone number must contain 10 digits
						{
							
							System.out.println("Phone Number Must Contains 10 digit.. Enter a new Number");
							phone=sc.next();
							flag=0;
							
						}
						else  // checking whether phone number is already used
						for(int i=0;i<noAcc;i++)
							if(ob[i].phone.toString().equals(phone))
							{
								System.out.println("Phone Number Already Exists.. Enter a new Number");
								phone=sc.next();
								flag=0;
								break;
							}
						
					}while(flag!=1);
					ob[id].phone=new StringBuffer(phone);
				}
				else if(choices==2)
				{
					System.out.println("Enter the new Address");
					ob[id].addr=new StringBuffer(sc.nextLine());
					sc.nextLine();
					
				}
				else if(choices==3) {
					System.out.println("Enter the New Mail  Address : ");
					String mail=sc.next();
					int flag=1;
					do {
						
						if(!mail.contains("@")||!mail.contains("."))  // every mail id must contain '@' and '.'
						{
							System.out.println("Not a valid Email ID.. Enter a new Mail ID");
							mail=sc.next();
							flag=0;	
						}
						else
						for(int i=0;i<noAcc;i++)
							if(ob[i].mail.toString().equals(mail))
							{
								System.out.println("Mail ID Already Exists.. Enter a new Mail ID");
								mail=sc.next();
								flag=0;
								break;
							}
						
					}while(flag!=1);
					ob[id].mail=new StringBuffer(mail);		
				}
				else
				{
					System.out.println("Enter a valid Choice..");
				}
				
			}
			else if(choice==3)
			{
				
				if(ob[id].type_bal[0][0]==0)  //Having no basic account means no account is created for the user
				{
					System.out.println("You Have No Active Account.. Create an Account First");
				}
				else
				{
					
					Integer temp[]=new Integer[5];
					int op=1;
					System.out.println(op+". Basic Account");
					System.out.println("\n Balance is :  " +ob[id].type_bal[1][0]);  //Balance of basic Account
					temp[op]=0;
					op++;
					
					if(ob[id].type_bal[0][1]==1) {     //Balance of current Account if it exists
					System.out.println(op+". Current Account");
					System.out.println("\n Balance is :  " +ob[id].type_bal[1][1]);
					temp[op]=1;
					op++;
					
					
					}
					if(ob[id].type_bal[0][2]==1) {		//Balance of FD Account if it exists
						System.out.println(op+". FD Account");
						System.out.println("\n Balance is :  " +ob[id].type_bal[1][2]);
						temp[op]=2;
						op++;
					
						
					}
					if(ob[id].type_bal[0][3]==1) {		//Balance of Recurring Account if it exists
						System.out.println(op+". Recurring Account");
						System.out.println("\n Balance is :  " +ob[id].type_bal[1][3]);
						temp[op]=3;
						
						
					}
					System.out.println("Select an account to deposit.. Enter 5 to exit");
					int acc=sc.nextInt();
					if(acc<=op)
					{
						if(temp[acc]==3) // If recurring account is selected
						{
							System.out.println("Recurring Account.. Rs.100 will be transferred from Normal account to recurring account");
							System.out.println("\n Do you want to continue?? (Y/N)");
							String ch=sc.next();
							if((ch.equals("Y")||ch.equals("y") )&&ob[id].type_bal[1][0]>=100)
							{
								ob[id].counter++;
								System.out.println("Enter the amount to deposit");
								double amt=sc.nextDouble();
								ob[id].deposit(amt+100,temp[acc]);	
								ob[id].type_bal[1][0]-=100;
								if(ob[id].type_bal[1][0]<1000)
									System.out.println("Minimum balance should be maintained in normal account..");
								System.out.println("New Balance is : "+ ob[id].type_bal[1][temp[acc]]);
								System.out.println("New Balance in Normal account : "+ ob[id].type_bal[1][0]);
							}
							else if(ob[id].type_bal[1][0]<100)
							{
								System.out.println("Not Enough Balance. Transaction Failed");
							}
						}
						else
						{
							System.out.println("Enter the amount to deposit");
							double amt=sc.nextDouble();
							ob[id].deposit(amt,temp[acc]);
							System.out.println("New Balance is : "+ ob[id].type_bal[1][temp[acc]]);
						}
						
					}
					
				}

			}
			else if(choice==4)
			{
				System.out.println("Enter the current pin:");
				int cpin=sc.nextInt();
				if(ob[id].pin!=cpin)
				{
					System.out.println("Incorrect Pin");
				}
				else
				{
					do {
					System.out.println("Enter the new PIN");
					Integer npin=sc.nextInt();
					if(npin.toString().length()!=4)
					{
						System.out.println("Pin must contain 4 digits");
					}
					else {	
						System.out.println("Confirm the new PIN");
						if(npin==sc.nextInt())
						{
							ob[id].changePin(npin);
							break;
						}
						else
						{
							System.out.println("PIN mismatch");
						}
						}
					}while(true);
				}
			}
			else
			{
				break;
			}
					
		}while(choice!=5);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice=0;
		int pin;
		
		
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		do
		{
			System.out.println("1. Create User ");
			System.out.println("2. Login ");
			System.out.println("3. Exit ");
			System.out.println("Enter a choice : ");
			choice=sc.nextInt();
			//sc.nextLine();
			if(choice==1)
			{
				String name,phone,mail,lname;
				ob[noAcc]=new Accountss();
				System.out.println("Enter the details...");
				System.out.println("Enter the Name   		:  ");
				name=sc.next();
				if(noAcc!=0)
				{
					for(int i=0;i<noAcc;i++)
					{
						if(ob[i].name.toString().equals(name))
						{
							System.out.println("\n Enter your Last Name  :");
							lname=sc.next();
							name=name+lname;
							break;
						}
					}
				}
				ob[noAcc].name=new StringBuffer(name);
				System.out.println("Enter the Phone Number : ");
				phone=sc.next();
				int flag=1;
				do {
					flag=1;
					if(phone.length()!=10)
					{
						
						System.out.println("Phone Number Must Contains 10 digit.. Enter a new Number");
						phone=sc.next();
						flag=0;
						
					}
					else
					for(int i=0;i<noAcc;i++)
						if(ob[i].phone.toString().equals(phone))
						{
							System.out.println("Phone Number Already Exists.. Enter a new Number");
							phone=sc.next();
							flag=0;
							break;
						}
					
				}while(flag!=1);
				ob[noAcc].phone=new StringBuffer(phone);
				System.out.println("Enter the Mail  : ");
				mail=sc.next();
				
				do {
					flag=1;
					if(!mail.contains("@")||!mail.contains("."))
					{
						System.out.println("Not a valid Email ID.. Enter a new Mail ID");
						mail=sc.next();
						flag=0;	
					}
					else
					for(int i=0;i<noAcc;i++)
						if(ob[i].mail.toString().equals(mail))
						{
							System.out.println("Mail ID Already Exists.. Enter a new Mail ID");
							mail=sc.next();
							flag=0;
							break;
						}
					
				}while(flag!=1);
				ob[noAcc].mail=new StringBuffer(mail);			
				System.out.println("Enter the Address  : ");
				ob[noAcc].addr=new StringBuffer(sc.nextLine());
				sc.nextLine();
				ob[noAcc].accNo+=noAcc;
				System.out.println("Account Number is : "+ob[noAcc].accNo);
				pin=rand.nextInt(8999)+1000;
				System.out.println("Generated PIN = "+pin);
				ob[noAcc].pin=pin;
				noAcc++;
				
				
			}
			else if(choice==2)
			{
				int pin_number;
				int id=-1;
				//do{
				System.out.println("Enter the Account Number          : ");
				int accNo=sc.nextInt();
				for(int i=0;i<noAcc;i++)
				{
					if((ob[i].accNo)==accNo)
					{
						id=i;
						break;
					}
				}
				if(id==-1)
					System.out.println("Account not Found...");
				else
				{
					System.out.println("Enter the Pin         : ");
					pin_number=sc.nextInt();
					if(pin_number==ob[id].pin)
					{
						System.out.println("Account Found..");
						Options(id);
						
					}
					else {
						System.out.println("Incorrect PIN...");
						id=-1;
					}
				}
			//}while(id!=-1);
			}
			else if(choice==3)
			{
				System.out.println("Have a nice Day :D");
			}
			else
			{
				System.out.println("Invalid Choice...");
			}

		}while(choice!=3);
		sc.close();
	}

}
