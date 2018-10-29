package com.nissan.trainingcorejava;

public class Stringbufferclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Nissan");
		System.out.println(sb);
		sb.append(" Digital");
		System.out.println(sb);
		sb.replace(7, sb.length(), "TVM");
		System.out.println(sb);
		sb.delete(6,sb.length());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());

	}

}
