import java.io.BufferedReader;
import java.io.FileReader;

public class PayrollCalc {
    public static void main(String[] args) {

        try{

            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"));

            String line;

            while ((line  = bufferedReader.readLine()) !=null){

                String [] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                System.out.printf("Employee ID: %d | Name: %s | Gross Pay: $%.2f%n", employee.getEmployeeId(),
                        employee.getName(), employee.calculateGrossPay(employee.getHoursWorked(), employee.getPayRate()));


            }

            bufferedReader.close();

        } catch (Exception e) {

            System.out.println("Unable to read file!");

        }


    }
}
