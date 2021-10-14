package com.ust.test;

import java.util.Scanner;

public class SbaQuestion4 
{
  public static void main(String[] args)
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of elements :-");
	  int num= sc.nextInt();
	  int[] arr= new int[num];
	  int sum=0;
	  System.out.println("Enter the even numbers :- ");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];	
			}
			else
			{
				continue;
			}
		}
		System.out.println("The sum of all even numbers are :- "+sum);
		sc.close();
   }
}
