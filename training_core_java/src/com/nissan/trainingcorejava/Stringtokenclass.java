package com.nissan.trainingcorejava;

import java.util.StringTokenizer;

public class Stringtokenclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer("My,name,is,Nissan",",");  // creates tokens by removing specified delimiter
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
