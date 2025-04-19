package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {

    public static void main(String[] args) {

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create a new instance of CellPhone
        CellPhone cellPhone = new CellPhone();

        CellPhone cellPhone2 = new CellPhone();

        // Prompt user for cell phone information and set the properties
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline
        cellPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone.setOwner(owner);

        System.out.println("\n");

        // Prompt user for cell phone2 information and set the properties
        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();  // Read integer value
        cellPhone2.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        model = scanner.nextLine();  // Read entire line till newline
        cellPhone2.setModel(model);

        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        cellPhone2.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        cellPhone2.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        owner = scanner.nextLine();
        cellPhone2.setOwner(owner);

        // Close the scanner
        scanner.close();

        display(cellPhone);

        cellPhone.dial(cellPhone2.getPhoneNumber(), cellPhone.getOwner());

        display(cellPhone2);

        cellPhone2.dial(cellPhone.getPhoneNumber(), cellPhone2.getOwner());


    }

    public static void display(CellPhone cellPhone){

        // Display the properties of the phone using getters
        System.out.println("\nCellPhone Details:\n");
        System.out.println("Serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner()); 

    }


}
