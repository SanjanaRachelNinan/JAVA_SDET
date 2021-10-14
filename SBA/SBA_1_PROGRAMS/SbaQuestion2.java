package com.ust.test;
import java.util.Scanner;
public class SbaQuestion2 
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements :-");
	int num= sc.nextInt();
	int[] arr= new int[num];
	int sum=0;
	System.out.println("Enter the elements (Positive or Negative) :- ");
	for(int i=0;i<num;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("The elements are :- ");
	for(int i=0;i<num;i++)
	{
		System.out.println(+arr[i]);
	}
	System.out.println("Calculating the sum of all positive numbers....");
	for(int i=0;i<num;i++)
	{
		if(arr[i]>0)
		{
			sum+=arr[i];
		}
	}
	System.out.println("The sum of all positive numbers are :- "+sum);	
	sc.close();
 }

}
