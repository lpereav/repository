package com.hackerrank.practices;

import java.util.Scanner;

import com.hackerrank.practices.clases.Practice1;

public class Solution implements Practice1 {
	
	/**
	 * Day 1: Data Types
	 * @param args
	 */
	public static void main (String [] args){
		
		int i = 4;
		double d = 4.0;
		String s = "Hacker Rank";
		Scanner scan = new Scanner(System.in);
		
        /* Declare second integer, double, and String variables. */
        int inputInt = 0;
        double inputDouble = 0;
        String inputString = "";
        /* Read and save an integer, double, and String to your variables.*/
        inputInt = Integer.parseInt(scan.next());
        scan.nextLine();
        inputDouble = Double.parseDouble(scan.next());
        scan.nextLine();
        inputString = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.        
        /* Print the sum of both integer variables on a new line. */
        int r1 =  i + inputInt;
        System.out.println("Sum of integers " + r1);
        /* Print the sum of the double variables on a new line. */
        double r2 = d + inputDouble;
		System.out.println("Sum of double " + r2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println("Sum of strings " + s.concat(" " + inputString));
        
        scan.close();
	}

}
