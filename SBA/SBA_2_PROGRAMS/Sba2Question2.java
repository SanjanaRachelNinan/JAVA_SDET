package com.ust.test;

import java.util.Scanner;

public class Sba2Question2 
{
	public static void main(String[] args)  
	   { 
		Scanner in = new Scanner(System.in);
		System.out.println("The program shows the usage of contains(), length(), replace(), concat(), equals()");
		
		String str1 = "My name is Sanjana Rachel Ninan";
		String str2 = "Summer";
		String str3 = "Winter";
		
		//contains()
		
		System.out.println("\n***Usage of contains()***");
		System.out.println("Is *name is Sanjana* present in the string ? "+str1.contains("name is Sanjana"));//Checks if "name is Sanjana" is present in the string
		System.out.println("Is *Ninan#.* present in the string ? "+str1.contains("Ninan#."));//Checks if "Ninan#." is present in the string

		//length()
		
		System.out.println("\n***Usage of length()***");
		System.out.println("Length of the string is : "+str1.length());//Gives the length of the string
		
		//replace()
		
		System.out.println("\n***Usage of replace()***");
		String replaceString=str2.replace('m','x');
  	    System.out.println("The replaced string (str2 = Summer) is : "+replaceString);//Replaces all m with x
  	    String replaceString2=str3.replace("ter","ddd");
	    System.out.println("The replaced string (str3 = Winter) is : "+replaceString2);//Replaces ter with ddd
	    
	    //concat()
	    
	    System.out.println("\n***Usage of concat()***");
	    String concatString=str2.concat(str3);
	    System.out.println("The concatenated string is : "+concatString);//Concatenates str2 and str3
	    
	    //equals()
	    
	    System.out.println("\n***Usage of equals()***");
	    System.out.println("The strings str2 and str3 are equal ? : "+str2.equals(str3));
	   }
}