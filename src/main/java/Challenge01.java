/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brian Reed
 */

import java.util.Scanner;

public class Challenge01 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //do while loop so code keeps running unless given stop flag
        //Prompt user for input
        //Scan command line for input string and save
        //Output the string and string length
        int flag = 0;
        do{
            System.out.print("What is the input string? ");
            String string = scan.nextLine();
            if(string.length()==0){
                System.out.print("Please enter a string.\n");
            }
            else{
                System.out.println(string + " has " + string.length() + " characters.");
                flag = 1;
            }
        }while(flag == 0);
    }
}