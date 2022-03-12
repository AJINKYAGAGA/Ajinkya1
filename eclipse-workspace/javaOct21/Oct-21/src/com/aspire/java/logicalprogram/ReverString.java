package com.aspire.java.logicalprogram;

public class ReverString 
{
public static void main(String[] args)
{
	String s="Vighnahar";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
}
}
