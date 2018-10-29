package com.nissan.trainingcorejava;
import java.math.*;
import java.util.Scanner;

public class Stringclass {

	public static void main(String[] args) {
		
		String s[]= new String[100];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit :");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the strings  : ");
			s[i]=new String();
			s[i]=sc.next();
		}
		
		for(int i=0;i<n;i++)
		{
			int len=s[i].length();
			System.out.println("Original String :"+ s[i]);
			int index=(Math.abs(len-i))/len;
			System.out.println("Character at "+index +" position " + s[i].charAt(index));
			char s1=s[i].charAt(0);
			System.out.println("String after adding  first letter  to last  :"+String.format("%s"+s1,s ));
			System.out.println("Substring from "+index+" to "+len+" is :"+s[i].substring(index, len) );
		}
		
		// TODO Auto-generated method stub

	}

}
