package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Prompting user for information
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.print("Enter your hours worked: ");
        double hoursWorked = Double.parseDouble(myScanner.nextLine());
        System.out.print("Enter your pay rate: ");
        double payrate = Double.parseDouble(myScanner.nextLine());

        //Calculating gross pay
        double grossPay = hoursWorked * payrate;

        // + Optional work
        double otPayrate = 0;

        if(hoursWorked > 40 ){
            double otHours = hoursWorked - 40;
            otPayrate = (40 * payrate) + otHours * (payrate * 1.5);
            System.out.println("Hello " + name + "! Your gross pay is: " + otPayrate + " with overtime!");
        }
        else {
            //Displaying info
            System.out.println("Hello " + name + "! Your gross pay is: " + grossPay);
        }
    }
}
