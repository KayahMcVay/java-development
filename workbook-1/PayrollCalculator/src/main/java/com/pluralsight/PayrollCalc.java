package com.pluralsight;

import java.util.Scanner; 

public class PayrollCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.next();

        System.out.print("Enter hours worked: ");
        float userHours= scanner.nextFloat();

        System.out.print("Enter pay/hr: ");
        float userPayRate = scanner.nextFloat();

        float grossPay = (userPayRate * userHours);

        System.out.println(userName + "'s Gross Pay is: $" + grossPay);


    }
}
