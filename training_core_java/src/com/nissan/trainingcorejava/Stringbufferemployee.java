package com.nissan.trainingcorejava;

import java.util.Scanner;

public class Stringbufferemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// TODO Auto-generated method stub
				StringBuffer emp[]=new StringBuffer[100];
				String lastname= new String();
				Scanner sc= new Scanner(System.in);
				int n;
				System.out.println("Enter the number of Employees : ");
				n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					
					System.out.println("Enter the name of "+(i+1)+" Employee");
					emp[i]=new StringBuffer(sc.next());
				}
				
				String search=new String();
				System.out.println("Enter the Name to be Searched  :");
				search=sc.next();
				for(int i=0;i<n;i++)
				{
					if(emp[i].indexOf(search)==0 &&( emp[i].length()==search.length()))
					{
						System.out.println("Enter the last name for "+emp[i]+" At "+(i+1)+" position");
						lastname=sc.next();
						emp[i]=emp[i].append(" "+lastname);
					}
				}
				 for(int i=0;i<n;i++)
				 {
					 for(int j=0;j<n-i-1;j++)
					 {
						 if(emp[j].toString().compareTo((emp[j+1]).toString()) >0)
						 {
							 StringBuffer temp=emp[j];
							 emp[j]=emp[j+1];
							 emp[j+1]=temp;
						 }
					 }
				 }
				System.out.println(" Employee list after sorting...");
				for(int i=0;i<n;i++)
				{
					System.out.println(emp[i]);
				}
				
				sc.close();
			}



	}

