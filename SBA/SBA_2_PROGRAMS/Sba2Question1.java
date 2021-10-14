package com.ust.test;
import java.util.Scanner;
public class Sba2Question1 
 {
  public static void main(String[] args)  
   {  
	Scanner sc= new Scanner(System.in);  
	System.out.println("Enter the string : ");  
	String str= sc.nextLine();
	String rev="";
	char ch;
	System.out.println("\nThe string is : "+str); 
	System.out.println("\n***STRING REVERSAL***");
	for (int i=0; i<str.length(); i++)
    {
      ch= str.charAt(i); //extracts each character
      rev= ch+rev; //adds each character in front of the existing string
    }
	 System.out.println("\nThe reversed string is "+rev);
	 sc.close();
   }  
}
