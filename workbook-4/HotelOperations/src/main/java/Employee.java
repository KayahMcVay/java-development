public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double regularHours;
    private double overtimeHours;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked, double totalPay, double regularHours, double overtimeHours) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {

        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
     }

    public double getRegularHours() {

        if (hoursWorked <= 40){

            return hoursWorked;

        } else {

            return 40;

        }
    }

    public double getOvertimeHours() {

        if(hoursWorked > 40){

            return hoursWorked - 40;

        } else {

            return 0;

        }

    }

}