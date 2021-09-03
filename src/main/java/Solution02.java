/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brian Reed
 */

import java.util.Scanner;

public class Solution02 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //Prompt user for input
        //Scan command line for input string and save
        //Output the string and string length
        System.out.print("What is the input string? ");
        String string = scan.nextLine();
        System.out.println(string + " has " + string.length() + " characters.");
    }
}
