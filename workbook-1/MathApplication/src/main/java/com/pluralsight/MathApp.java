package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: //

        int bobSalary = 120_456;
        int garySalary = 250_987;
        int highestSalary = Math.max(bobSalary, garySalary);

        //System.out.println("The highest value salary is: " + highestSalary);

        // Question 2: //

        double carPrice = 30_000.90;
        double truckPrice = 80_000.25;
        double smallestPrice = Math.min(carPrice,truckPrice);

        //System.out.println("The Smallest value price is: " + smallestPrice);

        // Question 3: //

        double circleRadius = 7.25;
        double pieNum = 3.14;
        double circleArea = pieNum * (Math.pow(7.25,2));

        //System.out.println("The area of circle is: " + circleArea);

        // Question 4: //

        double  num = 5.0;
        double squareRoot = Math.sqrt(num);

        //System.out.println("The Square Root of " + num + " is " + squareRoot);

        // Question 5: //

        int xOne = 5;
        int yOne = 10;
        int xTwo = 85;
        int yTwo = 50;
        double distance = Math.sqrt((Math.pow((xTwo-xOne),2)) + (Math.pow((yTwo - yOne),2)));

        // System.out.println("The distance between (5,10) and (85,50) is: " + distance);

        // Question 6: //

        double number = -3.8;
        double absoluteValue = Math.abs(number);

        //System.out.println("The absolute value of -3.8 is: " + absoluteValue);

        // Question 7: //

        double randomNumber = Math.random();

        //System.out.println("A random number between 0 and 1: " + randomNumber);



    }
}
