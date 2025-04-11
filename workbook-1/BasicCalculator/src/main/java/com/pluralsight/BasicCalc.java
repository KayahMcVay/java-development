package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please Select an Option: ");
        String userOption = scanner.next();

        if (Objects.equals(userOption, "M")) {

            int product = (num1 * num2);
            System.out.println(product);
        } else{
            System.out.println("NOTE: Select (M) only for sake of exercise" );  
        }






    }
}
