package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the principal: " );
        int principal = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double percentInterest = input.nextDouble();
        double interest = percentInterest / 100.0;
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        double investment = principal * (1 + (interest * years));
        double investRound = Math.round(investment * 100.0) / 100.0;
        System.out.print("After " + years + " years at " + percentInterest + "%, ");
        System.out.println("the investment will be worth $" + investRound + ".");

    }
}
