import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Payroll {

    public static void main(String[] args) {
        
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"));

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("new.csv"));

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                String employeeInfo = String.format("%d | %s | %.2f%n", employee.getEmployeeId(), employee.getName(), employee.calculateGrossPay(employee.getHoursWorked(), employee.getPayRate()));

                bufferedWriter.write(employeeInfo);

            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (Exception e) {

            System.out.println("Unable to read and/or write file!");
            e.getStackTrace();
        }
    }
}