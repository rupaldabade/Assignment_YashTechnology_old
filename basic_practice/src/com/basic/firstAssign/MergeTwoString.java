package com.basic.firstAssign;

import java.util.Scanner;

//1) Create a program in which two string is input by the user and after that user will enter index in 
//first string where we want to insert the second string and insert the second string at that index 
//and create a new string
public class MergeTwoString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first string- ");  
		String first= sc.next();  
		System.out.print("Enter second string- ");  
		String second= sc.next();  
		System.out.println("Second string start from index 1 to "+first.length()+" provide your index -");
		int index= sc.nextInt();  
		String newStr ="";
		char[] firstChar = first.toCharArray();
		for(int i=0; i<firstChar.length; i++) {
			if(i==(index)) {
				newStr = newStr + second;
			}
			newStr = newStr+firstChar[i];
		}
		System.out.print("New creaded string- "+newStr);  
	}
}
