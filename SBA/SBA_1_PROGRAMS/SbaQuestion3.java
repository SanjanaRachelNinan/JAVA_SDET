package com.ust.test;

public class SbaQuestion3 
{
 public static void main(String[] args)
 {
	 int i=0,num=2;
	 label1:
		 while(num<20)
		 {
			 i++;
			 if(num==10)
			 {	
				 break label1;
			 }
			 System.out.println("Number = "+num);
			 num+=2;
		 }
	 System.out.println("In iteration "+i+" the loop breaks");	 
 }
}
