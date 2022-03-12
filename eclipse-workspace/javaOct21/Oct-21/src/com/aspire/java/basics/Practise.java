package com.aspire.java.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Practise
{
public static void main(String[] args)
{
	System.out.println("Program start");
	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,3,4,5,6,7,8,9};
	
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++)
		
	{
	 
		if(a[i]%2==0)
		{
			
			System.out.println("even value"+a[i]);
		}
		else
		{
			System.out.println("odd value"+a[i]);
		}
	}
		
	}
}

