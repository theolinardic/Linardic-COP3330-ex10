/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 10 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex10;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args)
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double item1Price = userInputScanner.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int item1Quantity = userInputScanner.nextInt();
        System.out.print("Enter the price of item 2: ");
        double item2Price = userInputScanner.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int item2Quantity = userInputScanner.nextInt();
        System.out.print("Enter the price of item 3: ");
        double item3Price = userInputScanner.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int item3Quantity = userInputScanner.nextInt();

        double subtotal = ((item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Quantity * item3Price));
        double tax = subtotal * 0.055;
        double total = subtotal + tax;
        String finalTax = String.format("$%.2f", tax);
        String finalSubtotal = String.format("$%.2f", subtotal);
        String finalTotal = String.format("$%.2f", total);

        System.out.print("Subtotal: " + finalSubtotal + "\nTax: " + finalTax + "\nTotal: " + finalTotal);

    }
}
