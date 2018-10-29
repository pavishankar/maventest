package com.nissan.trainingcorejava;

public class Stringjoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=String.join("*","hello","world","how","are","you");
		System.out.println(s);
		
		
		String empty="";
		String notEmpty="  ";
		System.out.println(empty.isEmpty());
		System.out.println(notEmpty.isEmpty());

	}

}
