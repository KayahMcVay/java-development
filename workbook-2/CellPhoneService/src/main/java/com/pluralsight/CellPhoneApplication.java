package com.pluralsight;

import java.util.Scanner; 

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();

        System.out.print("What is your serial number?: ");

        int serialNumber = scanner.nextInt();

        cellPhone.setSerialNumber(serialNumber);

        scanner.nextLine();

        System.out.print("What model is your phone?: ");

        String model = scanner.nextLine();

        cellPhone.setModel(model);

        System.out.print("What is your phone carrier?: ");

        String carrier = scanner.nextLine();

        cellPhone.setCarrier(carrier);

        System.out.print("What is your phone number?: ");

        String phoneNumber = scanner.nextLine();

        cellPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the primary owner of your phone?: ");

        String owner = scanner.nextLine();

        cellPhone.setOwner(owner);

        scanner.close();

        System.out.println("Serial Number: " + cellPhone.getSerialNumber());

        System.out.println("Model: " + cellPhone.getModel());

        System.out.println("Carrier: " + cellPhone.getCarrier());

        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());

        System.out.println("Owner: " + cellPhone.getOwner());


    }


}
