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

        calculatePayrate(name, hoursWorked, payrate);
    }

    //Calculating gross pay
    public static double calculateGrossPay(double hoursWorked, double payrate) {
        return hoursWorked * payrate;
    }

    public static void calculatePayrate(String name, double hoursWorked, double payrate) {
        double otPayrate;

        // Calculating OT
        if (hoursWorked > 40) { //Displaying info with OT
            double otHours = hoursWorked - 40;
            otPayrate = (40 * payrate) + otHours * (payrate * 1.5);
            System.out.println("Hello " + name + "! Your gross pay is: " + otPayrate + " with overtime!");

        } else { //Displaying info with no OT
            System.out.println("Hello " + name + "! Your gross pay is: " + calculateGrossPay(hoursWorked, payrate));
        }
    }
}
