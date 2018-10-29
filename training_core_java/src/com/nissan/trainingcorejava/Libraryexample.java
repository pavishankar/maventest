package com.nissan.trainingcorejava;

import java.util.Scanner;

interface Login{
 void login();
 void admin();
}

public class Libraryexample {
	Scanner sc=new Scanner(System.in);
	static String books[][]=new String[20][4]; // Array in which first row stores name , second row stores total count
											  // third row stores remaining book and 4th row stores whether book is active or not
	static int limit=0;
	
	Login ob=new Login()
			{
		
		public void login()
		{
			do {
			System.out.println("\n 1.User");
			System.out.println("\n 2.Admin");
			System.out.println("\n 3.Exit");
			System.out.println("Enter a choice");
			int choice=sc.nextInt();
			if(choice==1)
				user(); //user method is invoked
			else if(choice==2)
			{
				System.out.println("Enter username and password :");
				String user=sc.next();
				String pass=sc.next();
				if(user.equals("admin") && pass.equals("admin")) //checking username and password
				{
					admin();
				}
				else
				{
					System.out.println("Username or password is incorrect");
				}
			
				
			}
			else if(choice==3) {
				System.out.println("taata. Have a nice day");
				break;
			}
			else
				System.out.println("Invalid Choice");
			}while(true);
				
			
		}
		void user()
		{
			int flag=0,op=1,temp[]=new int[30];
			if(limit==0)  //If limit=0 means no available books
				System.out.println("\n Sorry no books available");
			else {
			for(int i=0;i<limit;i++)
			{
				if(flag==0)
				{
					System.out.println("Books to return : \n");
					flag=1;
				}
				if(!books[1][i].equals(books[2][i]))  // All books user checked out with its count is printed
				{
					System.out.println(op+". "+books[0][i] + " ("+(Integer.parseInt(books[1][i])-Integer.parseInt(books[2][i]))+")");
					temp[op]=i;
				}
			}
			try {
			do {
				
			System.out.println("Enter a choice to return a book.. Enter 0 to continue ");
			int choice=sc.nextInt();
			
			if(choice!=0 && choice<=op) //If user choose a book to return
			{
				int ops=temp[choice];	
				System.out.println("\n Enter the number of books to return :");
				int no=sc.nextInt();
				if(no>(Integer.parseInt(books[1][ops])-Integer.parseInt(books[2][ops])) || no<=0) //If count is greater
				{
					System.out.println("\n You haven't checked out this number of books");
				}
				else
				{
				  books[2][ops]=""+(Integer.parseInt(books[2][ops])+no); // Count is updated
				}
				
			}
			else if(choice !=0)
				System.out.println("Invalid choice");
			else
				break;
			}while(true);
			
			flag=0;op=1;
			int tem[]=new int[30];
			for(int i=0;i<limit;i++)
			{
				if(flag==0)
				{
					System.out.println("Books available  : \n");
					flag=1;
				}
				if(!books[2][i].equals("0")&&!books[3][i].equals("N"))  //Displaying all available books with count
				{
					System.out.println(op+". "+books[0][i]+" ("+books[2][i]+")");
					tem[op]=i;
				}
			}
			do {
			System.out.println("Enter a choice to borrow a book.. Enter 0 to return ");
			int choice=sc.nextInt();
			if(choice!=0 && choice<=op)   //Reading the choice
			{
				int ops=temp[choice];	
				System.out.println("\n Enter the number of books to borrow :"); //Reading the count
				int no=sc.nextInt();
				if(no>(Integer.parseInt(books[2][ops])))
				{
					System.out.println("\n Enter a valid count");
				}
				else
				{
				  books[2][ops]=""+(Integer.parseInt(books[2][ops])-no); //updating count
				  System.out.println("Successfully borrowed "+books[0][ops]);
				}
			}
			else if(choice !=0)
				System.out.println("Invalid choice");
			else 
				break;
			}while(true);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Index out of bound");
			}
			catch(Exception e)
			{
				System.out.println("Exception"+e);
			}
		}
		}
		
		public void admin()
		{
			class Admin{
				void disp()
				{
					do {
					System.out.println("\n 1.Add Book");
					System.out.println("\n 2.Remove Book");
					System.out.println("\n 3.Update Book");
					System.out.println("\n 4.Exit");
					int choice=sc.nextInt();
					if(choice==1)
						add();
					else if(choice==2)
						remove();
					else if(choice==3)
						update();
					else if(choice==4)
						break;
					else
						System.out.println("Invalid Choice");				
					}while(true);
				}
				void add()
				{
					String name;
					int count;
					do {
					System.out.println("Enter the name of book and count");
					name=sc.next();
					count=sc.nextInt();
					if(count<0)
					{
						System.out.println("Count cannot be less than 0");
					}
					else break;
					}while(true);
					int flag=0;
					String auth="";
					for(int i=0;i<limit;i++)
					{
						if(books[0][i].equals(name)) //If already a book with same name exist user can either merge or add author name
						{
							
							System.out.println("Already book exist. do u want to merge ? (Y/N) ");
							String ch=sc.next();			
							if(ch.equals("N")||ch.equals("n"))
							{
								System.out.println("Enter shortform for author");
								auth=sc.next();
								break;	
								
							}
							else
							{
								flag=1;
								books[1][i]=""+((Integer.parseInt(books[1][i])+count));
								books[2][i]=""+((Integer.parseInt(books[2][i])+count));
								System.out.println("New Count is "+books[1][i]);
								books[3][i]="Y";
							}
						}
					}
					if(flag==0)
					{
						books[0][limit]=(name+" "+auth).trim();
						books[1][limit]=count+"";
						books[2][limit]=count+"";
						books[3][limit]="Y";
						limit++;
						System.out.println(books[0][limit-1] + " Successfully added");
						
					}
				}
				void remove()
				{
					try {
					int flag=0,op=1,tem[]=new int[100];
					for(int i=0;i<limit;i++)
					{
						if(flag==0)
						{
							System.out.println("Books available  : \n");
							flag=1;
						}
						if(!books[3][i].equals("N"))
						{
							System.out.println(op+"."+books[0][i]+" ("+books[2][i]+")");
							tem[op]=i;
						}
					}
					System.out.println("Enter a choice to remove.. Enter 0 to return ");
					int choice=sc.nextInt();
					if(choice!=0 && choice<=op)
					{
						books[3][tem[choice]]="N";
						System.out.println(books[0][tem[choice]]+" Successfully removed ");
					}
					else if(choice !=0)
						System.out.println("Invalid choice");
					
				}
					catch(ArrayIndexOutOfBoundsException e)
					{
						System.out.println("Array out of bound "+e);
					}
					catch(Exception e)
					{
						System.out.println("Exception occured "+e);
					}
			}
				void update()
				{
					
					try {
						int flag=0,op=1,tem[]=new int[100];
						for(int i=0;i<limit;i++)
						{
							if(flag==0)
							{
								System.out.println("Books available  : \n");
								flag=1;
							}

								System.out.println(op+". "+books[0][i]+" ("+books[2][i]+")");
								tem[op]=i;
							
						}
						System.out.println("Enter a choice to update.. Enter 0 to return ");
						int choice=sc.nextInt();
						if(choice!=0)
						{
							books[3][tem[choice]]="Y";  //status of updated book is changed to active
							System.out.println("Enter the new count");
							int count=sc.nextInt();
							books[1][tem[choice]]=""+count;
							System.out.println(books[0][tem[choice]]+" Successfully updated, New count = "+books[1][tem[choice]]);
						}
						else if(choice !=0)
							System.out.println("Invalid choice");
						
					}
						catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.println("Array out of bound "+e);
						}
						catch(Exception e)
						{
							System.out.println("Exception occured "+e);
						}
				}
			}
				
			Admin ob=new Admin();
			ob.disp();	
		}
		
		};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libraryexample obj=new Libraryexample();
		obj.ob.login(); // invoking login method

	}

}
