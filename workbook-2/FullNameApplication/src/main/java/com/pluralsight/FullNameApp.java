package com.pluralsight;

import java.util.Scanner;

public class FullNameApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");

        String firstName = scanner.nextLine().trim(); 

        System.out.print("Enter your middle name: ");

        String middleName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");

        String lastName = scanner.nextLine().trim();

        System.out.print("Enter your suffix name: ");

        String suffix = scanner.nextLine().trim();

        if (middleName.isEmpty() && !suffix.isEmpty()) {

            System.out.println("Full Name: " + firstName + " " + lastName + ", "  + suffix);



        } else if (!middleName.isEmpty() && suffix.isEmpty()) {

            System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);



        } else if (middleName.isEmpty() && suffix.isEmpty()) {


            System.out.println("Full Name: " + firstName + " " + lastName);


        } else {

            System.out.println("Full Name: " + firstName + " " + middleName + " "
                    + lastName + ", " + suffix);

        }

        scanner.close();


    }
}
