package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Prompting user for information using methods
        String name = getName(myScanner);

        double hoursWorked = getHoursWorked("Enter your hours worked: ", myScanner);

        double payrate = getHoursWorked("Enter your pay rate: ", myScanner);

        calculatePayrate(name, hoursWorked, payrate);
    }

    public static double getHoursWorked(String s, Scanner myScanner) {
        System.out.print(s);
        double hoursWorked = Double.parseDouble(myScanner.nextLine());
        return hoursWorked;
    }

    public static String getName(Scanner myScanner) {
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        return name;
    }

    //Calculating gross pay
    public static double calculateGrossPay(double hoursWorked, double payrate) {
        return hoursWorked * payrate;
    }

    // Payrate math with over time
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
