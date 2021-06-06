package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 21 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);


        System.out.print("Please enter the number of the month: ");
        int monthNum = in.nextInt();

        String monthString = "default";
        switch (monthNum) {
            case 1 -> monthString = "January";
            case 2 -> monthString = "February";
            case 3 -> monthString = "March";
            case 4 -> monthString = "April";
            case 5 -> monthString = "May";
            case 6 -> monthString = "June";
            case 7 -> monthString = "July";
            case 8 -> monthString = "August";
            case 9 -> monthString = "September";
            case 10 -> monthString = "October";
            case 11 -> monthString = "November";
            case 12 -> monthString = "December";
            default -> {
                System.out.println("Please try again and enter a number within the range 1-12.");
                System.exit(1);
            }
        }

        System.out.printf("The name of the month is %s.", monthString);
    }
}
