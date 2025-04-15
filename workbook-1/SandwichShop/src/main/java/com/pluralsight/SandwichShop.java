package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        // Get User-Input on Sandwich Size:

        Scanner scanner = new Scanner(System.in);

        System.out.println("L: $5.45 & R: $8.95");

        System.out.print("What size sandwich do you want (L/R)?: ");

        String sandwichSize = scanner.nextLine();

        // Get User-Input on age;

        System.out.print("How old are you?: ");

        int userAge = scanner.nextInt();

        // Calculate Base Price:

        double regularPrice = 5.45;

        double largePrice2 = 8.95;

        if (sandwichSize.equalsIgnoreCase("r")){

            regularPrice = regularPrice;

        } else if (sandwichSize.equalsIgnoreCase("l")){

            regularPrice = largePrice2;
        }

        // Calculate discount:

        if (userAge <= 17){

            double discount1 = (0.10 * regularPrice);
            double finalPrice1 =  (regularPrice - discount1);

            System.out.printf("Your total is: %.2f%n", finalPrice1);

        } else if (userAge >= 65){

            double discount2 = (0.20 * regularPrice);

            double finalPrice2 = (regularPrice - discount2);

            System.out.printf("Your total is: %.2f%n", finalPrice2); 

        } else {

            System.out.printf("Your total is: %.2f%n", regularPrice);

        }


    }


}
