package com.nissan.trainingcorejava;

import java.util.Scanner;

public class Stringassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		
		String s=new String();
		String s1,dl;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string..");
		s=sc.nextLine();
		
		if(s.isEmpty())
		{
			System.out.println("String is empty.. Enter string & delimiter to append");
			s1=sc.next();
			dl=sc.next();
			s=String.join(dl,s,s1);
			System.out.println(" New String is "+s);
			s.split(dl);
			System.out.println(s);
		}

	}

}
