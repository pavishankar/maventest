package com.nissan.trainingcorejava;

public class Stringmethods {

	public static void main(String[] args) {
		String s="Nissan";
		char c=s.charAt(4);   // character at index 4
		System.out.println(c);
		
		int len=s.length();   // Returns String length
		System.out.println("length of string is : "+len);
		
		String ns=String.format("Name is \" %s ", s+"\"");  // used to format a string
		System.out.println("Formatted String is "+ns+"");
		
		System.out.println("Substring between 2 & 4 is \" "+s.substring(2, 4)+"\"");

		System.out.println("Substring from 3  is \" "+s.substring(3)+"\"");
		

	}

}
