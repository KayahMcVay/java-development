
 import java.io.File;
 import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("1: Goldilocks");
        System.out.println("2: Mary Had a Little Lamb");
        System.out.println("3: Hansel and Gretel");

        System.out.print("Given the list above enter the number " +
                "that correlates with the story you'd like to read: ");

        int userStory = scanner.nextInt();

        File file = new File("random.txt");
        File file1 = new File("goldilocks.txt");
        File file2 = new File("mary_had_a_little_lamb.txt");
        File file3 = new File("hansel_and_gretel.txt");

        if (userStory == 1){

            file = file1;

        } else if (userStory == 2){

            file = file2;

        } else if (userStory == 3) {

            file = file3;

        } else {
            System.out.println("Invalid Input, Try Again!");
        }

        try {
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {   
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("File not found!"); 
        }
    }

}
