package com.nissan.trainingcorejava;

import java.util.Scanner;

public class Customerstringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		StringBuffer sb[][]=new StringBuffer[100][100];
		int n;
		System.out.println("Enter the number of Customers  :");
		n=sc.nextInt();
		System.out.println("Enter the Name and Date of Birth of Customers..");
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Customer "+(i+1));
			System.out.println("\nName       :");
			sb[i][0]=new StringBuffer(sc.next());
			System.out.println("Day        :");
			sb[i][1]=new StringBuffer(sc.next());
			System.out.println("Month      :");
			sb[i][2]=new StringBuffer(sc.next());
			System.out.println("Year       :");
			sb[i][3]=new StringBuffer(sc.next());
			sb[i][1].append("-"+sb[i][2].toString()+"-"+sb[i][3].toString());
			sb[i][2].delete(0, sb[i][2].length());
			sb[i][3].setLength(0);
		}
		
		System.out.println("\n After Converting...");
		for(int i=0;i<n;i++)
		{
			System.out.println("Name       : "+(sb[i][0]));
			System.out.println("DOB        : "+sb[i][1]);
		}
		

	}

}
