package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");

        String userFullName = scanner.nextLine().trim();

        int space = userFullName.indexOf(" ");

        String firstName = userFullName.substring(0, space);

        String lastName = userFullName.substring(space + 1);

        System.out.print("Enter Data of Show: ");  

        String userReservationDate = scanner.nextLine();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate reservationDate = LocalDate.parse(userReservationDate, dateFormatter);

        System.out.print("Enter Number of Tickets You wish to purchase: ");

        int userTicketNum = scanner.nextInt();

        if (userTicketNum > 1) {

            System.out.println(userTicketNum + " tickets reserved for " + reservationDate + " under " + lastName + ", " + firstName);
        } else {

            System.out.println(userTicketNum + " ticket reserved for " +  reservationDate + " under " + lastName + ", " + firstName);

        }
    }
}
